package Controlador;

import Modelo.Objetos;
import Modelo.Usuario;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;



import java.util.*;
import java.util.Hashtable;
import java.util.List;

/**
 * Created by aleix on 19/04/2017.
 */
public class EetakemonManagerClass implements EetakemonManager {

    private static EetakemonManagerClass aaa;

    private HashMap<Integer,Usuario> tablaUsuarios;
    private List<Objetos> objetoss;
    private int ID;

    private EetakemonManagerClass(){
        tablaUsuarios = new HashMap<Integer,Usuario>();
        objetoss = new ArrayList<Objetos>();
    }

    public static EetakemonManagerClass getEetakemonManagerClass() {
        if (aaa == null) {aaa = new EetakemonManagerClass();}
        return aaa;
    }



    /*public List<Usuario> listarUsuarios(){

    }*/

    public void anadirUsuario(Usuario aa) {
        logger.info("Usuario: "+aa);
        logger.trace(tablaUsuarios);
        aa.setID(ID);
        tablaUsuarios.put(ID, aa);
        ID++;
        logger.info("Añadido!");
        logger.trace(tablaUsuarios);
    }

    public void modificarUsuario(int ID, String nombre) {
        logger.info("METODO: modificar siguiente usuario: "+tablaUsuarios.get(ID).getNombre());
        tablaUsuarios.get(ID).setNombre(nombre);
        logger.info("Usuario modificado: "+ tablaUsuarios.get(ID).getNombre());
    }

    public void InfoUsuario() {
        logger.info("METODO: consultar información usuario: "+tablaUsuarios.get(ID).toString());
        logger.trace(tablaUsuarios.get(ID));
    }

    public List<Objetos> ObjetoUsuario(int ID){
        for (Objetos aaaa: tablaUsuarios.get(ID).getObjetosss()){
            logger.info(aaaa.getId() + "-" + aaaa.getNombre());
        }

        return tablaUsuarios.get(ID).getObjetosss();
    }

    public void anadirObjetoUsuario(int ID, Objetos obj) {
        logger.info("METODO: añadir objeto: "+ obj);
        tablaUsuarios.get(ID).anadirObjeto(obj);
        objetoss.add(obj);
        logger.info("Objeto añadido "+obj.toString());
    }
}
