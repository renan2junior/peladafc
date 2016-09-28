package br.com.peladafc.apppeladafc.ws;

import org.junit.Before;
import org.junit.Test;

import br.com.peladafc.apppeladafc.model.Usuario;

/**
 * Created by renanjunior on 9/12/16.
 */
public class UsuarioServiceTest {


    UsuarioService s;

    @Before
    public void initObjects(){
        s = new UsuarioService();
    }

    @Test
    public void testListaUsuarios() throws Exception {
        s.listaUsuarios();
    }

    @Test
    public void testCreateUsuario() throws Exception{
        Usuario t = new Usuario();
        t.setNome("Renan Junior");
        t.setEmail("renan2junior@gmail.com");
        t.setMensalista(true);
        t.setTelefone("21 967752534");
        t.setTime_id(1);
        t.setTipo_usuario_id(1);
        s.createUsuario(t);

        Usuario t2 = new Usuario();
        t2.setNome("Ze Mane");
        t2.setEmail("ze@gmail.com");
        t2.setMensalista(true);
        t2.setTelefone("21 111122222");
        t2.setTime_id(12);
        t.setTipo_usuario_id(1);
        s.createUsuario(t2);

    }

    @Test
    public void testDeleteUsuario() throws Exception{
        s.deleteUsuario("5");
    }

    @Test
    public void testListaNovamenteUsuarios() throws Exception {
        s.listaUsuarios();
    }

    @Test
    public void testUpdateUsuario() throws Exception{
        Usuario usuario = s.getUsuarioByID("1");
        usuario.setNome("Clodoaldo Silva");
        s.updateUsuario(usuario);
    }

}
