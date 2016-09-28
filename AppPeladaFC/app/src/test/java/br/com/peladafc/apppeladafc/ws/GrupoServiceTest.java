package br.com.peladafc.apppeladafc.ws;

import org.junit.Before;
import org.junit.Test;

import br.com.peladafc.apppeladafc.model.Grupo;
import br.com.peladafc.apppeladafc.model.Local;
import br.com.peladafc.apppeladafc.model.Usuario;

/**
 * Created by renanjunior on 9/27/16.
 */

public class GrupoServiceTest {

    GrupoService s;

    @Before
    public void initObjects(){
        s = new GrupoService();
    }

    @Test
    public void testListaGrupos() throws Exception {
        s.listaGrupos();
    }

    @Test
    public void testCreateGrupo() throws Exception{
        Grupo t = new Grupo();
        t.setNome_grupo("CICM3");
        t.setNome_contato("Renan");
        t.setEmail_contato("renan2junior@gmail.com");
        t.setTelefone_grupo("21 967752534");
        t.setHorario("10:00");
        t.setConta_grupo("100 / 2345");
        t.setLocal(new Local(1));
        t.setUsuario(new Usuario(1));
        s.createGrupo(t);

        Grupo t2 = new Grupo();
        t2.setNome_grupo("IGREJA");
        t2.setNome_contato("Thiago");
        t2.setEmail_contato("thiago@gmail.com");
        t2.setTelefone_grupo("21 222233333");
        t2.setHorario("10:00");
        t2.setConta_grupo("408 / 3232");
        t2.setLocal(new Local(1));
        t2.setUsuario(new Usuario(1));
        s.createGrupo(t2);

    }

    @Test
    public void testDeleteGrupo() throws Exception{
        s.deleteGrupo("5");
    }

    @Test
    public void testListaNovamenteGrupos() throws Exception {
        s.listaGrupos();
    }

    @Test
    public void testUpdateGrupo() throws Exception{
        Grupo grupo = s.getGrupoByID("1");
        grupo.setNome_contato("Clodoaldo Silva");
        s.updateGrupo(grupo);
    }

}
