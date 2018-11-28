
public class TP2PartieA
{
    static char transformASCII_IntToChar(int value){ 
        return (char)value;
    }

    static int transformASCII_CharToInt(char c){
        return (int)c;
    }

    static int convertFromBinaryToInt(char[] binarySequence){
        int value = 0;   
        int power = 1;

        for(int i = binarySequence.length - 1; i >= 0; i--){
            if(binarySequence[i] == '1'){
                value = value + power;
            }
            power = power * 2;
        }
        return value;
    }
    
    static char[] convertFromIntToBinary(int value, int resultSize){
        char[] arrayOfBinary = new char[resultSize];
        int bitToPushInArrayOfBinary;
        for(int i = 0; i < resultSize; i++){
            bitToPushInArrayOfBinary = value % 2;
            bitToPushInArrayOfBinary = bitToPushInArrayOfBinary;
            arrayOfBinary[i] = (char)(bitToPushInArrayOfBinary + '0');
            value = value / 2;
            
        }
        charArraySwap(arrayOfBinary);
        
        return arrayOfBinary;
    }
    
    static void charArraySwap(char[] arrayOfBinary){
        int j = arrayOfBinary.length - 1;
        for(int i = 0; i < (arrayOfBinary.length) / 2; i++){
            char buff = arrayOfBinary[i];
            arrayOfBinary[i] = buff;
            arrayOfBinary[i] = arrayOfBinary[j];
            arrayOfBinary[j] = buff;
            j--;
            
        }
        
    }
    
    static char[] convertCharToBinary(char c){
        char[] array = new char[10];
        
        return array;
    }
    
    static char convertBinaryToChar(char[] binarySequence){
        char arra = 'a';
        
        return arra;
    }
}
