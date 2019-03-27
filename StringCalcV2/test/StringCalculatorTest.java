import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringCalculatorTest {

    private StringCalculator calculator;

    @Before
    public void setUp() {

    this.calculator = new StringCalculator();
}

    @Test
    public void methodAdd_givenEmptyString_shouldReturn0() {
//        arrange
//        act
        int result = calculator.add("");
//        assert
        assertEquals(0, result);
    }

    @Test
    public void methodAdd_givenAnyNumberAsString_ReturnsThatNumberAsAnInt() {
        int result = calculator.add("1");
        assertEquals(1, result);
    }

    @Test
    public void methodAdd_givenTwoNumbers_ReturnsTheSumOfThoseNumbers() {
        int result = calculator.add("1,2");
        assertEquals(3, result);
    }

    @Test
    public void methodAdd_givenAnyAmountOfNumbers_shouldReturnSumOfThoseNumbers() {
        int result = calculator.add("3,5,3,9");
        assertEquals(20, result);
    }

    @Test
    public void methodAdd_whenGivenLineBreaksAndCommasBetweenIntegers_shouldReturnSumOfTheIntegers () {
        int result = calculator.add("1,2\n3");
        assertEquals(6, result);
    }

    @Test
    public void methodAdd_whenGivenDifferentDelimiters_shouldReturnSumOfNumbers () {
        int result = calculator.add("//;\n1;2");
        assertEquals(3, result);
    }

}