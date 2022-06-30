

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MathUtilitiesSquareTest {
    private MathUtilities utilities;
    private Result result;

    private static final double DELTA = 0.009;

    @Before
    public void setup(){
        utilities = new MathUtilities();
        result=new Result();
    }

    @Test
    public void testSquareForBaseCase() {
        //Given
        double expected = 1;

        //When
        double actual = result.square(1);

        //Then
        assertEquals(expected, actual, DELTA);
    }

    @Test
    public void testSquareForOneDigit() {
        //Given
        double expected = 9;

        //When
        double actual = result.square(3);

        //Then
        assertEquals(expected, actual, DELTA);
    }

    @Test
    public void testSquareForTwoDigit() {
        //Given
        double expected = 121;

        //When
        double actual = result.square(11);

        //Then
        assertEquals(expected, actual, DELTA);
    }
}
