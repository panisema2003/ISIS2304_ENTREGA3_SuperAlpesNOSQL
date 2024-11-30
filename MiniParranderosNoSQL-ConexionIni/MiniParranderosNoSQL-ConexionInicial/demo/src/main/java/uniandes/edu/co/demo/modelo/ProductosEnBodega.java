package uniandes.edu.co.demo.modelo;

import org.springframework.data.mongodb.core.mapping.DBRef;

public class ProductosEnBodega {

    @DBRef
    private Producto producto;
    private int cantidad;
    private int costo_promedio;
    private int minimo_reorden;

    
    public ProductosEnBodega() {
    }

    public ProductosEnBodega(Producto producto, int cantidad, int costo_promedio, int minimo_reorden) {
        this.producto = producto;
        this.cantidad = cantidad;
        this.costo_promedio = costo_promedio;
        this.minimo_reorden = minimo_reorden;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getCosto_promedio() {
        return costo_promedio;
    }

    public void setCosto_promedio(int costo_promedio) {
        this.costo_promedio = costo_promedio;
    }

    public int getMinimo_reorden() {
        return minimo_reorden;
    }

    public void setMinimo_reorden(int minimo_reorden) {
        this.minimo_reorden = minimo_reorden;
    }
    
}
