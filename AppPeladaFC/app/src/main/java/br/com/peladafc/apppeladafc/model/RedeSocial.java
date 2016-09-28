package br.com.peladafc.apppeladafc.model;

/**
 * Created by arthursilva on 28/09/16.
 */

public class RedeSocial {

    private int id;
    private String descricao;

    public RedeSocial() {
    }

    public RedeSocial(int id, String descricao) {
        this.id = id;
        this.descricao = descricao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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
        return "RedeSocial{" +
                "id=" + id +
                ", descricao='" + descricao + '\'' +
                '}';
    }

}
