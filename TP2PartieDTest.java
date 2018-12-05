import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class TP2PartieDTest
{
    @Test
    public void WHEN_16Binary_THEN_converteBinToHex_return4HexResult(){
        //ARRENGE
        char[] binArray = {'0','0','1','1','0','0','0','1','0','1','0','0','0','0','1','1'};
        //ACT
        char[] result = TP2PartieD.convertBinaryArrayToHexArray(binArray);
        
        //ASSERT
        final char[] EXPECTED_RESULT = {'3','1','4','3'};
        assertArrayEquals(EXPECTED_RESULT , result);
    }
    
    @Test
    public void WHEN_32Binary_THEN_converteBinToHex_return8HexResult(){
        //ARRENGE
        char[] binArray = {'0','0','1','1','0','0','0','1','0','1','0','0','0','0','1','1','0','0','1','1','0','0','0','1','0','1','0','0','0','0','1','1'};
        //ACT
        char[] result = TP2PartieD.convertBinaryArrayToHexArray(binArray);
        
        //ASSERT
        final char[] EXPECTED_RESULT = {'3','1','4','3','3','1','4','3'};
        assertArrayEquals(EXPECTED_RESULT , result);
    }
    
    @Test
    public void WHEN_16BinaryWithHexValues_THEN_converteBinToHexReturn4HexResult(){
        //ARRENGE
        char[] binArray = {'0','1','0','0','1','1','1','1','0','1','0','1','1','1','0','0'};
        //ACT
        char[] result = TP2PartieD.convertBinaryArrayToHexArray(binArray);
        
        //ASSERT
        final char[] EXPECTED_RESULT = {'4','F','5','C'};
        assertArrayEquals(EXPECTED_RESULT , result);
    }
    
    @Test
    public void WHEN_32BinaryWithHexValues_THEN_converteBinToHexReturn8HexResult(){
        //ARRENGE
        char[] binArray = {'0','1','0','0','1','1','1','1','0','1','0','1','1','1','0','0','0','1','0','0','1','1','1','1','0','1','0','1','1','1','0','0'};
        //ACT
        char[] result = TP2PartieD.convertBinaryArrayToHexArray(binArray);
        
        //ASSERT
        final char[] EXPECTED_RESULT = {'4','F','5','C','4','F','5','C'};
        assertArrayEquals(EXPECTED_RESULT , result);
    }
    
    /*@Test
    public void WHEN_8HexValuesInACharArray_THEN_converteHexToBinReturn8HexResult(){
        //ARRENGE
        char[] binArray = {'4','F','5','C','4','F','5','C'};
        //ACT
        char[] result = TP2PartieD.convertHexArrayToBinaryArray(binArray);
        
        //ASSERT
        final char[] EXPECTED_RESULT = {'0','1','0','0','1','1','1','1','0','1','0','1','1','1','0','0','0','1','0','0','1','1','1','1','0','1','0','1','1','1','0','0'};
        assertArrayEquals(EXPECTED_RESULT , result);
    }*/
}
