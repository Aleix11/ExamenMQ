package Modelo;

import java.util.*;

/**
 * Created by aleix on 19/04/2017.
 */
public class Usuario {

    private List<Objetos> objetosss;
    private String nombre;
    private int ID;

    public Usuario (String nombre)
    {
        this.objetosss=objetosss;
    }

    public Usuario(){

    }

    public List<Objetos> getObjetosss() {
        return objetosss;
    }

    public void setObjetosss(List<Objetos> objetosss) {
        this.objetosss = objetosss;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Usuario [Id =" + ID+ ",Nombre=" + nombre + "]";
    }
}
