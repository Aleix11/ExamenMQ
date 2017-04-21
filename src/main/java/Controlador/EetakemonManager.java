package Controlador;

import Modelo.Objetos;
import Modelo.Usuario;

import java.util.List;

/**
 * Created by aleix on 19/04/2017.
 */
public interface EetakemonManager {
    public List<Usuario> listarUsuarios();
    public void anadirUsuario(Usuario aa);
    public void modificarUsuario(int ID, String nombre);
    public Usuario InfoUsuario(int ID);
    public List<Objetos> ObjetoUsuario(int ID);
    public void anadirObjetoUsuario(int ID, Objetos obj);

}
