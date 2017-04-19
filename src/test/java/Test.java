import Controlador.EetakemonManagerClass;
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
    }

    @After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void prueba() {

        Usuario u = new Usuario("Aleix");

        aaa.anadirUsuario(u);
    }
}
