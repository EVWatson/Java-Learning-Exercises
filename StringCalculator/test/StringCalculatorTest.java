import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

public class StringCalculatorTest {

    private StringCalculator calculator;

    @Before
    public void setUp() {
        this.calculator = new StringCalculator();
    }

    @Rule
    public ExpectedException exceptionRule = ExpectedException.none();

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
        exceptionRule.expect(IllegalArgumentException.class);
        exceptionRule.expectMessage("Negative numbers not allowed: -1, -3");
        calculator.add("-1,2,-3");
    }

    @Test
    public void methodAdd_whenNegativeNumbersAndCustomDelimiter_shouldThrowExceptionWithNegativeNumbers() {
        exceptionRule.expect(IllegalArgumentException.class);
        exceptionRule.expectMessage("Negative numbers not allowed: -1, -3");
        calculator.add("//;\n-1;2;-3");
    }

    @Test
    public void methodAdd_whenMoreNegativeNUmbersGiven_shouldThrowExceptionWithNegativeNumbers() {
        exceptionRule.expect(IllegalArgumentException.class);
        exceptionRule.expectMessage("Negative numbers not allowed: -1, -3, -5, -4");
        calculator.add("//;\n-1;2;-3;-5;6;1;-4");
    }
//    arrange
//    act
//    assert

}