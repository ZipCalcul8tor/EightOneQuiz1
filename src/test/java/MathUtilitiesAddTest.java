 

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MathUtilitiesAddTest
{
    private MathUtilities utilities;
    Result result;
    private static final double DELTA = 0.009;

    @Before
    public void setup(){
        utilities = new MathUtilities();
    }

    @Test
    public void testAddInteger(){
        //Given
        int sum = 15;

        //When
//        int actual = result.sum(7, 8);
        int actual;
        actual = utilities.sum(7,8);

        //Then
        assertEquals(actual,sum);
    }

    @Test
    public void testAddDouble(){
        //Given
        double expected = 11.22;

        //When
        double actual = Result.add(10.0, 1.22);

        //Then
        assertEquals(expected, actual, DELTA);
    }
}