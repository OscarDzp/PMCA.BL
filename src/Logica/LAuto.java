package Logica;

import Clases.clsAutos;
import Operaciones.OpAutos;
import java.util.ArrayList;

/**
 *
 * @author karii
 */
public class LAuto {

    private int idAuto;
    private String Codigo;
    private clsAutos obAutos;
    private OpAutos obOperaciones;

    public int getIdAuto() {
        return idAuto;
    }

    public String getCodigo() {
        return Codigo;
    }

    public LAuto() {
        this.obOperaciones = new OpAutos();
    }

    public LAuto(int idAuto) {
        this.idAuto = idAuto;
        this.obOperaciones = new OpAutos();
    }

    public LAuto(String Codigo) {
        this.Codigo = Codigo;
        this.obOperaciones = new OpAutos();
    }

    public LAuto(clsAutos obAutos) {
        this.obAutos = obAutos;
        this.obOperaciones = new OpAutos();
    }

    public boolean Guardar() {
        return this.obOperaciones.Guardar(this.obAutos);
    }

    public boolean Actualizar() {
        return this.obOperaciones.Actualizar(this.obAutos);

    }

    public boolean Eliminar() {
        return this.obOperaciones.Eliminar(this.idAuto);
    }

    public clsAutos Consultar() {
        if (this.idAuto > 0) {
            return this.obOperaciones.Consultar(this.idAuto);
        } else {
        return this.obOperaciones.Consultar(this.Codigo);
        
        }
    }
    public ArrayList<clsAutos> Listar(){
    return this.obOperaciones.Listar();
    }
}
