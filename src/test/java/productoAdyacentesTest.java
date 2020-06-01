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
    public void productoAdyacentes() {
        int [] arrAux = new int [5];
       int[] arr = new int[]{1, -4, 2, 2, 5, -1};

       int  resultado=10;
       int resultadoEsperado=casos.productoAdyacentes(arr,arrAux);

        assertEquals(resultado,resultadoEsperado);

    }
}