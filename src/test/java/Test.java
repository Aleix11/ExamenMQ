import Controlador.EetakemonManagerClass;
import Modelo.Objetos;
import Modelo.Usuario;
import org.junit.After;
import org.junit.Before;
import static org.junit.Assert.*;

/**
 * Created by aleix on 19/04/2017.
 */
public class Test {
    static EetakemonManagerClass aaa;

    @Before
    public void setUp() throws Exception {
        aaa = EetakemonManagerClass.getEetakemonManagerClass();
        aaa.anadirUsuario(new Usuario("Aleix"));
        aaa.anadirUsuario(new Usuario("Mikel"));
        aaa.anadirObjetoUsuario(1, new Objetos("Palo"));
        aaa.anadirObjetoUsuario(1, new Objetos("Tijeras"));
    }

    @After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void prueba() {

        Usuario u = new Usuario("Aleix");

        aaa.anadirUsuario(u);
    }
    @org.junit.Test
    public void anadirObjeto(){
        Objetos o = new Objetos("Bici");
        aaa.anadirObjetoUsuario(1, o);
        aaa.ObjetoUsuario(1);
    }
}
