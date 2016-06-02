/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projcod;
import LibraryCod.BaseDatos;
/**
 *
 * @author Pablite5
 */
public class ProjCOD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        BaseDatos oj=new BaseDatos("localhost","root","821969","futbol");
        oj.insertar(null, args);
        oj.actualizar(null, null, null, null, null);
        oj.eliminar(null, null, null);
        oj.apagar();
      
    }
    
}
