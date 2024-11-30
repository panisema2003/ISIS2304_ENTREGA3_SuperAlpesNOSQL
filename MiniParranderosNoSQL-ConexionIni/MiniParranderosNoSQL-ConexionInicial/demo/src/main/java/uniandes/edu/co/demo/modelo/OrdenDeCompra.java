package uniandes.edu.co.demo.modelo;

import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "orden_de_compra")
public class OrdenDeCompra {

    @Id
    private int id;
    private Date fechas_esperada_entrega;
    private String estado;
    private List<ProductosOrdenCompra> productos_orden_compra;

    @DBRef
    private Sucursal sucursal;

    @DBRef
    private Proveedor proveedor;

    public OrdenDeCompra(int id, Date fechas_esperada_entrega, String estado,
            List<ProductosOrdenCompra> productos_orden_compra, Sucursal sucursal, Proveedor proveedor) {
        this.id = id;
        this.fechas_esperada_entrega = fechas_esperada_entrega;
        this.estado = estado;
        this.productos_orden_compra = productos_orden_compra;
        this.sucursal = sucursal;
        this.proveedor = proveedor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getFechas_esperada_entrega() {
        return fechas_esperada_entrega;
    }

    public void setFechas_esperada_entrega(Date fechas_esperada_entrega) {
        this.fechas_esperada_entrega = fechas_esperada_entrega;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public List<ProductosOrdenCompra> getProductos_orden_compra() {
        return productos_orden_compra;
    }

    public void setProductos_orden_compra(List<ProductosOrdenCompra> productos_orden_compra) {
        this.productos_orden_compra = productos_orden_compra;
    }

    public Sucursal getSucursal() {
        return sucursal;
    }

    public void setSucursal(Sucursal sucursal) {
        this.sucursal = sucursal;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    
}
