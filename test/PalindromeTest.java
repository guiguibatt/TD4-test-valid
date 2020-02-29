import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void countPalinOne() {
        String testWithOnePal  = "Ici vit le code";
        assertEquals(1,Palindrome.countPalin(testWithOnePal));
    }

    @Test
    public void countPalinTwo() {
        String testWithOnePal  = "Ici vit le code, dad";
        assertEquals(2,Palindrome.countPalin(testWithOnePal));
    }


    @Test
    public void countPalinNo() {
        String testWithNoPal  ="Vivons avec le code";
        assertEquals(0,Palindrome.countPalin(testWithNoPal));
    }

    @Test
    public void countPalinNumbers() {
        String testWithNumbers  ="55 3 87 30";
        assertEquals(2,Palindrome.countPalin(testWithNumbers));
    }

}