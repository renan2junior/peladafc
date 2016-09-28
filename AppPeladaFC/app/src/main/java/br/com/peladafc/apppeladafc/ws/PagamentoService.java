package br.com.peladafc.apppeladafc.ws;

import java.io.IOException;
import java.util.List;

import br.com.peladafc.apppeladafc.model.Grupo;
import br.com.peladafc.apppeladafc.model.Pagamento;
import br.com.peladafc.apppeladafc.model.Usuario;
import br.com.peladafc.apppeladafc.util.UtilJson;
import retrofit2.Call;

/**
 * Created by arthursilva on 28/09/16.
 */

public class PagamentoService {

    PagamentoInterface pagamentoInterface;

    public PagamentoService() {
        pagamentoInterface = ((PagamentoInterface) RestClient.getInstance(PagamentoInterface.class));
    }

    public List<Pagamento> listaPagamentos() {
        Call<List<Pagamento>> call = pagamentoInterface.getPagamento();
        List<Pagamento> pagamentos = null;
        try {
            pagamentos = call.execute().body();
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < pagamentos.size(); i++) {
            System.out.print("Pagamento : " + UtilJson.toJson(pagamentos.get(i)));
        }
        return pagamentos;
    }

    public Pagamento createPagamento(Pagamento pagamento) {
        Call<Pagamento> call = pagamentoInterface.createPagamento(pagamento);
        try {
            pagamento = call.execute().body();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.print("Pagamento : " + pagamento.getMes_ano());
        return pagamento;
    }

    public void deletePagamento(Usuario usuario, Grupo grupo, String mes_ano) {
        Call<Void> call = pagamentoInterface.deletePagamento(usuario.getId().toString(), grupo.getId().toString(), mes_ano);
        try {
            call.execute().body();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Pagamento getPagamentoByID(String id) {
        Call<Pagamento> call = pagamentoInterface.getPagamentoByID(id);
        Pagamento pagamento = null;
        try {
            pagamento = call.execute().body();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return pagamento;
    }

    public Pagamento updatePagamento(Pagamento pagamento) {
        Call<Pagamento> call = pagamentoInterface.updatePagamento(pagamento);
        Pagamento pagamento_retorno = null;
        try {
            pagamento_retorno = call.execute().body();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return pagamento_retorno;
    }
}
