/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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
    public LActivo (){
        this.obOperaciones = new OpActivos();
    }

    public LActivo(clsActivo obActivo) {
        this.obActivo = obActivo;
        this.obOperaciones = new OpActivos();
    }
    public LActivo(int idActivo){
        this.idActivo = idActivo;
        this.obOperaciones = new OpActivos();
        
    }
    
  public boolean Guardar() {
      return this.obOperaciones.Guardar(this.obActivo);
      
  }
 
  public boolean Actualizar(){
      return this.obOperaciones.Actualizar(this.obActivo);
      
  }
  public clsActivo Consultar(){
      return this.obOperaciones.Consultar(this.idActivo);
      
  }
  public boolean Eliminar(){
      return this.obOperaciones.Eliminar(this.idActivo);
      
  }
  public ArrayList<clsActivo> Listar(){
      return this.obOperaciones.Listar();
      
  }
}
