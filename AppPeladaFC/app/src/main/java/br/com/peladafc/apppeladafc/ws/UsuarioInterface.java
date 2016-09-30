package br.com.peladafc.apppeladafc.ws;

import java.util.List;

import br.com.peladafc.apppeladafc.model.Usuario;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

/**
 * Created by renanjunior on 9/12/16.
 */
public interface UsuarioInterface {

    @GET("/usuario/")
    Call<List<Usuario>> getUsuario();

    @GET("/usuario/{id}")
    Call<Usuario> getUsuarioByID(@Path("id") Integer id);

    @GET("/usuario/{login}")
    Call<Usuario> getUsuarioByLogin(@Path("login") String login);

    @POST("/usuario/")
    Call <Usuario> createUsuario(@Body Usuario usuario);

    @DELETE("/usuario/{id}")
    Call<Void> deleteUsuario(@Path("id") Integer id);

    @PUT("/usuario/")
    Call<Usuario> updateUsuario(@Body Usuario usuario);

}
