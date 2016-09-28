package br.com.peladafc.apppeladafc.ws;

import java.io.IOException;
import java.util.List;

import br.com.peladafc.apppeladafc.model.Grupo;
import br.com.peladafc.apppeladafc.util.UtilJson;
import retrofit2.Call;

/**
 * Created by renanjunior on 9/27/16.
 */

public class GrupoService {


    GrupoInterface grupoInterface;


    public GrupoService() {
        grupoInterface = ((GrupoInterface) RestClient.getInstance(GrupoInterface.class));
    }

    public List<Grupo> listaGrupos() {
        Call<List<Grupo>> call = grupoInterface.getGrupo();
        List<Grupo> grupos = null;
        try {
            grupos = call.execute().body();
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < grupos.size(); i++) {
            System.out.print("Grupo : " + UtilJson.toJson(grupos.get(i)));
        }
        return grupos;
    }

    public Grupo createGrupo(Grupo grupo) {
        Call<Grupo> call = grupoInterface.createGrupo(grupo);
        try {
            grupo = call.execute().body();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.print("Grupo : " + grupo.getNome_grupo());
        return grupo;
    }

    public void deleteGrupo(String id) {
        Call<Void> call = grupoInterface.deleteGrupo(id);
        try {
            call.execute().body();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Grupo getGrupoByID(String id) {
        Call<Grupo> call = grupoInterface.getGrupoByID(id);
        Grupo grupo = null;
        try {
            grupo = call.execute().body();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return grupo;
    }

    public Grupo updateGrupo(Grupo grupo) {
        Call<Grupo> call = grupoInterface.updateGrupo(grupo);
        Grupo grupo_retorno = null;
        try {
            grupo_retorno = call.execute().body();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return grupo_retorno;
    }

}
