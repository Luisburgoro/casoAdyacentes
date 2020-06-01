import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class productoAdyacentesTest {

     productoAdyacentes casos;

    @Before
    public void setUp() throws Exception {
        casos= new productoAdyacentes();
    }

    @After
    public void tearDown() throws Exception {
      casos=null;
    }

    @Test
    public void productoAdyacentesT1() {
       int[] arr = new int[]{1, -4, 2, 2, 5, -1};
       int resultado1 = 10;
       int resultadoEsperado1 = casos.productoAdyacentes(arr);
        assertEquals(resultado1, resultadoEsperado1);
    }
    @Test
    public void productoAdyacentesT2 () {
        int[] exx = new int[]{1};
        int resultado2 = 1;
        int resultadoEsperado2 = casos.productoAdyacentes(exx);
        assertEquals(resultado2, resultadoEsperado2);
    }
    @Test
    public void productoAdyacentesT3 () {
        int[] exx = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21};
        int resultado3 = 420;
        int resultadoEsperado3 = casos.productoAdyacentes(exx);
        assertEquals(resultado3, resultadoEsperado3);
    }
    @Test
    public void productoAdyacentesT4 () {
        int[] exx = new int[]{3, 1, 1010, 2};
        int resultado4 = 2020;
        int resultadoEsperado4 = casos.productoAdyacentes(exx);
        assertEquals(resultado4, resultadoEsperado4);
    }
    @Test
    public void productoAdyacentesT5 () {
        int[] exx = new int[]{3, 1, -1010, 2};
        int resultado5 = 3;
        int resultadoEsperado5 = casos.productoAdyacentes(exx);
        assertEquals(resultado5, resultadoEsperado5);
    }

}