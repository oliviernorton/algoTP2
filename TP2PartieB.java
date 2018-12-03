
public class TP2PartieB
{
    static final int BIT_FOR_ONE_CHARACATER = 8;
    
    static char[] convertCharArrayToBinary(char[] charArray){
        
        char[] arrayOfBinaryToPush = new char[BIT_FOR_ONE_CHARACATER]; 
        char[] arrayFinal = new char[computeHowManyCellsBinaryArrayWillTake(charArray)];
        for(int i = 0 ; i < charArray.length;i++){
            arrayOfBinaryToPush = TP2PartieA.convertCharToBinary(charArray[i]);
            for(int j = 0; j < arrayOfBinaryToPush.length; j++){
                arrayFinal[(i*BIT_FOR_ONE_CHARACATER)+j] = arrayOfBinaryToPush[j];
            }
        }
        return arrayFinal;
    }

    static int computeHowManyCellsBinaryArrayWillTake(char[] charArray){
        int result = 0;
        result = charArray.length;
        result = result * BIT_FOR_ONE_CHARACATER;
        return result;
    }

    static char[] convertBinaryToCharArray(char[] binaryArray){
        
        char[] binarySequence = new char[BIT_FOR_ONE_CHARACATER];
        char[] arrayFinal = new char[computeHowManyCellsCharArrayWillTake(binaryArray)];

        for(int i = 0; i < arrayFinal.length;i++){
            for(int j = 0; j < binarySequence.length; j++){
                binarySequence[j] = binaryArray[(BIT_FOR_ONE_CHARACATER*i)+j];
            }
            arrayFinal[i] = TP2PartieA.convertBinaryToChar(binarySequence);
        }

        return arrayFinal;
    }

    static int computeHowManyCellsCharArrayWillTake(char[] binArray){
       int result = 0;
        result = binArray.length;
        result = result / BIT_FOR_ONE_CHARACATER;
        return result;
    }

}

