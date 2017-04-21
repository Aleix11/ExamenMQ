package Modelo;

/**
 * Created by aleix on 19/04/2017.
 */
public class Objetos {

    private String nombre;

    public Objetos(){}

    public Objetos(String nombre){
        this.nombre=nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }


    @Override
    public String toString(){
        return("Objeto: ["+ nombre+"]");
    }
}
