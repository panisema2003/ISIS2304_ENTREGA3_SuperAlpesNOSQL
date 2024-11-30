package uniandes.edu.co.demo.modelo;

import org.springframework.data.mongodb.core.mapping.DBRef;

import lombok.ToString;

@ToString
public class ProductosOrdenCompra {

    private int cantidad;
    private int precio;

    @DBRef
    private Producto producto;

    public ProductosOrdenCompra(int cantidad, int precio, Producto producto) {
        this.cantidad = cantidad;
        this.precio = precio;
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    

}
