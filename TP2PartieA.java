
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

    static char[] convertFromIntToBinary(int value, int binaryArraySize){
        char[] array = new char[5];
        
        return array;
    }

}
