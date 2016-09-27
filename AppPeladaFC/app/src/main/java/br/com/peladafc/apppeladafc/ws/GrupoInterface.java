package br.com.peladafc.apppeladafc.ws;

import java.util.List;

import br.com.peladafc.apppeladafc.model.Grupo;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

/**
 * Created by renanjunior on 9/27/16.
 */

public interface GrupoInterface {

    @GET("/grupo/")
    Call<List<Grupo>> getGrupo();

    @GET("/grupo/{id}")
    Call<Grupo> getGrupoByID(@Path("id") String id);

    @POST("/grupo/")
    Call <Grupo> createGrupo(@Body Grupo grupo);

    @DELETE("/grupo/{id}")
    Call<Void> deleteGrupo(@Path("id") String id);

    @PUT("/grupo/")
    Call<Grupo> updateGrupo(@Body Grupo grupo);

}
