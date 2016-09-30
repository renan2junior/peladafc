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
    private LocalServiceTest localTest;

    @Before
    public void initObjects(){
        s = new GrupoService();
        localTest = new LocalServiceTest();
    }

    @Test
    public void testListaGrupos() throws Exception {
        s.listaGrupos();
    }

    @Test
    public void testCreateGrupo() throws Exception{
        localTest.createLocalData();

        Local l1 = localTest.saveLocalData(localTest.getLocais().get(0));
        Grupo t = new Grupo();
        t.setNome("CICM3");
        t.setNomeContato("Renan");
        t.setEmailContato("renan2junior@gmail.com");
        t.setTelefone("21 967752534");
        t.setHorario("10:00");
        t.setConta("100 / 2345");
        t.setLocal(l1);
        t.setUsuario(new Usuario(1));
        s.createGrupo(t);

        Local l2 = localTest.saveLocalData(localTest.getLocais().get(1));
        Grupo t2 = new Grupo();
        t2.setNome("IGREJA");
        t2.setNomeContato("Thiago");
        t2.setEmailContato("thiago@gmail.com");
        t2.setTelefone("21 222233333");
        t2.setHorario("10:00");
        t2.setConta("408 / 3232");
        t2.setLocal(l2);
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
        grupo.setNomeContato("Clodoaldo Silva");
        s.updateGrupo(grupo);
    }

}
