import org.junit.Test;

import static org.junit.Assert.*;

public class FizzBuzzFunctionsTest {
    @Test
    public void isNumberMultipleOf3_givenMultipleOf3_shouldReturnTrue() {
        // Arrange
        int input = 3;

        // Act
        boolean actualResult = FizzBuzzFunctions.isNumberMultipleOf3(input);

        // Assert
        assertTrue(actualResult);
    }
}