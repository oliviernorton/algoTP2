
public class TP2PartieB
{
    static char[] convertCharArrayToBinary(char[] charArray){
        final int ONE_OCTET =  8;
        char[] arrayOfBinaryToPush = new char[ONE_OCTET]; 
        char[] arrayFinal = new char[computeHowManyCellsBinaryArrayWillTake(charArray)];
        for(int i = 0 ; i < charArray.length;i++){
            arrayOfBinaryToPush = TP2PartieA.convertCharToBinary(charArray[i]);
            for(int j = 0; j < arrayOfBinaryToPush.length; j++){
                arrayFinal[(i*ONE_OCTET)+j] = arrayOfBinaryToPush[j];
            }
        }
        return arrayFinal;
    }

    static int computeHowManyCellsBinaryArrayWillTake(char[] charArray){
        final int BIT_FOR_ONE_CHARACATER = 8;
        int result = 0;
        result = charArray.length;
        result = result * BIT_FOR_ONE_CHARACATER;
        return result;
    }

    static char[] convertBinaryToCharArray(char[] binaryArray){
        final int ONE_OCTET =  8;
        char[] binarySequence = new char[ONE_OCTET];
        char[] arrayFinal = new char[computeHowManyCellsCharArrayWillTake(binaryArray)];

        for(int i = 0; i < arrayFinal.length;i++){
            int j = 0;
            while(j < binarySequence.length){
                binarySequence[j] = binaryArray[(ONE_OCTET*i)+j];
                j++;
            }
            arrayFinal[i] = TP2PartieA.convertBinaryToChar(binarySequence);
        }

        return arrayFinal;
    }

    static int computeHowManyCellsCharArrayWillTake(char[] binArray){
        final int BIT_FOR_ONE_CHARACATER = 8;
        int result = 0;
        result = binArray.length;
        result = result / BIT_FOR_ONE_CHARACATER;
        return result;
    }

}

