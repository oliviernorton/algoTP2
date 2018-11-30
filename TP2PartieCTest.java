

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class TP2PartieCTest
{
  public void WHEN__THEN_Return(){
      //ARRENGE
      final char[] CHAR_MSG = {'A','L','L','O'};
      final char[] CHAR_KEY = {'c','l'};
      //ACT
      char[] result = TP2PartieC.encryptXOR(CHAR_MSG,CHAR_KEY);
      //ASSERT
      final char[] EXPECTED_ARRAY = {'1','0','1','0','0','1','0','0','1','0','1','1','1','0','0','0','1','0','1','0','0','0','1','1','1','0','1','1','1','0','1','1'};
      assertArrayEquals(EXPECTED_ARRAY,result);
    }
}
