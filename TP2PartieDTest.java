import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class TP2PartieDTest
{
    @Test
    public void WHEN__THEN_retur(){
        //ARRENGE
        char[] binArray = {'0','0','1','1','0','0','0','1','0','1','0','0','0','0','1','1'};
        //ACT
        TP2PartieD.convertBinaryArrayToHexArray(binArray);
        
        //ASSERT
        final char[] EXPECTED_RESULT = {'3','1','4','3'};
        assertArrayEquals(EXPECTED_RESULT , binArray);
    }
}
