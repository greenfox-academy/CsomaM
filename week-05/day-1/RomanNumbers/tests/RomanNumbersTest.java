import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class RomanNumbersTest {

    RomanNumbers romanNumbers;

    @Before
    public void setUp() throws Exception {
        if (romanNumbers == null) {
            romanNumbers = new RomanNumbers();
        }
    }

    @Test
    public void convertToRomanI() throws Exception {
        assertEquals("I", romanNumbers.convertToRomanI(1));
    }

    @Test
    public void convertToRomanII() throws Exception {
        assertEquals("II", romanNumbers.convertToRomanI(2));
    }

    @Test
    public void convertToRomanIII() throws Exception {
        assertEquals("III", romanNumbers.convertToRomanI(3));
    }

    @Test
    public void convertToRomanIV() throws Exception {
        assertEquals("IV", romanNumbers.convertToRomanI(4));
    }

    @Test
    public void convertToRomanV() throws Exception {
        assertEquals("V", romanNumbers.convertToRomanI(5));
    }

    @Test
    public void convertToRomanVI() throws Exception {
        assertEquals("VI", romanNumbers.convertToRomanI(6));
    }

    @Test
    public void convertToRomanVII() throws Exception {
        assertEquals("VII", romanNumbers.convertToRomanI(7));
    }

    @Test
    public void convertToRomanVIII() throws Exception {
        assertEquals("VIII", romanNumbers.convertToRomanI(8));
    }

    @Test
    public void convertToRomanIX() throws Exception {
        assertEquals("IX", romanNumbers.convertToRomanI(9));
    }

}