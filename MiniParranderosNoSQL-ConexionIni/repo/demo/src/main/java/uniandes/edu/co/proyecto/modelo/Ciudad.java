package uniandes.edu.co.proyecto.modelo;

import lombok.ToString;

@ToString
public class Ciudad {
    private int id_ciudad;
    private String nombre;

    public Ciudad(int id_ciudad, String nombre) {
        this.id_ciudad = id_ciudad;
        this.nombre = nombre;
    }

    public int getId_ciudad() {
        return id_ciudad;
    }

    public void setId_ciudad(int id_ciudad) {
        this.id_ciudad = id_ciudad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
