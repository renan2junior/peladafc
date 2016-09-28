package br.com.peladafc.apppeladafc.model;

/**
 * Created by renanjunior on 9/27/16.
 */

public class Local {

    private Integer id;
    private String nome;
    private String endereco;
    private String nome_contato;
    private String email_contato;
    private String telefone_contato;
    private String conta_deposito;

    @Override
    public String toString() {
        return "Local{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", endereco='" + endereco + '\'' +
                ", nome_contato='" + nome_contato + '\'' +
                ", email_contato='" + email_contato + '\'' +
                ", telefone_contato='" + telefone_contato + '\'' +
                ", conta_deposito='" + conta_deposito + '\'' +
                '}';
    }

    public Local() {
    }

    public Local(Integer id) {
        this.id = id;
    }

    public Local(int id, String nome, String endereco, String nome_contato, String email_contato, String telefone_contato, String conta_deposito) {
        this.id = id;
        this.nome = nome;
        this.endereco = endereco;
        this.nome_contato = nome_contato;
        this.email_contato = email_contato;
        this.telefone_contato = telefone_contato;
        this.conta_deposito = conta_deposito;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNome_contato() {
        return nome_contato;
    }

    public void setNome_contato(String nome_contato) {
        this.nome_contato = nome_contato;
    }

    public String getEmail_contato() {
        return email_contato;
    }

    public void setEmail_contato(String email_contato) {
        this.email_contato = email_contato;
    }

    public String getTelefone_contato() {
        return telefone_contato;
    }

    public void setTelefone_contato(String telefone_contato) {
        this.telefone_contato = telefone_contato;
    }

    public String getConta_deposito() {
        return conta_deposito;
    }

    public void setConta_deposito(String conta_deposito) {
        this.conta_deposito = conta_deposito;
    }
}
