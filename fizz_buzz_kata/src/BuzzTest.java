import org.junit.Test;

import static org.junit.Assert.*;

public class BuzzTest {

    @Test
    public void getIsNumberMultipleOf5_givenMultipleOf5_shouldReturnTrue() {
        // Arrange
        int input = 10;

        // Act
        boolean actualResult = Buzz.getIsNumberMultipleOf5(input);

        // Assert
        assertTrue(actualResult);
    }

    @Test
    public void getIsNumberMultipleOf5_givenNonMultipleOf5_shouldReturnFalse() {
        int input = 9;
        boolean actualResult = Buzz.getIsNumberMultipleOf5(input);
        assertFalse(actualResult);
    }

//    @Test
//    public void getPrintBuzz() {
//
//    }
}