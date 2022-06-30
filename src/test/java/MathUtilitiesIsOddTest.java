

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class MathUtilitiesIsOddTest {
    private MathUtilities utilities;
    private Result result;

    @Before
    public void setup(){
        utilities = new MathUtilities();
        result=new Result();
    }

    @Test
    public void testIsOddForOddNumber(){
        assertTrue(result.isOdd(7));
    }

    @Test
    public void testIsOddForEvenNumber(){
        assertFalse(result.isOdd(12));
    }

}
