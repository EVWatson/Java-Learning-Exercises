import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class StringCalculatorTest {

    private StringCalculator calculator;

    @Rule
    public ExpectedException thrown = ExpectedException.none();

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

    @Test
    public void methodAdd_whenGivenOneOrMoreNegativeNumbers_willThrowException () {
        thrown.expect(ArithmeticException.class);
        thrown.expectMessage(is("Negatives not allowed: [-1, -3]"));
        calculator.add("-1,2,-3");
    }

    @Test
    public void methodAdd_whenGivenNumbersGreaterOrEqualTo1000_willIgnoreThoseNumbers () {
        int result = calculator.add("1000,1001,2");
        assertEquals(2, result);
    }

    @Test
    public void methodAdd_whenGivenDeliminatorsOfAnyLength_willReturnSumOfNumbers() {
        int result = calculator.add("//[***]\n1***2***3");
        assertEquals(6, result);
    }

}