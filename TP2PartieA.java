 


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
              value = value + (int)getBinValue(i);
          }
    }
    return value;
  }
  
  static double getBinValue(int pos){
    double positionValue = 31;
    double value = 0;
    for(int i = 0; i < pos; i--){
        value = positionValue / 2;
        
    }
    return value;
  }
    
}
