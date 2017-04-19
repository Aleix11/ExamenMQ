package Controlador;

import Modelo.Objetos;
import Modelo.Usuario;
import javax.inject.Singleton;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by aleix on 19/04/2017.
 */

@Path("/json/")
@Singleton
public class Service {

    protected  EetakemonManagerClass c;
    public Service() {
    }

    @POST
    @Path("/Usuario")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response newUsuario(Usuario user) {
        c.anadirUsuario(user);
        return Response.status(201).entity("Añadido: ").build();
    }

    @POST
    @Path("/Usuario/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response modificarUsuario(Usuario user) {
        c.anadirUsuario(user);
        return Response.status(201).entity("Usuario añadido: ").build();
    }

    @GET
    @Path("/Usuario")
    @Consumes(MediaType.APPLICATION_JSON)
    public List<Objetos> listaObjetos(
        ArrayList<Objetos>() lista;
    )




}
