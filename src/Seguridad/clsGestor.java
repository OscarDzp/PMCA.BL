
package Seguridad;

import Clases.clsActivo;
import Interfaces.intzGestor;
import Logica.*;
import java.util.ArrayList;

/**
 *
 * @author karii
 */
public class clsGestor implements intzGestor {
    private LActivo myActivo;
    

    @Override
    public boolean GuardarActivo(clsActivo obActivo) {
        this.myActivo = new LActivo(obActivo);
        return this.myActivo.Guardar();
    }

    @Override
    public boolean ActualizarActivo(clsActivo obActivo) {
        this.myActivo = new LActivo(obActivo);
        return this.myActivo.Actualizar();
    }

    @Override
    public boolean EliminarActivo(int idActivo) {
         this.myActivo = new LActivo(idActivo);
        return this.myActivo.Eliminar();
    }

    @Override
    public clsActivo ConsultarActivo(int idActivo) {
       this.myActivo = new LActivo(idActivo);
        return this.myActivo.Consultar();
    }

    @Override
    public ArrayList<clsActivo> ListarActivos() {
      this.myActivo = new LActivo();
      return this.myActivo.Listar();
    }
    
}
