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
    public void methodAdd_whenGivenAnEmptyString_shouldReturn0() {
        //    arrange

//    act
        int result = calculator.add("");
//    assert
        assertEquals(0, result);
    }

    @Test
    public void methodAdd_whenGivenASingleNumber_shouldReturnThatNumber() {

        int result = calculator.add("1");

        assertEquals(1, result);

    }


    @Test
    public void methodAdd_whenGivenANumberAsAString_shouldReturnThatNumberAsAnInt() {

        int result = calculator.add("3");

        assertEquals(3, result);
    }

    @Test
    public void methodAdd_whenGiveTwoNumbersAsAString_shouldReturnTheSumOfThoseNumbers() {

        int result = calculator.add("1,2");

        assertEquals(3, result);
    }

    @Test
    public void methodAdd_whenGivenAnyAmountOfNumbers_shouldReturnTheSumOfThoseNumbers() {

        int result = calculator.add("1,2,3");

        assertEquals(6, result);
    }

    @Test
    public void methodAdd_whenGivenNumbersSeparatedByNewLineOrComma_shouldReturnSumOfThoseNumbers() {
        int result = calculator.add("1,2\n3");

        assertEquals(6, result);
    }

    @Test
    public void methodAdd_whenGivenStringStartingWithDoubleSlashes_shouldUseNextCharacterAsDelimiterToParseExpression() {
        int result = calculator.add("//;\n1;2");

        assertEquals(3, result);
    }

    @Test
    public void methodAdd_whenNegativeNumbers_shouldThrowExceptionWithNegativeNumbers() {
        int result = calculator.add("-1,2,-3");

//        assertEquals(3, result);
    }

    @Test
    public void methodAdd_whenNegativeNumbersAndCustomDelimiter_shouldThrowExceptionWithNegativeNumbers() {
        int result = calculator.add("//;\n-1;2;-3");

//        assertEquals(3, result);
    }
//    arrange
//    act
//    assert

}