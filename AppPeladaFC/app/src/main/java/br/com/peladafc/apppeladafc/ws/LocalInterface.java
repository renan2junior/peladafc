package br.com.peladafc.apppeladafc.ws;

import java.util.List;

import br.com.peladafc.apppeladafc.model.Local;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

/**
 * Created by renanjunior on 9/27/16.
 */

public interface LocalInterface {

    @GET("/local/")
    Call<List<Local>> getLocal();

    @GET("/local/{id}")
    Call<Local> getLocalByID(@Path("id") String id);

    @GET("/local/{login}")
    Call<Local> getLocalByLogin(@Path("login") String login);

    @POST("/local/")
    Call <Local> createLocal(@Body Local local);

    @DELETE("/local/{id}")
    Call<Void> deleteLocal(@Path("id") String id);

    @PUT("/local/")
    Call<Local> updateLocal(@Body Local local);


}
