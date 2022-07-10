package Logica;

import Clases.clsEmpleado;
import Operaciones.OpEmpleados;
import java.util.ArrayList;

/**
 *
 * @author karii
 */
public class LEmpleados {

    private int idEmpleado;
    private String codigo;
    private clsEmpleado obEmpleado;
    private OpEmpleados obOperaciones;

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public String getCodigo() {
        return codigo;
    }

    public LEmpleados() {
        this.obOperaciones = new OpEmpleados();
    }

    public LEmpleados(int idEmpleado) {
        this.idEmpleado = idEmpleado;
        this.obOperaciones = new OpEmpleados();

    }

    public LEmpleados(String codigo) {
        this.codigo = codigo;
        this.obOperaciones = new OpEmpleados();
    }

    public LEmpleados(clsEmpleado obEmpleado) {
        this.obEmpleado = obEmpleado;
        this.obOperaciones = new OpEmpleados();
    }

    public boolean Guardar() {
        return this.obOperaciones.Guardar(this.obEmpleado);
    }

    public boolean Actualizar() {
        return this.obOperaciones.Actualizar(this.obEmpleado);
    }

    public boolean Eliminar() {
        return this.obOperaciones.Eliminar(this.idEmpleado);
    }

    public clsEmpleado Consultar() {
        if (this.idEmpleado > 0) {
            return this.obOperaciones.Consultar(this.idEmpleado);
        } else {
            return this.obOperaciones.Consultar(this.codigo);

        }
    }

    public ArrayList<clsEmpleado> Listar() {
        return this.obOperaciones.Listar();
    }
}
