package br.com.peladafc.apppeladafc.ws;

import java.util.List;

import br.com.peladafc.apppeladafc.model.RedeSocial;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

/**
 * Created by arthursilva on 28/09/16.
 */

public interface RedeSocialInterface {
    @GET("/redesocial/")
    Call<List<RedeSocial>> getRedeSocial();

    @GET("/redesocial/{id}")
    Call<RedeSocial> getRedeSocialByID(@Path("id") String id);

    @POST("/redesocial/")
    Call <RedeSocial> createRedeSocial(@Body RedeSocial redesocial);

    @DELETE("/redesocial/{id}")
    Call<Void> deleteRedeSocial(@Path("id") String id);

    @PUT("/redesocial/")
    Call<RedeSocial> updateRedeSocial(@Body RedeSocial redesocial);
}
