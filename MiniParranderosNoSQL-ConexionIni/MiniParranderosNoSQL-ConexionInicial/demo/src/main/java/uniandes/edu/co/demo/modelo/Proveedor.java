package uniandes.edu.co.demo.modelo;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "proveedor")
public class Proveedor {

    @Id
    private long nit;
    private String nombre;
    private String direccion;
    private String nombre_contacto;
    private String telefono_contacto;

    @DBRef
    private List<Producto> productos;

    public Proveedor() {
    }

    public Proveedor(long nit, String nombre, String direccion, String nombre_contacto, String telefono_contacto,
            List<Producto> productos) {
        this.nit = nit;
        this.nombre = nombre;
        this.direccion = direccion;
        this.nombre_contacto = nombre_contacto;
        this.telefono_contacto = telefono_contacto;
        this.productos = productos;
    }

    public long getNit() {
        return nit;
    }

    public void setNit(long nit) {
        this.nit = nit;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNombre_contacto() {
        return nombre_contacto;
    }

    public void setNombre_contacto(String nombre_contacto) {
        this.nombre_contacto = nombre_contacto;
    }

    public String getTelefono_contacto() {
        return telefono_contacto;
    }

    public void setTelefono_contacto(String telefono_contacto) {
        this.telefono_contacto = telefono_contacto;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    
}
