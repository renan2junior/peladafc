package br.com.peladafc.apppeladafc.ws;

import java.util.List;

import br.com.peladafc.apppeladafc.model.Time;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.Field;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

/**
 * Created by renanjunior on 7/22/16.
 */
public interface TimeInterface {

    @GET("/time/")
    Call<List<Time>> getTime();

    @GET("/time/{id}")
    Call<Time> getTimeByID(@Path("id") String id);

    @POST("/time/")
    Call <Time> createTime(@Body Time time);

    @DELETE("/time/{id}")
    Call<Void> deleteTime(@Path("id") String id);

    @PUT("/time/")
    Call<Time> updateTime(@Body Time time);

}
