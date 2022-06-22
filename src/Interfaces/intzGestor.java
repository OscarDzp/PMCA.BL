
package Interfaces;

import Clases.clsActivo;
import java.util.ArrayList;



/**
 *
 * @author karii
 */
public interface intzGestor {

    
    public boolean GuardarActivo(clsActivo obActivo);
    public boolean ActualizarActivo (clsActivo obActivo);
    public boolean EliminarActivo(int idActivo);
    public clsActivo ConsultarActivo(int idActivo);
    public ArrayList<clsActivo> ListarActivos();
}
