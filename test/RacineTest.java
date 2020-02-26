import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

public class RacineTest {

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @Test
    public void calculer_2_4_should_give_an_array_with_4_9_16() {
        int[] tab = new int[3];
        tab[0] = 4;
        tab[1] = 9;
        tab[2] = 16;
        assertArrayEquals(Racine.calculer(2,4), tab);
    }

    @Test
    public void calculer_a_b_should_return_an_exception_if_a_is_bigger_than_b() {
        try {
            Racine.calculer(8,0);
            fail();
        }catch (Exception e)  {

        }
    }
}