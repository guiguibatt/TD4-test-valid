import org.junit.Test;

import static org.junit.Assert.*;

public class TriangleTest {

    @Test
    public void calculer_2_2_2_should_return_2(){
        assertEquals(Triangle.calculer(2,2,2),2);
    }
    @Test
    public void calculer_2_2_0_should_return_4(){
        assertEquals(Triangle.calculer(2,2,0),4);
    }
    @Test
    public void calculer_2_2_4_should_return_1(){
        assertEquals(Triangle.calculer(2,2,4),1);
    }
    @Test
    public void calculer_2_1_4_should_return_3(){
        assertEquals(Triangle.calculer(2,1,4),3);
    }
    @Test
    public void calculer_0_0_0_should_return_4(){
        assertEquals(Triangle.calculer(0,0,0),4);
    }

}