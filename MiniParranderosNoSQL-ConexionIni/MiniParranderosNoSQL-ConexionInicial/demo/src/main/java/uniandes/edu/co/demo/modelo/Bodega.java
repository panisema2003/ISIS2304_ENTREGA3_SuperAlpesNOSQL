package uniandes.edu.co.demo.modelo;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection ="bodega")
public class Bodega {
    @Id
    private int id;
    private String nombre;
    private double tamanio;

    @DBRef
    private Sucursal sucursal;

    private List<ProductosEnBodega> productos_en_bodega;

    public Bodega() {
    }

    public Bodega(int id, String nombre, double tamanio, Sucursal sucursal,
            List<ProductosEnBodega> productos_en_bodega) {
        this.id = id;
        this.nombre = nombre;
        this.tamanio = tamanio;
        this.sucursal = sucursal;
        this.productos_en_bodega = productos_en_bodega;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getTamanio() {
        return tamanio;
    }

    public void setTamanio(double tamanio) {
        this.tamanio = tamanio;
    }

    public Sucursal getSucursal() {
        return sucursal;
    }

    public void setSucursal(Sucursal sucursal) {
        this.sucursal = sucursal;
    }

    public List<ProductosEnBodega> getProductos_en_bodega() {
        return productos_en_bodega;
    }

    public void setProductos_en_bodega(List<ProductosEnBodega> productos_en_bodega) {
        this.productos_en_bodega = productos_en_bodega;
    }

    

}
