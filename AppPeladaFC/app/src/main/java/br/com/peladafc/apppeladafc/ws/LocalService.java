package br.com.peladafc.apppeladafc.ws;

import java.io.IOException;
import java.util.List;

import br.com.peladafc.apppeladafc.model.Local;
import br.com.peladafc.apppeladafc.util.UtilJson;
import retrofit2.Call;

/**
 * Created by renanjunior on 9/27/16.
 */

public class LocalService {

    LocalInterface localInterface;


    public LocalService(){
        localInterface = ((LocalInterface)RestClient.getInstance(LocalInterface.class));
    }

    public List<Local> listaLocals(){
        Call<List<Local>> call = localInterface.getLocal();
        List<Local> locals = null;
        try {
            locals = call.execute().body();
        } catch (IOException e) {
            e.printStackTrace();
        }
        for(int i =0 ; i < locals.size(); i++) {
            System.out.print("Local : " + UtilJson.toJson(locals.get(i)));
        }
        return locals;
    }

    public Local createLocal(Local local){
        Call<Local> call = localInterface.createLocal(local);
        try {
            local = call.execute().body();
        }catch (IOException e){
            e.printStackTrace();
        }
        System.out.print("Local : " + local.getNome());
        return local;
    }

    public void deleteLocal(String id){
        Call<Void> call = localInterface.deleteLocal(id);
        try{
            call.execute().body();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public Local getLocalByID(String id){
        Call<Local> call = localInterface.getLocalByID(id);
        Local local = null;
        try {
            local = call.execute().body();
        }catch (IOException e){
            e.printStackTrace();
        }
        return local;
    }

    public Local updateLocal(Local local){
        Call<Local> call = localInterface.updateLocal(local);
        Local local_retorno = null;
        try{
            local_retorno = call.execute().body();
        }catch (IOException e){
            e.printStackTrace();
        }
        return local_retorno;
    }


}
