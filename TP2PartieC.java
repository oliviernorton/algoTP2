
public class TP2PartieC
{
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
        char[] charConvertToBinary = new char[TP2PartieB.computeHowManyCellsBinaryArrayWillTake(charMsg)];
        charConvertToBinary = TP2PartieB.convertCharArrayToBinary(charMsg);
        char[] reConver
        for(int i = 0; i < charConvertToBinary.length;i++){
            int j = 0;
            while(j < charKey.length){
                if((charKey[j] + charConvertToBinary[j]) == 0){
                    charConvertToBinary[i] = '0';
                }
                else if((charKey[j] + charConvertToBinary[j]) == 1){
                    charConvertToBinary[i] = '1';
                }
                else if((charKey[j] + charConvertToBinary[j]) <= 2){
                    charConvertToBinary[i] = '0';
                    charConvertToBinary[i + 1] = '1';
                }
                j++;
            }
            j = 0;
            TP2PartieA.convertFromBinaryToInt(charConvertToBinary);
        }
        
        
        return charMsg;
    }
    
   
    
    
    
    static char[] decryptXOR(char[] charMsg, char[] charKey){
        return charMsg;
    }
}
             