package br.com.peladafc.apppeladafc.ws;

import java.util.List;

import br.com.peladafc.apppeladafc.model.Pagamento;
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

public interface PagamentoInterface {
    @GET("/pagamento/")
    Call<List<Pagamento>> getPagamento();

    @GET("/pagamento/{id}")
    Call<Pagamento> getPagamentoByID(@Path("id") String id);

    @POST("/pagamento/")
    Call <Pagamento> createPagamento(@Body Pagamento pagamento);

    @DELETE("/pagamento/{id_usuario}/{id_grupo}/{mes_ano}")
    Call<Void> deletePagamento(@Path("id_usuario") String id_usuario, @Path("id_grupo") String id_grupo, @Path("mes_ano") String mes_ano);

    @PUT("/pagamento/")
    Call<Pagamento> updatePagamento(@Body Pagamento pagamento);
}
