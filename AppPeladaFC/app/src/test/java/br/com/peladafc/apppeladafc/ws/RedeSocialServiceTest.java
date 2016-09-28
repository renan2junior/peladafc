package br.com.peladafc.apppeladafc.ws;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import br.com.peladafc.apppeladafc.model.RedeSocial;

/**
 * Created by arthursilva on 28/09/16.
 */

public class RedeSocialServiceTest {

    RedeSocialService s;

    @Before
    public void initObjects(){
        s = new RedeSocialService();
    }

    @Test
    public void testListaRedeSocials() throws Exception {
        s.listaRedeSocials();
    }

    @Test
    public void testCreateRedeSocial() throws Exception{
        List<RedeSocial> redeSocials = s.listaRedeSocials();
        for (RedeSocial redesocial: redeSocials)
            s.deleteRedeSocial(String.valueOf(redesocial.getId()));

        RedeSocial t = new RedeSocial();
        t.setDescricao("facebook");
        s.createRedeSocial(t);

        RedeSocial t2 = new RedeSocial();
        t2.setDescricao("orkut");
        s.createRedeSocial(t2);

    }

    @Test
    public void testDeleteRedeSocial() throws Exception{
        s.deleteRedeSocial("10");
    }

    @Test
    public void testListaNovamenteRedeSocials() throws Exception {
        s.listaRedeSocials();
    }

    @Test
    public void testUpdateRedeSocial() throws Exception{
        RedeSocial redesocial = s.getRedeSocialByID("7");
        redesocial.setDescricao("google plus");
        s.updateRedeSocial(redesocial);
    }
}
