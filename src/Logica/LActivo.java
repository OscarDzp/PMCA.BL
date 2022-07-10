package Logica;

import Clases.clsActivo;
import Operaciones.OpActivos;
import java.util.ArrayList;

/**
 *
 * @author karii
 */
public class LActivo {

    private int idActivo;
    private String codigo;
    private clsActivo obActivo;
    private OpActivos obOperaciones;

    public int getIdActivo() {
        return idActivo;
    }

    public void setIdActivo(int idActivo) {
        this.idActivo = idActivo;
    }

    public clsActivo getObActivo() {
        return obActivo;
    }

    public void setObActivo(clsActivo obActivo) {
        this.obActivo = obActivo;
    }

    public OpActivos getObOperaciones() {
        return obOperaciones;
    }

    public void setObOperaciones(OpActivos obOperaciones) {
        this.obOperaciones = obOperaciones;
    }

    public LActivo() {
        this.obOperaciones = new OpActivos();
    }

    public LActivo(clsActivo obActivo) {
        this.obActivo = obActivo;
        this.obOperaciones = new OpActivos();
    }

    public LActivo(int idActivo) {
        this.idActivo = idActivo;
        this.obOperaciones = new OpActivos();

    }

    public boolean Guardar() {
        return this.obOperaciones.Guardar(this.obActivo);

    }

    public boolean Actualizar() {
        return this.obOperaciones.Actualizar(this.obActivo);

    }

    public clsActivo Consultar() {
        if (this.idActivo > 0) {
            return this.obOperaciones.Consultar(this.idActivo);
        } else {
            return this.obOperaciones.Consultar(this.codigo);
        }
    }

    public boolean Eliminar() {
        return this.obOperaciones.Eliminar(this.idActivo);
    }

    public ArrayList<clsActivo> Listar() {
        return this.obOperaciones.Listar();
    }

}
