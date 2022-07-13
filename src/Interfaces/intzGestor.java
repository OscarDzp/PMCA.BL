
package Interfaces;

import Clases.clsActivo;
import Clases.clsAutos;
import Clases.clsEmpleado;
import java.util.ArrayList;



/**
 *
 * @author karii
 */
public interface intzGestor {

    //Activos
    public boolean GuardarActivo(clsActivo obActivo);
    public boolean ActualizarActivo (clsActivo obActivo);
    public boolean EliminarActivo(int idActivo);
    public clsActivo ConsultarActivo(int idActivo);
    public ArrayList<clsActivo> ListarActivos();
    
    // Autos 
     public boolean GuardarAutos(clsAutos obAuto);
     public boolean ActualizarAutos(clsAutos obAutos);
     public boolean EliminarAutos(int idAuto);
     public clsAutos ConsultarAutos(int idAutos);
     public ArrayList<clsAutos> ListarAutos();
     
     // Empleados
     public boolean GuardarEmpleado(clsEmpleado obEmpleado);
     public boolean ActualizarEmpleado(clsEmpleado obEmpleado);
     public boolean EliminarEmpleado(int idEmpleado);
     public clsEmpleado ConsultarEmpleado(int idEmpleado);
     public ArrayList<clsEmpleado> ListarEmpleado();
     
}
