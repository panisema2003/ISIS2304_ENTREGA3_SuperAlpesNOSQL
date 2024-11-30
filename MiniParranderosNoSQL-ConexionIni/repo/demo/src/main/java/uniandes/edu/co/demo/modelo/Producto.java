package uniandes.edu.co.demo.modelo;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "producto")
public class Producto {

    @Id
    private int id;
    private String nombre;
    private int costo_bodega;
    private int precio_unidad;
    private String presentacion;
    private double cantidad_presentecion;
    private int volumen;
    private int peso_empaque;
    private String unidad_medida;
    private Date fecha_expiracion;
    private Categoria categoria;
    
    public Producto() {
    }

    public Producto(int id, String nombre, int costo_bodega, int precio_unidad, String presentacion,
            double cantidad_presentecion, int volumen, int peso_empaque, String unidad_medida, Date fecha_expiracion,
            Categoria categoria) {
        this.id = id;
        this.nombre = nombre;
        this.costo_bodega = costo_bodega;
        this.precio_unidad = precio_unidad;
        this.presentacion = presentacion;
        this.cantidad_presentecion = cantidad_presentecion;
        this.volumen = volumen;
        this.peso_empaque = peso_empaque;
        this.unidad_medida = unidad_medida;
        this.fecha_expiracion = fecha_expiracion;
        this.categoria = categoria;
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

    public int getCosto_bodega() {
        return costo_bodega;
    }

    public void setCosto_bodega(int costo_bodega) {
        this.costo_bodega = costo_bodega;
    }

    public int getPrecio_unidad() {
        return precio_unidad;
    }

    public void setPrecio_unidad(int precio_unidad) {
        this.precio_unidad = precio_unidad;
    }

    public String getPresentacion() {
        return presentacion;
    }

    public void setPresentacion(String presentacion) {
        this.presentacion = presentacion;
    }

    public double getCantidad_presentecion() {
        return cantidad_presentecion;
    }

    public void setCantidad_presentecion(double cantidad_presentecion) {
        this.cantidad_presentecion = cantidad_presentecion;
    }

    public int getVolumen() {
        return volumen;
    }

    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }

    public int getPeso_empaque() {
        return peso_empaque;
    }

    public void setPeso_empaque(int peso_empaque) {
        this.peso_empaque = peso_empaque;
    }

    public String getUnidad_medida() {
        return unidad_medida;
    }

    public void setUnidad_medida(String unidad_medida) {
        this.unidad_medida = unidad_medida;
    }

    public Date getFecha_expiracion() {
        return fecha_expiracion;
    }

    public void setFecha_expiracion(Date fecha_expiracion) {
        this.fecha_expiracion = fecha_expiracion;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    
}
