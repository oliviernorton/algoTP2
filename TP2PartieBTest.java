
import org.junit.Test;
import static org.junit.Assert.*;

public class TP2PartieBTest
{
    @Test
    public void WHEN_recieveCharArrayOf2_THEN_convertToBinary(){
        //ARRENGE
        char[] c = {'1','C'};
        //ACT
        char[] binaryArray = TP2PartieB.convertCharArrayToBinary(c);
        //ASSERT
        final char[] EXPECTED_RESULT = {'0','0','1','1','0','0','0','1','0','1','0','0','0','0','1','1'};
        assertArrayEquals(EXPECTED_RESULT,binaryArray);
    }

    @Test
    public void WHEN_recieveCharArrayOf4_THEN_convertToBinary(){
        //ARRENGE
        char[] c = {'1','C','1','C'};
        //ACT
        char[] binaryArray = TP2PartieB.convertCharArrayToBinary(c);
        //ASSERT
        final char[] EXPECTED_RESULT = {'0','0','1','1','0','0','0','1','0','1','0','0','0','0','1','1','0','0','1','1','0','0','0','1','0','1','0','0','0','0','1','1'};
        assertArrayEquals(EXPECTED_RESULT,binaryArray);
    }

    @Test
    public void WHEN_recieveCharArrayOf3_THEN_convertToBinary(){
        //ARRENGE
        char[] c = {'1','C','1'};
        //ACT
        char[] binaryArray = TP2PartieB.convertCharArrayToBinary(c);
        //ASSERT
        final char[] EXPECTED_RESULT = {'0','0','1','1','0','0','0','1','0','1','0','0','0','0','1','1','0','0','1','1','0','0','0','1'};
        assertArrayEquals(EXPECTED_RESULT,binaryArray);
    }

    @Test
    public void WHEN_recieveCharArrayOfALLO_THEN_convertToBinary(){
        //ARRENGE
        char[] c = {'A','L','L','O'};
        //ACT
        char[] binaryArray = TP2PartieB.convertCharArrayToBinary(c);
        //ASSERT
        final char[] EXPECTED_RESULT = {'0','1','0','0','0','0','0','1','0','1','0','0','1','1','0','0','0','1','0','0','1','1','0','0','0','1','0','0','1','1','1','1'};
        assertArrayEquals(EXPECTED_RESULT,binaryArray);
    }

    @Test
    public void WHEN_4cellsCharArrayAreRecieved_THEN_computeHowManyCellItWillTake_return_howManyCellWeNeed(){
        //ARRENGE
        char[] array = new char[4];
        //ACT
        int result = TP2PartieB.computeHowManyCellsBinaryArrayWillTake(array);
        //ASSERT
        final int EXPECTED_RESULT = 32;
        assertEquals(EXPECTED_RESULT,result);
    }

    @Test
    public void WHEN_5cellsCharArrayAreRecieved_THEN_computeHowManyCellItWillTake_return_howManyCellWeNeed(){
        //ARRENGE
        char[] array = new char[5];
        //ACT
        int result = TP2PartieB.computeHowManyCellsBinaryArrayWillTake(array);
        //ASSERT
        final int EXPECTED_RESULT = 40;
        assertEquals(EXPECTED_RESULT,result);
    }
    
    @Test
    public void WHEN_6cellsCharArrayAreRecieved_THEN_computeHowManyCellItWillTake_return_howManyCellWeNeed(){
        //ARRENGE
        char[] array = new char[6];
        //ACT
        int result = TP2PartieB.computeHowManyCellsBinaryArrayWillTake(array);
        //ASSERT
        final int EXPECTED_RESULT = 48;
        assertEquals(EXPECTED_RESULT,result);
    }
    
    @Test
    public void WHEN_7cellsCharArrayAreRecieved_THEN_computeHowManyCellItWillTake_return_howManyCellWeNeed(){
        //ARRENGE
        char[] array = new char[7];
        //ACT
        int result = TP2PartieB.computeHowManyCellsBinaryArrayWillTake(array);
        //ASSERT
        final int EXPECTED_RESULT = 56;
        assertEquals(EXPECTED_RESULT,result);
    }
    
    @Test
    public void WHEN_32cellsCharArrayAreRecieved_THEN_computeHowManyCellItWillTake_return_howManyCellWeNeed(){
        //ARRENGE
        char[] array = new char[32];
        //ACT
        int result = TP2PartieB.computeHowManyCellsCharArrayWillTake(array);
        //ASSERT
        final int EXPECTED_RESULT = 4;
        assertEquals(EXPECTED_RESULT,result);
    }
    
