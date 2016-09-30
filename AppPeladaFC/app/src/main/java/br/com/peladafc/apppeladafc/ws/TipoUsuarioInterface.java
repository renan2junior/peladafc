package br.com.peladafc.apppeladafc.ws;

import java.util.List;

import br.com.peladafc.apppeladafc.model.TipoUsuario;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

/**
 * Created by arthursilva on 29/09/16.
 */

public interface TipoUsuarioInterface {
    @GET("/tipousuario/")
    Call<List<TipoUsuario>> getTipoUsuario();

    @GET("/tipousuario/{id}")
    Call<TipoUsuario> getTipoUsuarioByID(@Path("id") Integer id);

    @POST("/tipousuario/")
    Call <TipoUsuario> createTipoUsuario(@Body TipoUsuario tipousuario);

    @DELETE("/tipousuario/{id}")
    Call<Void> deleteTipoUsuario(@Path("id") Integer id);

    @PUT("/tipousuario/")
    Call<TipoUsuario> updateTipoUsuario(@Body TipoUsuario tipousuario);
}
