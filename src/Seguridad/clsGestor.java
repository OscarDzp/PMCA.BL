package Seguridad;

import Clases.clsActivo;
import Interfaces.intzGestor;
import Logica.*;
import Clases.clsAutos;
import Clases.clsEmpleado;
import java.util.ArrayList;

/**
 *
 * @author karii
 */
public class clsGestor implements intzGestor {

    private LActivo myActivo;
    private LAuto myAuto;
    private LEmpleados myEmpleados;

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

    @Override
    public boolean GuardarAutos(clsAutos obAuto) {
        this.myAuto = new LAuto(obAuto);
        return this.myAuto.Guardar();
    }

    @Override
    public boolean ActualizarAutos(clsAutos obAutos) {
        this.myAuto = new LAuto(obAutos);
        return this.myAuto.Actualizar();
    }

    @Override
    public boolean EliminarAutos(int idAuto) {
        this.myAuto = new LAuto(idAuto);
        return this.myAuto.Eliminar();
    }

    @Override
    public clsAutos ConsultarAutos(int idAutos) {
        this.myAuto = new LAuto(idAutos);
        return this.myAuto.Consultar();
    }

    @Override
    public ArrayList<clsAutos> ListarAutos() {
        this.myAuto = new LAuto();
        return this.myAuto.Listar();
    }

    @Override
    public boolean GuardarEmpleado(clsEmpleado obEmpleado) {
        this.myEmpleados = new LEmpleados(obEmpleado);
        return this.myEmpleados.Guardar();
    }

    @Override
    public boolean ActualizarEmpleado(clsEmpleado obEmpleado) {
        this.myEmpleados = new LEmpleados(obEmpleado);
        return this.myEmpleados.Actualizar();
    }

    @Override
    public boolean EliminarEmpleado(int idEmpleado) {
        this.myEmpleados = new LEmpleados(idEmpleado);
        return this.myEmpleados.Eliminar();
    }

    @Override
    public clsEmpleado ConsultarEmpleado(int idEmpleado) {
        this.myEmpleados = new LEmpleados(idEmpleado);
        return this.myEmpleados.Consultar();
    }

    @Override
    public ArrayList<clsEmpleado> ListarEmpleado() {
        this.myEmpleados = new LEmpleados();
        return this.myEmpleados.Listar();
    }

}
