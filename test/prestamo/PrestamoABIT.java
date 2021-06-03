/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prestamo;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author duvbarte
 */
public class PrestamoABIT {
    private Prestamo instance;  //declaramos  la instancia para cada test
    
    public PrestamoABIT() {
    }
    
    
    @Before
    public void setUp() {
        System.out.println("se crea la instancia sobre la que se ejecutara el test");
        instance=new Prestamo();
    }
    
    @After
    public void tearDown() {
        System.out.println("se elimina la instancia sobre la que se ha hecho el test,despues de cada test");
        instance=null;
    }

    @Test
    public void test1_1() {
        System.out.println("caso1.1(p equivalencia):pedimos ptmo <1000 (500),\n"
                + "                            la respuesta sera:\"Error: La cantidad solicitada es menor de 1000\".");
        int cantidad = 500;
        //Prestamo instance = new Prestamo();
        String expResult = "Error: La cantidad solicitada es menor de 1000";
        String result = instance.ingreso(cantidad);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test
    public void test1_2() {
        System.out.println("caso 1.2(p.equivalencia):pedimos ptmo de 7000  (1000-15000),\n" +
"                            la respuesta sera :\"ptmo solicitado correcto\"");
        int cantidad = 7000;
        //Prestamo instance = new Prestamo();
        String expResult = "ptmo solicitado correcto";
        String result = instance.ingreso(cantidad);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void test1_3() {
        System.out.println("caso 1.3(p equivalencia):pedimos ptmo de 20000(>15000),\n" +
"                            la respuesta sera:\"Error: La cantidad solicitada es > 15000\"");
        int cantidad = 20000;
        //Prestamo instance = new Prestamo();
        String expResult = "Error: La cantidad solicitada es > 15000";
        String result = instance.ingreso(cantidad);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void test1_4() {
        System.out.println("caso 1.4(valores borde):pedimos ptmo de 1000,\n" +
"                            la respuesta sera:\"ptmo solicitado correcto\"");
        int cantidad = 1000;
        //Prestamo instance = new Prestamo();
        String expResult = "ptmo solicitado correcto";
        String result = instance.ingreso(cantidad);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void test1_5() {
        System.out.println("caso 1.5(valores borde):pedimos ptmo de 15000,\n" +
"                            la respuesta sera:\"ptmo solicitado correcto\"");
        int cantidad = 15000;
        //Prestamo instance = new Prestamo();
        String expResult = "ptmo solicitado correcto";
        String result = instance.ingreso(cantidad);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
