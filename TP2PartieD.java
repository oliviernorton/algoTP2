
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
            char[] binaryCipher = convertHexArrayToBinaryArray(msgCharArray);           
            rep = TP2PartieC.decryptXOR(binaryCipher, keyCharArray);
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

        char[] intConvertedToChar = new char[binConvertToInt.length];

        for(int i = 0; i < intConvertedToChar.length; i++){
            switch(binConvertToInt[i]){
                case 10:
                    intConvertedToChar[i] = 'A';
                    break;
                case 11:
                    intConvertedToChar[i] = 'B';
                    break;
                case 12:
                    intConvertedToChar[i] = 'C';
                    break;
                case 13:
                    intConvertedToChar[i] = 'D';
                    break;
                case 14:
                    intConvertedToChar[i] = 'E';
                    break;
                case 15:
                    intConvertedToChar[i] = 'F';
                    break;
                default:
                    intConvertedToChar[i] = (char)(binConvertToInt[i] +'0');        //force int to char
                    break;
                }
        }

        return intConvertedToChar;
    }
    
    static char[] convertHexArrayToBinaryArray(char[] hexArray){
        int[] hexConvertedToInt = new int[hexArray.length];
        for(int i = 0; i < hexArray.length; i++){
            switch(hexArray[i]){
                case 'A':
                    hexConvertedToInt[i] = 10;
                    break;
                case 'B':
                    hexConvertedToInt[i] = 11;
                    break;
                case 'C':
                    hexConvertedToInt[i] = 12;
                    break;
                case 'D':
                    hexConvertedToInt[i] = 13;
                    break;
                case 'E':
                    hexConvertedToInt[i] = 14;
                    break;
                case 'F':
                    hexConvertedToInt[i] = 15;
                    break;
                default:
                    hexConvertedToInt[i] = hexArray[i] - 0x30;
                    break;
                }
        }
        
        char[] intConvertedToBin = new char[hexConvertedToInt.length * 2 * 8];
        char[] oneHex = new char[TP2PartieC.NIBBLE];
        for (int i = 0 ; i < hexConvertedToInt.length ; i++){
            oneHex = TP2PartieA.convertFromIntToBinary(hexConvertedToInt[i],TP2PartieC.NIBBLE);
            for (int j = 0 ; j < oneHex.length ; j++){
                intConvertedToBin[i * 4 + j] = oneHex[j];
            }
        }
        
        
        return intConvertedToBin;
    }
}
