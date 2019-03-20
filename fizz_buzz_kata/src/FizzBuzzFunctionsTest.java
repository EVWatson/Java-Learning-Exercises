import org.junit.Test;

import javax.print.DocFlavor;

import static org.junit.Assert.*;

public class FizzBuzzFunctionsTest {
    @Test
    public void determineFizz_givenAMultipleOf3_ShouldReturnFizz() {
        // Arrange
        int input = 3;

        // Act
        String actualResult = FizzBuzzFunctions.determineFizzBuzz(input);

        // Assert
        assertTrue(actualResult.equals("Fizz"));
    }

//    is this one right?

    @Test
    public void determineFizz_givenNoMultiplesOf3_shouldReturnIntAsString() {
        //        arrange
        int input = 4;
//        act
        String actualResult = FizzBuzzFunctions.determineFizzBuzz(input);
//        assert
        assertTrue("non-multiple of 3 or 5 did not return number", actualResult.equals("4"));
    }

    @Test
    public void determineBuzz_givenMultipleOf5_shouldReturnbuzz() {
//        arrange
        int input = 5;

//        act
        String actualResult = FizzBuzzFunctions.determineFizzBuzz(input);
//        assert
        assertTrue(actualResult.equals("Buzz"));
    }

    @Test
    public void determineFizzBuzz_givenAMultipleOf3and5_ShouldReturnFizzBuzz() {
        // Arrange
        int input = 15;

        // Act
        String actualResult = FizzBuzzFunctions.determineFizzBuzz(input);

        // Assert
        assertTrue(actualResult.equals("FizzBuzz"));
    }


}