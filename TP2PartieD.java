
public class TP2PartieD
{
    static final int NIBBLE = 4;
    static String mainCipher(String msg, String key, boolean isEncrypting)
    {
        char[] msgCharArray = msg.toCharArray();
        char[] keyCharArray = key.toCharArray();

        char[] rep = null;
        if(isEncrypting)
        {
            char[] binaryCipher = TP2PartieC.encryptXOR(msgCharArray, keyCharArray);
            rep = convertBinaryArrayToHexArray(binaryCipher);
        }
        else
        {
            //char[] binaryCipher = convertHexArrayToBinaryArray(msgCharArray);           
            //rep = TP2PartieC.decryptXOR(binaryCipher, keyCharArray);
        }
        String s = new String(rep);

        return s;
    }

    static char[] convertBinaryArrayToHexArray(char[] binaryArray){
        char[] binIntConvertToHex = new char[binaryArray.length / TP2PartieC.NIBBLE];
        
        char[] binarySequence = new char[TP2PartieC.NIBBLE];
        int[] binConvertToInt = new int[binaryArray.length / TP2PartieC.NIBBLE];
        for(int i = 0; i < binConvertToInt.length; i++){
            for(int j = 0; j < binarySequence.length; j++){
                binarySequence[j] = binaryArray[(TP2PartieC.NIBBLE*i)+j];
            }
            binConvertToInt[i] = TP2PartieA.convertFromBinaryToInt(binarySequence);
        }
        
        // for(int i = 0; i < arrayFinal.length;i++){
            // int j = 0;
            // while(j < binarySequence.length){
                // binarySequence[j] = binaryArray[(BIT_FOR_ONE_CHARACATER*i)+j];
                // j++;
            // }
            // arrayFinal[i] = TP2PartieA.convertBinaryToChar(binarySequence);
        // }
        
        
        int f = 0;
        for(int i = 0; i < binConvertToInt.length; i++){
            if(binConvertToInt[i] > 10){
                if(binConvertToInt[i] == 10){
                    binIntConvertToHex[i] = 'A';
                }
                else if(binConvertToInt[i] == 11){
                    binIntConvertToHex[i] ='B';
                }
                else if(binConvertToInt[i] == 12){
                    binIntConvertToHex[i] ='C';
                }
                else if(binConvertToInt[i] == 13){
                    binIntConvertToHex[i] ='D';
                }
                else if(binConvertToInt[i] == 14){
                    binIntConvertToHex[i] ='E';
                }
                else if(binConvertToInt[i] == 15){
                    binIntConvertToHex[i] ='F';
                }

            }
            else{
                //binIntConvertToHex[i] = transformASCII_CharToInt(binConvertToInt[i];
            }
            
        }
        
        return binIntConvertToHex;
    }
    
   
    
    static int computeHowManyCellHexArrayWillTake(int[] binArray){
        int size = binArray.length / NIBBLE;
        return size;
    }
}
 