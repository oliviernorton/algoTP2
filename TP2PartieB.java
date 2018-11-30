
public class TP2PartieB
{
    static char[] convertCharArrayToBinary(char[] charArray){
        char[] arrayOfBinaryToPush = new char[8]; 
        char[] arrayFinal = new char[computeHowManyCellsBinaryArrayWillTake(charArray)];
        for(int i = 0 ; i < charArray.length;i++){
             arrayOfBinaryToPush = TP2PartieA.convertCharToBinary(charArray[i]);
             for(int j = 0; j < arrayOfBinaryToPush.length; j++){
                arrayFinal[(i*8)+j] = arrayOfBinaryToPush[j];
               }
        }
        return arrayFinal;
    }

    static int computeHowManyCellsBinaryArrayWillTake(char[] charArray){
        final int BIT_FOR_ONE_CHARACATER= 8;
        int result = 0;
        result = charArray.length;
        result = result * BIT_FOR_ONE_CHARACATER;
        return result;
    }
    
    static char[] convertBinaryToCharArray(char[] binaryArray){
        char[] binarySequence = new char[8];
        char[] arrayFinal = new char[binaryArray.length / 8];
        
        for(int i = 0; i < arrayFinal.length;i++){
            int j = 0;
            while(j < binarySequence.length){
                binarySequence[j] = binaryArray[(8*i)+j];
                j++;
            }
            arrayFinal[i] = TP2PartieA.convertBinaryToChar(binarySequence);
        }
        
        
            return arrayFinal;
        }
       
    }
    
    
