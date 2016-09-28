package br.com.peladafc.apppeladafc.model;

/**
 * Created by arthursilva on 28/09/16.
 */

public class TipoUsuario {
    private Integer id;
    private String descricao;

    public TipoUsuario() {
    }

    public TipoUsuario(Integer id) {
        this.id = id;
    }

    public TipoUsuario(Integer id, String descricao) {
        this.id = id;
        this.descricao = descricao;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "TipoUsuario{" +
                "id=" + id +
                ", descricao='" + descricao + '\'' +
                '}';
    }
}
