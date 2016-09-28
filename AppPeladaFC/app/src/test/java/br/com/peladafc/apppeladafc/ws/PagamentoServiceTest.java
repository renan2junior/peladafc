package br.com.peladafc.apppeladafc.ws;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import br.com.peladafc.apppeladafc.model.Pagamento;

/**
 * Created by arthursilva on 28/09/16.
 */

public class PagamentoServiceTest {
    PagamentoService s;

    @Before
    public void initObjects(){
        s = new PagamentoService();
    }

    @Test
    public void testListaPagamentos() throws Exception {
        s.listaPagamentos();
    }

    @Test
    public void testCreatePagamento() throws Exception{
        List<Pagamento> pagamentos = s.listaPagamentos();
        for (Pagamento pagamento: pagamentos)
            s.deletePagamento( pagamento.getUsuario(), pagamento.getGrupo(), pagamento.getMes_ano() );

        Pagamento t = new Pagamento();
        s.createPagamento(t);

        Pagamento t2 = new Pagamento();
        s.createPagamento(t2);

    }

    @Test
    public void testDeletePagamento() throws Exception{
        Pagamento pagamento = new Pagamento();
        s.deletePagamento(pagamento.getUsuario(), pagamento.getGrupo(), pagamento.getMes_ano());
    }

    @Test
    public void testListaNovamentePagamentos() throws Exception {
        s.listaPagamentos();
    }

    @Test
    public void testUpdatePagamento() throws Exception{
        Pagamento pagamento = s.getPagamentoByID("7");
        s.updatePagamento(pagamento);
    }
}
