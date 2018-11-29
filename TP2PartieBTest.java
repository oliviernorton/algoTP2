
import org.junit.Test;
import static org.junit.Assert.*;

public class TP2PartieBTest
{
    @Test
    public void WHEN_recieveCharArray_THEN_convertToBinary(){
        //ARRENGE
        char[] c = {'1','C'};
        //ACT
        char[] binaryArray = TP2PartieB.convertCharArrayToBinary(c);
        //ASSERT
        char[] expectedAnswer = {'0','0','1','1','0','0','0','1','0','1','0','0','0','0','1','1'};
        assertArrayEquals(expectedAnswer,binaryArray);
    }
    
    
}
