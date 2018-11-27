 


public class TP2PartieA
{
  static char transformASCII_IntToChar(int value){ 
      return (char)value;
  }
    
  static int transformASCII_CharToInt(char c){
      return (int)c;
  }
  
  static int convertFromBinaryToInt(char[] binarySequence){
    int value = 1;   
    int positionValue = 1;
    for(int i = binarySequence.length - 1; i >= binarySequence.length - 1; i++){
        positionValue = positionValue * 2;
        
    }
    for(int i = binarySequence.length - 1; i >= 0; i--){
          if(binarySequence[i] == '1'){
              value = value + positionValue;
          }
    }
    return value;
  }
  
  
    
}
