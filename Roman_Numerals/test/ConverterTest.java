import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;


public class ConverterTest {

    @Test
    public void converter1toI() {
        Converter converter = new Converter();
        String result = converter.convert(1);
        assertEquals("I", result);
    }

    @Test
    public void
}