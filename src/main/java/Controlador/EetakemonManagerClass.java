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

    final static Logger logger = Logger.getLogger(EetakemonManagerClass.class);
    private static EetakemonManagerClass aaa;

    private Hashtable<Integer,Usuario> tablaUsuarios;
    private List<Objetos> objetoss;
    private int ID;

    private EetakemonManagerClass(){
        tablaUsuarios = new Hashtable<>();
        objetoss = new ArrayList<Objetos>();
    }

    public static EetakemonManagerClass getEetakemonManagerClass() {
        if (aaa == null) {aaa = new EetakemonManagerClass();}
        return aaa;
    }



    public List<Usuario> listarUsuarios(){
        logger.info("METODO: Listar usuarios alfabéticamente");
        List<Usuario> listTemp = Collections.list(tablaUsuarios.elements());
        Collections.sort (listTemp, new Comparator<Usuario> (){
            @Override
            public int compare (final Usuario a, final Usuario b){
                return (a.getNombre().compareTo(b.getNombre())); }});

        logger.info("RESULTADO: "+listTemp.toString());
        return listTemp;
    }

    public void anadirUsuario(Usuario aa) {
        logger.info("Usuario: "+aa);;
        aa.setID(ID);
        tablaUsuarios.put(ID, aa);
        ID++;
        logger.info("Añadido!");
    }

    public void modificarUsuario(int ID, String nombre) {
        logger.info("METODO: modificar siguiente usuario: "+tablaUsuarios.get(ID).getNombre());
        tablaUsuarios.get(ID).setNombre(nombre);
        logger.info("Usuario modificado: "+ tablaUsuarios.get(ID).getNombre());
    }

    public Usuario InfoUsuario(int ID) {
        logger.info("METODO: consultar información usuario: "+ ID);
        Usuario utemp = tablaUsuarios.get(ID);
        if (utemp == null) {
            logger.info("RESULTADO: usuario no existente");
        }else{
            logger.info("RESULTADO: "+utemp.toString());
        }
        return utemp;
    }

    public List<Objetos> ObjetoUsuario(int ID){
        logger.info("METODO: obtener objetos");
        Usuario utemp = tablaUsuarios.get(ID);
        List<Objetos> otemp = utemp.getObjetosss();
        if (otemp.size()==0){
            logger.info("RESULTADO: No tiene objetos");

        }else {
            StringBuffer buff = new StringBuffer();
            for (Objetos obj : otemp) {
                buff.append(obj.getNombre() + ",");
            }
            buff.deleteCharAt(buff.length() - 1);
            logger.info("RESULTADO: Usuario: " + utemp.getNombre() + "; Objetos: " + buff.toString());
        }
        return otemp;
    }

    public void anadirObjetoUsuario(int ID, Objetos obj) {
        logger.info("METODO: añadir objeto: "+ obj);
        Usuario utemp = tablaUsuarios.get(ID);
        utemp.anadirObjeto(obj);
        objetoss.add(obj);
        logger.info("RESULTADO: Objeto añadido "+ obj.toString()+"; Usuario: "+
                utemp.getNombre()+"; Objetos:"+utemp.getObjetosss().size());
    }
}
