package br.com.peladafc.apppeladafc.ws;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import br.com.peladafc.apppeladafc.model.TipoUsuario;

/**
 * Created by arthursilva on 29/09/16.
 */

public class TipoUsuarioServiceTest {
    TipoUsuarioService s;
    private List<TipoUsuario> tipousuarios;

    public List<TipoUsuario> createLocalData(){
        tipousuarios = new ArrayList<TipoUsuario>();

        tipousuarios.add(new TipoUsuario(
                "Administrador"
        ));

        tipousuarios.add(new TipoUsuario(
                "Jogador"
        ));

        return tipousuarios;
    }

    public TipoUsuario saveTipoUsuarioData(TipoUsuario tipoUsuario){
        initObjects();
        return s.createTipoUsuario(tipoUsuario);
    }

    public List<TipoUsuario> getTipousUarios(){
        return tipousuarios;
    }


    @Before
    public void initObjects(){
        s = new TipoUsuarioService();
    }

    @Test
    public void testListaTipoUsuarios() throws Exception {
        s.listaTipoUsuarios();
    }

    @Test
    public void testCreateTipoUsuario() throws Exception{
        TipoUsuario t = new TipoUsuario();
        t.setDescricao("Bostafogo2");
        s.createTipoUsuario(t);
    }

    @Test
    public void testDeleteTipoUsuario() throws Exception{
        s.deleteTipoUsuario(5);
    }

    @Test
    public void testListaNovamenteTipoUsuarios() throws Exception {
        s.listaTipoUsuarios();
    }

    @Test
    public void testUpdateTipoUsuario() throws Exception{
        TipoUsuario time = s.getTipoUsuarioByID(12);
        time.setDescricao("Palmeiras");
        s.updateTipoUsuario(time);
    }
}
