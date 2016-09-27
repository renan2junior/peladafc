package br.com.peladafc.apppeladafc.ws;

import org.junit.Before;
import org.junit.Test;

import br.com.peladafc.apppeladafc.model.Local;

/**
 * Created by renanjunior on 9/27/16.
 */

public class LocalServiceTest {

    LocalService s;

    @Before
    public void initObjects(){
        s = new LocalService();
    }

    @Test
    public void testListaLocals() throws Exception {
        s.listaLocals();
    }

    @Test
    public void testCreateLocal() throws Exception{
        Local t = new Local();
        t.setNome("Colegio");
        t.setNome_contato("Joao");
        t.setEmail_contato("joao@gmail.com");
        t.setConta_deposito("1001 / 171");
        t.setEndereco("Rua Coracao de Maria");
        t.setTelefone_contato("21 4444444");
        s.createLocal(t);

        Local t2 = new Local();
        t2.setNome("Clube Militar");
        t2.setNome_contato("Pedro");
        t2.setEmail_contato("pedro@gmail.com");
        t2.setConta_deposito("1444 / 2323");
        t2.setEndereco("Rua Maria Jose");
        t2.setTelefone_contato("21 555555");
        s.createLocal(t2);
    }

    @Test
    public void testDeleteLocal() throws Exception{
        s.deleteLocal("5");
    }

    @Test
    public void testListaNovamenteLocals() throws Exception {
        s.listaLocals();
    }

    @Test
    public void testUpdateLocal() throws Exception{
        Local local = s.getLocalByID("1");
        local.setNome("Bombeiro");
        s.updateLocal(local);
    }

}
