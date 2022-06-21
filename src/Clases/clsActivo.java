
package Clases;

/**
 *
 * @author karii
 */
public class clsActivo {
   private int idActivo;
   private String codigo;
   private String tipo;
   private String Nombre;
   private String Descripcion;
   private boolean Estado;
   private int Cantidad; 
   private String Fragilidad;

    public int getIdActivo() {
        return idActivo;
    }

    public void setIdActivo(int idActivo) {
        this.idActivo = idActivo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public boolean isEstado() {
        return Estado;
    }

    public void setEstado(boolean Estado) {
        this.Estado = Estado;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }

    public String getFragilidad() {
        return Fragilidad;
    }

    public void setFragilidad(String Fragilidad) {
        this.Fragilidad = Fragilidad;
    }

    public clsActivo() {}
   
    
   
}
