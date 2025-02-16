package data;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.*;

public class UtilsTest {

    @Test
    public void testGetString_ValidInput() {
        String input = "Hello World";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        String result = Utils.getString("Enter a string: ");
        assertEquals("Hello World", result);
    }

    @Test
    public void testGetInt_ValidInput() {
        String input = "123";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        int result = Utils.getInt("Enter a number: ");
        assertEquals(123, result);
    }

    @Test
    public void testGetBoolean_TrueInput() {
        String input = "true";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        boolean result = Utils.getBoolean("Enter true or false: ");
        assertTrue(result);
    }

    @Test
    public void testGetBoolean_FalseInput() {
        String input = "false";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        boolean result = Utils.getBoolean("Enter true or false: ");
        assertFalse(result);
    }
}
