
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
                    intConvertedToChar[i] = (char)(binConvertToInt[i] +'0');
                    break;
                }
        }

        return intConvertedToChar;
    }

}

/*  static int computeHowManyCellHexArrayWillTake(int[] binArray){
int size = binArray.length / NIBBLE;
return size;
}
}*/
 