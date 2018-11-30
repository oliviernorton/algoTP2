
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
        final int NIBBLE = 4;
        char[] resultArray = TP2PartieB.convertCharArrayToBinary(charMsg);
        char[] resultKey = TP2PartieB.convertCharArrayToBinary(charKey);

        for(int i = 0; i < resultArray.length;i++){
            if(resultArray[i] == '0' && resultKey[i] == '1' ||resultArray[i] == '1' && resultKey[i] == '0' ){
                resultArray[i] = '1';
            }
            else{
                    resultArray[i] = '0';

            }
        }
        TP2PartieB.convertBinaryToCharArray(resultArray);
        resultArray = new char[computeHowManyCellsHexArrayWillTake(resultArray)];
        for(int i = 0; i < resultArray.length;i++){
            if(resultArray[i] >= 10){
                resultArray[i] = 'A';
            }
            else if(resultArray[i] >= 11){
                resultArray[i] = 'B';
            }
            else if(resultArray[i] >= 12){
                resultArray[i] = 'C';
            }
            else if(resultArray[i] >= 13){
                resultArray[i] = 'D';
            }
            else if(resultArray[i] >= 14){
                resultArray[i] = 'E';
            }
            else if(resultArray[i] >= 15){
                resultArray[i] = 'F';
            }
            else if(resultArray[i] <= 9){
                resultArray[i] = resultArray[i];
            }
        }
        char[] returnedArray = new char[resultArray.length * 2];
        for(int i = 0; i < returnedArray.length; i++){
            returnedArray[i] = resultArray[i];
        }
        return returnedArray;
    }
    
    static int computeHowManyCellsHexArrayWillTake(char[] binArray){
        final int SIZE = binArray.length / 4;
        return SIZE;
    }


    static char[] decryptXOR(char[] charMsg, char[] charKey){
        return charMsg;
    }
}
 