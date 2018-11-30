
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TP2PartieCTest
{
    //pour etre sur de la bonne conversion XOR. return == resultArray
    /*
    @Test
    public void WHEN_ALLOAndTheKeyIsclcl_THEN_convertAndEncryptReturn_EncodedMessage(){
        final char[] CHAR_MSG = {'A','L','L','O'};
        final char[] CHAR_KEY = {'c','l','c','l'};
        //ACT
        char[] result = TP2PartieC.encryptXOR(CHAR_MSG,CHAR_KEY);
        //ASSERT
        final char[] EXPECTED_ARRAY = {'0','0','1','0','0','0','1','0','0','0','1','0','0','0','0','0','0','0','1','0','1','1','1','1','0','0','1','0','0','0','1','1'};
        assertArrayEquals(EXPECTED_ARRAY,result);
    }

    @Test
    public void WHEN_ALLOALLOAndTheKeyIsclclclcl_THEN_convertAndEncryptReturn_EncodedMessage(){
        //ARRENGE
        final char[] CHAR_MSG = {'A','L','L','O','A','L','L','O'};
        final char[] CHAR_KEY = {'c','l','c','l','c','l','c','l'};
        //ACT
        char[] result = TP2PartieC.encryptXOR(CHAR_MSG,CHAR_KEY);
        //ASSERT
        final char[] EXPECTED_ARRAY = {'0','0','1','0','0','0','1','0','0','0','1','0','0','0','0','0','0','0','1','0','1','1','1','1','0','0','1','0','0','0','1','1','0','0','1','0','0','0','1','0','0','0','1','0','0','0','0','0','0','0','1','0','1','1','1','1','0','0','1','0','0','0','1','1'};
        assertArrayEquals(EXPECTED_ARRAY,result);
    }

    @Test
    public void WHEN_ALLOALAndTheKeyIsclclcl_THEN_convertAndEncryptReturn_EncodedMessage(){
        //ARRENGE
        final char[] CHAR_MSG = {'A','L','L','O','A','L'};
        final char[] CHAR_KEY = {'c','l','c','l','c','l'};
        //ACT
        char[] result = TP2PartieC.encryptXOR(CHAR_MSG,CHAR_KEY);
        //ASSERT
        final char[] EXPECTED_ARRAY = {'0','0','1','0','0','0','1','0','0','0','1','0','0','0','0','0','0','0','1','0','1','1','1','1','0','0','1','0','0','0','1','1','0','0','1','0','0','0','1','0','0','0','1','0','0','0','0','0'};
        assertArrayEquals(EXPECTED_ARRAY,result);
    }

    @Test
    public void WHEN_ALLOAAndTheKeyIsclclc_THEN_convertAndEncryptReturn_EncodedMessage(){
        //ARRENGE
        final char[] CHAR_MSG = {'A','L','L','O','A'};
        final char[] CHAR_KEY = {'c','l','c','l','c'};
        //ACT
        char[] result = TP2PartieC.encryptXOR(CHAR_MSG,CHAR_KEY);
        //ASSERT
        final char[] EXPECTED_ARRAY = {'0','0','1','0','0','0','1','0','0','0','1','0','0','0','0','0','0','0','1','0','1','1','1','1','0','0','1','0','0','0','1','1','0','0','1','0','0','0','1','0'};
        assertArrayEquals(EXPECTED_ARRAY,result);
    }
    */
   @Test
    public void WHEN_ALLOAAndTheKeyIsclclc_THEN_convertAndEncryptReturn_EncodedMessage(){
        //ARRENGE
        final char[] CHAR_MSG = {'A','L','L','O'};
        final char[] CHAR_KEY = {'c','l','c','l'};
        //ACT
        char[] result = TP2PartieC.encryptXOR(CHAR_MSG,CHAR_KEY);
        //ASSERT
        final char[] EXPECTED_ARRAY = {'4','1','4','C','4','C','4','F'};
        assertArrayEquals(EXPECTED_ARRAY,result);
    }
}
