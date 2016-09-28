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

    public void setGrupo_id(Grupo grupo) {
        this.grupo = grupo;
    }

    public String getMes_ano() {
        return mes_ano;
    }

    public void setMes_ano(String mes_ano) {
        this.mes_ano = mes_ano;
    }

    public Date getData_pagamento() {
        return data_pagamento;
    }

    public void setData_pagamento(Date data_pagamento) {
        this.data_pagamento = data_pagamento;
    }

    public Double getValor_pago() {
        return valor_pago;
    }

    public void setValor_pago(Double valor_pago) {
        this.valor_pago = valor_pago;
    }

    @Override
    public String toString() {
        return "Pagamento{" +
                "usuario_id=" + usuario +
                ", grupo_id=" + grupo +
                ", mes_ano='" + mes_ano + '\'' +
                ", data_pagamento=" + data_pagamento +
                ", valor_pago=" + valor_pago +
                '}';
    }
}
