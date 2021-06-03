/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prestamo;

import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author duvbarte
 */
@RunWith(Parameterized.class)
public class PrestamoParamIT {
    private int cantidadSolicitada;
    private String resultadoEsperado;
    
    public PrestamoParamIT(int cantidadSolicitada, String resultadoEsperado) {
        this.cantidadSolicitada=cantidadSolicitada;
        this.resultadoEsperado=resultadoEsperado;
    }
    
    //ahora generamos los datos de prueba:
    @Parameterized.Parameters
    public static Iterable<Object> generarDatosTest() {
        List<Object> obj = new ArrayList<>();

        obj.add(new Object[]{500, "Error: La cantidad solicitada es menor de 1000"});
        obj.add(new Object[]{7000, "ptmo solicitado correcto"});
        obj.add(new Object[]{20000, "Error: La cantidad solicitada es > 15000"});
        obj.add(new Object[]{1000, "ptmo solicitado correcto"});
        obj.add(new Object[]{15000, "ptmo solicitado correcto"});

        return obj;
    }
    
    
   
    @Test
    public void testIngresoParametrizado() {
        System.out.println("el ptmo solicitado seria:"+cantidadSolicitada+"el resultado esperado seria:"+resultadoEsperado);
        //int cantidad = 0;
        Prestamo instance = new Prestamo();
        //String expResult = "";
        String result = instance.ingreso(cantidadSolicitada);
        assertEquals(resultadoEsperado, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    
}
