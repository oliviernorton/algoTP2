
public class TP2PartieC
{
    static final int NIBBLE = 4;
    static String mainCipher(String msg, String key, boolean isEncrypting)
    {
        char[] msgCharArray = msg.toCharArray();
        char[] keyCharArray = key.toCharArray();

        char[] rep = null;
        if(isEncrypting)
        {
            char[] binaryCipher = encryptXOR(msgCharArray, keyCharArray);
            rep = binaryCipher;
        }
        else
        {
            char[] binaryCipher = msgCharArray;           
            rep = decryptXOR(binaryCipher, keyCharArray);
        }
        String s = new String(rep);

        return s;
    }     

    static char[] encryptXOR(char[] charMsg, char[] charKey){
        char[] resultArray = TP2PartieB.convertCharArrayToBinary(charMsg);
        char[] resultKey = TP2PartieB.convertCharArrayToBinary(computeHowManyTimesCharWillBeRepeated(charKey,charMsg.length));
        
        for(int i = 0; i < resultArray.length;i++){
            if((resultArray[i] == '0' && resultKey[i] == '1') || (resultArray[i] == '1' && resultKey[i] == '0')){
                resultArray[i] = '1';
            }
            else{
                resultArray[i] = '0';
            }
        }

        return resultArray;
    }
    
    static char[] computeHowManyTimesCharWillBeRepeated(char[] charKey, int length){
        char[] charKeySameLength = new char[length];
        for(int i = 0 ; i < (length / charKey.length) + 1; i++){
            for(int j = 0 ; j < charKey.length; j++){
                if ((i*charKey.length + j) < length){
                    charKeySameLength[i * charKey.length + j] = charKey[j];
                }
            }
        }
        return charKeySameLength;
    }

    static char[] decryptXOR(char[] charMsg, char[] charKey){
        char[] resultKey = computeHowManyTimesCharWillBeRepeated(TP2PartieB.convertCharArrayToBinary(charKey),charMsg.length);
        for(int i = 0; i < charMsg.length;i++){
            if((charMsg[i] == '0' && resultKey[i] == '0')){
                charMsg[i] = '0';
            }
            else if(charMsg[i] == '1' && resultKey[i] == '1'){
                charMsg[i] = '0';
            }
            else if(charMsg[i] == '1' && resultKey[i] == '0'){
                charMsg[i] = '1';
            }
            else if(charMsg[i] == '0' && resultKey[i] == '1'){
                charMsg[i] = '1';
            }
        }
        char[] decryptedArray = TP2PartieB.convertBinaryToCharArray(charMsg);
        return decryptedArray;
    }  
}
 