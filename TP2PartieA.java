 


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
      for(int i = binarySequence.length - 1; i >= 0; i--){
          if(binarySequence[i] == '1'){
              value = value + getBinValue(i);
          }
    }
    return value;
  }
  
  static int getBinValue(int pos){
    int positionValue = 1;
    int value = 0;
    for(int i = 0; i < pos; i--){
        value =  + positionValue;
        
    }
    return value;
  }
    
}
