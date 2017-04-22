package Controlador;

import Modelo.Objetos;
import Modelo.Usuario;
import javax.inject.Singleton;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by aleix on 19/04/2017.
 */

@Path("/json/")
@Singleton
public class Service {

    protected  EetakemonManagerClass c;
    public Service() {
        c=EetakemonManagerClass.getEetakemonManagerClass();
        c.anadirUsuario(new Usuario("Mikel"));
        c.anadirUsuario(new Usuario("Aleix"));
        c.anadirObjetoUsuario(0, new Objetos("Palo"));
        c.anadirObjetoUsuario(1, new Objetos("Tijeras"));
    }

    //Añadir Usuario
    @POST
    @Path("/Usuario")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response newUsuario(Usuario user) {
        c.anadirUsuario(user);
        return Response.status(201).entity("Añadido: ").build();
    }

    //Añadir un objeto a un usuario
    @POST
    @Path("/ObjetosUsuario/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response Objetonuevo (@PathParam("id") int id, Objetos obj) {
        c.anadirObjetoUsuario(id, obj );
        return Response.status(201).entity("Objeto añadido: ").build();
    }

    //Modificar
    @POST
    @Path("/ModificarUsuario/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response modificarUsuario(@PathParam("id") int id,Usuario user) {
        c.modificarUsuario(id, user.getNombre());
        return Response.status(201).entity("Usuario modificado: ").build();
    }

    //Lista de usuarios
    @GET
    @Path("/Usuario")
    @Consumes(MediaType.APPLICATION_JSON)
    public List<Usuario> listaObjetos(){
        List<Usuario> lista = new ArrayList<Usuario>();
        lista = c.listarUsuarios();
        return lista;
    }

    //Lista de objetos de un usuario
    @GET
    @Path("/ObjetosUsuario/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    public List<Objetos> listaObjetos(@PathParam("id") int id){
        List<Objetos> lista = new ArrayList<Objetos>();
        lista=c.ObjetoUsuario(id);
        return lista;
    }

    //obtener usuario
    @GET
    @Path("/Usuario/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Usuario getUsuario(@PathParam("id") int id) {
        Usuario usu = new Usuario();
        usu = c.InfoUsuario(id);
        System.out.println(usu.toString());
        return usu;
    }
}
