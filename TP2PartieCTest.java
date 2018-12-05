
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TP2PartieCTest
{

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
    public void WHEN_ALLOALLOAndTheKeyIsclclc_THEN_convertAndEncryptReturn_EncodedMessage(){
        //ARRENGE
        final char[] CHAR_MSG = {'A','L','L','O','A','L','L','O'};
        final char[] CHAR_KEY = {'c','l','c','l','c'};
        //ACT
        char[] result = TP2PartieC.encryptXOR(CHAR_MSG,CHAR_KEY);
        //ASSERT
        final char[] EXPECTED_ARRAY = {'0','0','1','0','0','0','1','0','0','0','1','0','0','0','0','0','0','0','1','0','1','1','1','1','0','0','1','0','0','0','1','1','0','0','1','0','0','0','1','0'};
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
    
    @Test
    public void WHEN_encryptedMessageAndTheKeyIsclclc_THEN_convertAndEncryptReturn_decriptedMessage(){
        //ARRENGE
        final char[] CHAR_MSG_ENCRIPTED = {'0','0','1','0','0','0','1','0','0','0','1','0','0','0','0','0','0','0','1','0','1','1','1','1','0','0','1','0','0','0','1','1','0','0','1','0','0','0','1','0'};
        final char[] CHAR_KEY = {'c','l','c','l','c'};
        //ACT
        char[] result = TP2PartieC.decryptXOR(CHAR_MSG_ENCRIPTED,CHAR_KEY);
        //ASSERT
        final char[] EXPECTED_ARRAY = {'A','L','L','O','A'};
        assertArrayEquals(EXPECTED_ARRAY,result);
    }

    @Test
    public void WHEN_encryptedMessageAndTheKeyIsclcl_THEN_convertAndEncryptReturn_decriptedMessage(){
        final char[] CHAR_MSG_ENCRIPTED = {'0','0','1','0','0','0','1','0','0','0','1','0','0','0','0','0','0','0','1','0','1','1','1','1','0','0','1','0','0','0','1','1'};
        final char[] CHAR_KEY = {'c','l','c','l'};
        //ACT
        char[] result = TP2PartieC.decryptXOR(CHAR_MSG_ENCRIPTED,CHAR_KEY);
        //ASSERT
        final char[] EXPECTED_ARRAY = {'A','L','L','O'};
        assertArrayEquals(EXPECTED_ARRAY,result);
    }
    
    @Test
    public void WHEN_encryptedMessageAndTheKeyIsclclclcl_THEN_convertAndEncryptReturn_decriptedMessage(){
        final char[] CHAR_MSG_ENCRIPTED = {'0','0','1','0','0','0','1','0','0','0','1','0','0','0','0','0','0','0','1','0','1','1','1','1','0','0','1','0','0','0','1','1','0','0','1','0','0','0','1','0','0','0','1','0','0','0','0','0','0','0','1','0','1','1','1','1','0','0','1','0','0','0','1','1'};
        final char[] CHAR_KEY = {'c','l','c','l','c','l','c','l'};
        //ACT
        char[] result = TP2PartieC.decryptXOR(CHAR_MSG_ENCRIPTED,CHAR_KEY);
        //ASSERT
        final char[] EXPECTED_ARRAY = {'A','L','L','O','A','L','L','O'};
        assertArrayEquals(EXPECTED_ARRAY,result);
    }
    
    @Test
    public void WHEN_encryptedMessageAndTheKeyIsclclcl_THEN_convertAndEncryptReturn_decriptedMessage(){
        final char[] CHAR_MSG_ENCRIPTED = {'0','0','1','0','0','0','1','0','0','0','1','0','0','0','0','0','0','0','1','0','1','1','1','1','0','0','1','0','0','0','1','1','0','0','1','0','0','0','1','0','0','0','1','0','0','0','0','0'};
        final char[] CHAR_KEY = {'c','l','c','l','c','l'};
        //ACT
        char[] result = TP2PartieC.decryptXOR(CHAR_MSG_ENCRIPTED,CHAR_KEY);
        //ASSERT
        final char[] EXPECTED_ARRAY = {'A','L','L','O','A','L'};
        assertArrayEquals(EXPECTED_ARRAY,result);
    }
}
