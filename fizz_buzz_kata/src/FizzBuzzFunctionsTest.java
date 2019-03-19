import org.junit.Test;

import static org.junit.Assert.*;

public class FizzBuzzFunctionsTest {
    @Test
    public void determineFizzBuzz_givenAMultipleOf3_ShouldReturnFizz() {
        // Arrange
        int input = 3;

        // Act
        String actualResult = FizzBuzzFunctions.determineFizzBuzz(input);

        // Assert
        assertTrue(actualResult.equals("Fizz"));
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