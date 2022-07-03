package pmca.bl;

/**
 *
 * @author Admin
 */
public class clsActivo {
    //Atributos de la entidad
    private int idActivo; // atributo llave
    private String codigo;
    private String tipo;
    private String nombre;
    private String descripción;
    private boolean estado;
    private int cantidad;
    
    //Proriedades Get y Set
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
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripción() {
        return descripción;
    }

    public void setDescripción(String descripción) {
        this.descripción = descripción;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    //Constructores
    public clsActivo(){}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