    @Test
    public void WHEN_64cellsCharArrayAreRecieved_THEN_computeHowManyCellItWillTake_return_howManyCellWeNeed(){
        //ARRENGE
        char[] array = new char[64];
        //ACT
        int result = TP2PartieB.computeHowManyCellsCharArrayWillTake(array);
        //ASSERT
        final int EXPECTED_RESULT = 8;
        assertEquals(EXPECTED_RESULT,result);
    }
    
    @Test
    public void WHEN_128cellsCharArrayAreRecieved_THEN_computeHowManyCellItWillTake_return_howManyCellWeNeed(){
        //ARRENGE
        char[] array = new char[128];
        //ACT
        int result = TP2PartieB.computeHowManyCellsCharArrayWillTake(array);
        //ASSERT
        final int EXPECTED_RESULT = 16;
        assertEquals(EXPECTED_RESULT,result);
    }
    
    @Test
    public void WHEN_256cellsCharArrayAreRecieved_THEN_computeHowManyCellItWillTake_return_howManyCellWeNeed(){
        //ARRENGE
        char[] array = new char[256];
        //ACT
        int result = TP2PartieB.computeHowManyCellsCharArrayWillTake(array);
        //ASSERT
        final int EXPECTED_RESULT = 32;
        assertEquals(EXPECTED_RESULT,result);
    }

    @Test
    public void WHEN_recieveArrayOf16Binary_THEN_convertToChar(){
        //ARRENGE
        char[] binaryArray={'0', '1','0', '0','0', '0','0', '1','0', '0','1', '0','1', '1','0', '1'};
        //ACT
        char[] charArray = TP2PartieB.convertBinaryToCharArray(binaryArray);
        //ASSERT
        final char[] EXPECTED_RESULT={'A','-'};
        assertArrayEquals(EXPECTED_RESULT,charArray);
    }

    @Test
    public void WHEN_recieveArrayOf32Binary_THEN_convertToChar(){
        //ARRENGE
        char[] binaryArray={'0', '1','0', '0','0', '0','0', '1','0', '0','1', '0','1', '1','0', '1','0', '1','0', '0','0', '0','0', '1','0', '0','1', '0','1', '1','0', '1'};
        //ACT
        char[] charArray = TP2PartieB.convertBinaryToCharArray(binaryArray);
        //ASSERT
        final char[] EXPECTED_RESULT={'A','-','A','-'};
        assertArrayEquals(EXPECTED_RESULT,charArray);
    }
    
    @Test
    public void WHEN_recieveArrayOf64Binary_THEN_convertToChar(){
        //ARRENGE
        char[] binaryArray={'0', '1','0', '0','0', '0','0', '1','0', '0','1', '0','1', '1','0', '1','0', '1','0', '0','0', '0','0', '1','0', '0','1', '0','1', '1','0', '1','0', '1','0', '0','0', '0','0', '1','0', '0','1', '0','1', '1','0', '1','0', '1','0', '0','0', '0','0', '1','0', '0','1', '0','1', '1','0', '1'};
        //ACT
        char[] charArray = TP2PartieB.convertBinaryToCharArray(binaryArray);
        //ASSERT
        final char[] EXPECTED_RESULT={'A','-','A','-','A','-','A','-'};
        assertArrayEquals(EXPECTED_RESULT,charArray);
    }
    
    @Test
    public void WHEN_recieveArrayOf128Binary_THEN_convertToChar(){
        //ARRENGE
        char[] binaryArray={'0', '1','0', '0','0', '0','0', '1','0', '0','1', '0','1', '1','0', '1','0', '1','0', '0','0', '0','0', '1','0', '0','1', '0','1', '1','0', '1','0', '1','0', '0','0', '0','0', '1','0', '0','1', '0','1', '1','0', '1','0', '1','0', '0','0', '0','0', '1','0', '0','1', '0','1', '1','0', '1','0', '1','0', '0','0', '0','0', '1','0', '0','1', '0','1', '1','0', '1','0', '1','0', '0','0', '0','0', '1','0', '0','1', '0','1', '1','0', '1','0', '1','0', '0','0', '0','0', '1','0', '0','1', '0','1', '1','0', '1','0', '1','0', '0','0', '0','0', '1','0', '0','1', '0','1', '1','0', '1'};
        //ACT
        char[] charArray = TP2PartieB.convertBinaryToCharArray(binaryArray);
        //ASSERT
        final char[] EXPECTED_RESULT={'A','-','A','-','A','-','A','-','A','-','A','-','A','-','A','-'};
        assertArrayEquals(EXPECTED_RESULT,charArray);
    }
}
