
public class TP2PartieB
{
    static char[] convertCharArrayToBinary(char[] charArray){
        char[] arrayOfBinary = new char[computeHowManyCellsBinaryArrayWillTake(charArray)];
        for(int i = 0 ; i < arrayOfBinary.length;i++){
            arrayOfBinary[i] = TP2PartieA.convertCharToBinary(charArray[i]);
        }

        return arrayOfBinary;
    }

    static int computeHowManyCellsBinaryArrayWillTake(char[] charArray){
        final int BIT_FOR_ONE_CHARACATER= 8;
        int result = 0;
        result = charArray.length;
        result = result * BIT_FOR_ONE_CHARACATER;
        return result;
    }
}