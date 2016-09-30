package br.com.peladafc.apppeladafc.ws;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import br.com.peladafc.apppeladafc.model.Local;
import br.com.peladafc.apppeladafc.model.Time;
import br.com.peladafc.apppeladafc.model.TipoUsuario;
import br.com.peladafc.apppeladafc.model.Usuario;

/**
 * Created by renanjunior on 9/12/16.
 */
public class UsuarioServiceTest {


    UsuarioService s;
    private TipoUsuarioServiceTest tipoUsuarioTest;

    public void clearUsuarioDB(){
        List<Usuario> usuarios = s.listaUsuarios();
        for (Usuario usuario : usuarios) {
            s.deleteUsuario(usuario.getId());
        }
    }

    @Before
    public void initObjects(){
        s = new UsuarioService();
        tipoUsuarioTest = new TipoUsuarioServiceTest();
    }

    @Test
    public void testListaUsuarios() throws Exception {
        List<Usuario> usuarios = s.listaUsuarios();
    }

    @Test
    public void testCreateUsuario() throws Exception{
        tipoUsuarioTest.createLocalData();

        TipoUsuario tu1 = tipoUsuarioTest.saveTipoUsuarioData(tipoUsuarioTest.getTipousUarios().get(0));

        Usuario t = new Usuario();
        t.setNome("Renan Junior");
        t.setEmail("renan2junior@gmail.com");
        t.setMensalista(true);
        t.setTelefone("21 967752534");
        t.setTime(new Time(1));
        t.setTipoUsuario(tu1);
        s.createUsuario(t);

        TipoUsuario tu2 = tipoUsuarioTest.saveTipoUsuarioData(tipoUsuarioTest.getTipousUarios().get(1));

        Usuario t2 = new Usuario();
        t2.setNome("Ze Mane");
        t2.setEmail("ze@gmail.com");
        t2.setMensalista(true);
        t2.setTelefone("21 111122222");
        t2.setTime(new Time(12));
        t.setTipoUsuario(tu2);
        s.createUsuario(t2);

    }

    @Test
    public void testDeleteUsuario() throws Exception{
        s.deleteUsuario(5);
    }

    @Test
    public void testListaNovamenteUsuarios() throws Exception {
        s.listaUsuarios();
    }

    @Test
    public void testUpdateUsuario() throws Exception{
        Usuario usuario = s.getUsuarioByID(1);
        usuario.setNome("Clodoaldo Silva");
        s.updateUsuario(usuario);
    }

    @Test
    public void testUsuarioById() throws Exception{
        Usuario usuario = s.getUsuarioByID(1);
    }

    @Test
    public void testUsuarioLogin() throws Exception{
        Usuario usuario = s.getUsuarioByLogin("arthur@gmail.com");
    }

}
