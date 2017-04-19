package Modelo;

/**
 * Created by aleix on 19/04/2017.
 */
public class Objetos {

    private int id;
    private String nombre;

    public void setNombre(String nombre) {
        this.id=id;this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString(){
        return("Objeto: ["+ id + "-" + nombre+"]");
    }
}
