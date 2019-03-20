import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BlockTest {

    @Test
    public void calculateBlockVolume_givenABlock_willCorrectlyCalculatesVolumeOfBlock() {
//        arrange
        int [] blockDimensions = {2, 4, 6};
        Block b = new Block(blockDimensions);
        int expectedValue = 48;
//        act
        int actualResult = b.calculateBlockVolume();
//        assert
        assertEquals(expectedValue, actualResult);
    }

    @Test
    public void calculateSurfaceArea_givenABlock_willCorrectlyCalculateSurfaceAreaOfBlock() {
//        arrange   wlh
        int [] blockDimensions = {2, 4, 6};
        Block b = new Block(blockDimensions);
        int expectedValue = 88;
//        act
        int actualResult = b.calculateSurfaceArea();
//        assert
        assertEquals(expectedValue, actualResult);
    }
}