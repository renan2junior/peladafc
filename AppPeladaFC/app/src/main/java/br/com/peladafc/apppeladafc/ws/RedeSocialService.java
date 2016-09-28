package br.com.peladafc.apppeladafc.ws;

import java.io.IOException;
import java.util.List;

import br.com.peladafc.apppeladafc.model.RedeSocial;
import br.com.peladafc.apppeladafc.util.UtilJson;
import retrofit2.Call;

/**
 * Created by arthursilva on 28/09/16.
 */

public class RedeSocialService {

    RedeSocialInterface redesocialInterface;


    public RedeSocialService() {
        redesocialInterface = ((RedeSocialInterface) RestClient.getInstance(RedeSocialInterface.class));
    }

    public List<RedeSocial> listaRedeSocials() {
        Call<List<RedeSocial>> call = redesocialInterface.getRedeSocial();
        List<RedeSocial> redesociais = null;
        try {
            redesociais = call.execute().body();
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < redesociais.size(); i++) {
            System.out.print("RedeSocial : " + UtilJson.toJson(redesociais.get(i)));
        }
        return redesociais;
    }

    public RedeSocial createRedeSocial(RedeSocial redesocial) {
        Call<RedeSocial> call = redesocialInterface.createRedeSocial(redesocial);
        try {
            redesocial = call.execute().body();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.print("RedeSocial : " + redesocial.getDescricao());
        return redesocial;
    }

    public void deleteRedeSocial(String id) {
        Call<Void> call = redesocialInterface.deleteRedeSocial(id);
        try {
            call.execute().body();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public RedeSocial getRedeSocialByID(String id) {
        Call<RedeSocial> call = redesocialInterface.getRedeSocialByID(id);
        RedeSocial redesocial = null;
        try {
            redesocial = call.execute().body();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return redesocial;
    }

    public RedeSocial updateRedeSocial(RedeSocial redesocial) {
        Call<RedeSocial> call = redesocialInterface.updateRedeSocial(redesocial);
        RedeSocial redesocial_retorno = null;
        try {
            redesocial_retorno = call.execute().body();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return redesocial_retorno;
    }
}
