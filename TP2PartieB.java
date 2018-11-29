
public class TP2PartieB
{
    static char[] convertCharArrayToBinary(char[] charArray){
        char[] arrayOfBinary = new char[8]; 
        char[] array = new char[computeHowManyCellsBinaryArrayWillTake(charArray)];
        for(int i = 0 ; i < charArray.length;i++){
             arrayOfBinary = TP2PartieA.convertCharToBinary(charArray[i]);
             for(int j = 0; j < arrayOfBinary.length; j++){
                array[(i*8)+j] = arrayOfBinary[j];
               }
        }
        //
        return array;
    }

    static int computeHowManyCellsBinaryArrayWillTake(char[] charArray){
        final int BIT_FOR_ONE_CHARACATER= 8;
        int result = 0;
        result = charArray.length;
        result = result * BIT_FOR_ONE_CHARACATER;
        return result;
    }
}