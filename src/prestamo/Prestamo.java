/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prestamo;

/**
 *
 * @author duvbarte
 */
public class Prestamo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }

    public String ingreso(int cantidad) {
        String sRespuesta = "Error desconocido";

        if (cantidad >= 1000 && cantidad <= 15000) {
            sRespuesta = "ptmo solicitado correcto";
        } else if (cantidad < 1000) {
            sRespuesta = "Error: La cantidad solicitada es menor de 1000";
        } else {
            sRespuesta = "Error: La cantidad solicitada es > 15000";
        }

        return sRespuesta;
    }

}
/*
    caso1.1(p equivalencia):pedimos ptmo <1000 (500),
                            la respuesta sera:"Error: La cantidad solicitada es menor de 1000".
    caso 1.2(p.equivalencia):pedimos ptmo de 7000  (1000-15000),
                            la respuesta sera :"ptmo solicitado correcto"
    caso 1.3(p equivalencia):pedimos ptmo de 20000(>15000),
                            la respuesta sera:"Error: La cantidad solicitada es > 15000"
    caso 1.4(valores borde):pedimos ptmo de 1000,
                            la respuesta sera:"ptmo solicitado correcto"
    caso 1.5(valores borde):pedimos ptmo de 15000,
                            la respuesta sera:"ptmo solicitado correcto"
*/