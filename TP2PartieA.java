 


public class TP2PartieA
{
  static char transformASCII_IntToChar(int value){ 
      return (char)value;
  }
    
  static int transformASCII_CharToInt(char c){
      return (int)c;
  }
  
  static int convertFromBinaryToInt(char[] binarySequence){
      /*final int INDEX_AT_THE_END = binarySequence[binarySequence.length - 1];*/
      int[] binaryConvertisorValues = new int[binarySequence.length];
      binaryConvertisorValues[0] = 1;
      binaryConvertisorValues[1] = 2;
      binaryConvertisorValues[2] = 4;
      binaryConvertisorValues[3] = 8;
      binaryConvertisorValues[4] = 16;
      int result = 0;
      
      for(int i = INDEX_AT_THE_END; i>=0; i--){
          char binarySequenceCharVal = binarySequence[i];   //pour convertir char to int
          int binarySequenceIntVal = binarySequenceCharVal - '0';    //pour convertir char to int
          int binaryConvertisorValuesIndex = 0;
          if(binarySequenceIntVal == 1){
              result = result + binaryConvertisorValues[binaryConvertisorValuesIndex];
            }
          binaryConvertisorValuesIndex = binaryConvertisorValuesIndex + 1;
        }
      
      
      return result;
    }
    
}