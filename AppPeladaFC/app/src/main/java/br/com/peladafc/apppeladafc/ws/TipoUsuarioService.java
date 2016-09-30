package br.com.peladafc.apppeladafc.ws;

import java.io.IOException;
import java.util.List;

import br.com.peladafc.apppeladafc.model.TipoUsuario;
import br.com.peladafc.apppeladafc.util.UtilJson;
import retrofit2.Call;
import retrofit2.Response;

/**
 * Created by arthursilva on 29/09/16.
 */

public class TipoUsuarioService {
    TipoUsuarioInterface tipoUsuarioInterface;


    public TipoUsuarioService(){
        tipoUsuarioInterface = ((TipoUsuarioInterface)RestClient.getInstance(TipoUsuarioInterface.class));
    }

    public List<TipoUsuario> listaTipoUsuarios(){
        Call<List<TipoUsuario>> call = tipoUsuarioInterface.getTipoUsuario();
        List<TipoUsuario> tipoUsuarios = null;
        try {
            tipoUsuarios = call.execute().body();
        } catch (IOException e) {
            e.printStackTrace();
        }
        for(int i =0 ; i < tipoUsuarios.size(); i++) {
            System.out.print("TipoUsuario : " + UtilJson.toJson(tipoUsuarios.get(i)));
        }
        return tipoUsuarios;
    }

    public TipoUsuario createTipoUsuario(TipoUsuario tipoUsuario){
        Call<TipoUsuario> call = tipoUsuarioInterface.createTipoUsuario(tipoUsuario);
        Response<TipoUsuario> response;
        try {
            response = call.execute();
            tipoUsuario = response.body();
        }catch (IOException e){
            e.printStackTrace();
        }
        System.out.print("TipoUsuario : " + tipoUsuario.getDescricao());
        return tipoUsuario;
    }

    public void deleteTipoUsuario(Integer id){
        Call<Void> call = tipoUsuarioInterface.deleteTipoUsuario(id);
        try{
            call.execute().body();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public TipoUsuario getTipoUsuarioByID(Integer id){
        Call<TipoUsuario> call = tipoUsuarioInterface.getTipoUsuarioByID(id);
        TipoUsuario tipoUsuario = null;
        try {
            tipoUsuario = call.execute().body();
        }catch (IOException e){
            e.printStackTrace();
        }
        return tipoUsuario;
    }

    public TipoUsuario updateTipoUsuario(TipoUsuario tipoUsuario){
        Call<TipoUsuario> call = tipoUsuarioInterface.updateTipoUsuario(tipoUsuario);
        TipoUsuario tipoUsuario_retorno = null;
        try{
            tipoUsuario_retorno = call.execute().body();
        }catch (IOException e){
            e.printStackTrace();
        }
        return tipoUsuario_retorno;
    }
}
