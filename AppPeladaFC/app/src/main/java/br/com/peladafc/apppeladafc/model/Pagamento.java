package br.com.peladafc.apppeladafc.model;

import java.util.Date;

/**
 * Created by arthursilva on 28/09/16.
 */

public class Pagamento {

    private Usuario usuario;
    private Grupo grupo;
    private String mes_ano;
    private Date data_pagamento;
    private Double valor_pago;

    public Pagamento() {
    }

    public Pagamento(Usuario usuario, Grupo grupo, String mes_ano, Date data_pagamento, Double valor_pago) {
        this.usuario = usuario;
        this.grupo = grupo;
        this.mes_ano = mes_ano;
        this.data_pagamento = data_pagamento;
        this.valor_pago = valor_pago;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Grupo getGrupo() {
        return grupo;
    }

    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
    }

    public String getMesAno() {
        return mes_ano;
    }

    public void setMesAno(String mes_ano) {
        this.mes_ano = mes_ano;
    }

    public Date getDataPagamento() {
        return data_pagamento;
    }

    public void setDataPagamento(Date data_pagamento) {
        this.data_pagamento = data_pagamento;
    }

    public Double getValorPago() {
        return valor_pago;
    }

    public void setValorPago(Double valor_pago) {
        this.valor_pago = valor_pago;
    }

    @Override
    public String toString() {
        return "Pagamento{" +
                "usuario=" + usuario +
                ", grupo=" + grupo +
                ", mes_ano='" + mes_ano + '\'' +
                ", data_pagamento=" + data_pagamento +
                ", valor_pago=" + valor_pago +
                '}';
    }
}
