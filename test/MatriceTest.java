import org.junit.Test;

import static org.junit.Assert.*;

public class MatriceTest {
    @Test
    public void calculer_10_11_0_1_should_return_list_of_length_10(){
        assertEquals(Matrice.calculer(10,11,0,1).length,10);
    }
    @Test
    public void calculer_10_11_0_1_should_return_list_of_list_of_11(){
        assertEquals(Matrice.calculer(10,11,0,1)[0].length,11);
    }
    @Test
    public void calculer_4_4_0_1_should_contain_only_0_and_1(){
        int[][] tab = Matrice.calculer(4,4,0,1);
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                assertTrue(tab[i][j]==0||tab[i][j]==1);
            }

        }

    }



}