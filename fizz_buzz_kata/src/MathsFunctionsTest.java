import org.junit.Test;

import static org.junit.Assert.*;

public class MathsFunctionsTest {
    @Test
    public void isNumberMultipleOf3_givenMultipleOf3_shouldReturnTrue() {
        // Arrange
        int input = 3;

        // Act
        boolean actualResult = MathsFunctions.isNumberMultipleOf3(input);

        // Assert
        assertTrue(actualResult);
    }

    @Test
    public void isNumberMultipleOf3_whenNotGivenMultipleOf3_shouldReturnFalse() {
//        arrange
        int input = 4;

//        act
        boolean actualResult = MathsFunctions.isNumberMultipleOf3(input);

//        assert
        assertFalse(actualResult);
    }

    @Test
    public void isNumberMultipleOf5_whenGivenMultipleOf5_shouldReturnTrue() {
        //        arrange
        int input = 20;

//        act
        boolean actualResult = MathsFunctions.isNumberMultipleOf5(input);

//        run
        assertTrue(actualResult);
    }

    @Test
    public void isNumberMultipleOf5_whenNotGivenMultipleOf5_shouldReturnFalse() {
        //        arrange
        int input = 21;

//        act
        boolean actualResult = MathsFunctions.isNumberMultipleOf5(input);

//        run
        assertFalse(actualResult);
    }

//should it either return true but be over-ridden by isNumberMultipleOf3and5, or return false even though it is a multiple of 15?? And does it matter for this kata seeing as the loop checks for a multiple of both 3 and 5 first?
    @Test
    public void isNumberMultipleOf5_whenGivenMultipleOf5ButAlso3_shouldReturnTrue () {
        //        arrange
        int input = 15;

//        act
        boolean actualResult = MathsFunctions.isNumberMultipleOf5(input);

//        run
        assertTrue(actualResult);
    }

    @Test
    public void isNumberMultipleOf3and5_whenGivenMultipleOfBoth3and5_shouldReturnTrue() {
//        arrange
        int input = 15;

//        act
        boolean actualResult = MathsFunctions.isNumberMultipleOf3and5(input);

//        assert

        assertTrue(actualResult);
    }

    @Test
    public void isNumberMultipleOf3and5_whenGivenMultipleOf3Only_shouldReturnFalse() {
//        arrange
        int input = 6;

//        act
        boolean actualResult = MathsFunctions.isNumberMultipleOf3and5(input);
//         assert
        assertFalse(actualResult);
    }

    @Test
    public void isNumberMultipleOf3and5_whenGivenMultipleOf5Only_shouldReturnFalse() {
//        arrange
        int input = 20;

//        act
        boolean actualResult = MathsFunctions.isNumberMultipleOf3and5(input);

//        run
        assertFalse(actualResult);
    }

    @Test
    public void isNumberMultipleOf3and5_whenGivenNoMultiplesOf3and5_shouldReturnFalse() {
        //        arrange
        int input = 7;

//        act
        boolean actualResult = MathsFunctions.isNumberMultipleOf3and5(input);

//        run
        assertFalse(actualResult);
    }

    @Test
    public void isNumberMultipleOf3and5_whenGiven0_shouldReturnTrue() {
        //        arrange
        int input = 0;

//        act
        boolean actualResult = MathsFunctions.isNumberMultipleOf3and5(input);

//        assert
        assertTrue(actualResult);

    }
}