 


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
  /*
  static int binValue(int position){
      int value = 2;
      
      for(int i = 0; i <= position; i++){
          int pow = value;
          if(i == 4){
              value = 1;
            }
          value = value * pow;
        }
        return value;
    }
    
  
  */  
}
