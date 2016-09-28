package br.com.peladafc.apppeladafc.model;

/**
 * Created by renanjunior on 9/27/16.
 */

public class Grupo {

    private int id;
    private  String nome_contato;
    private String email_contato;
    private String nome_grupo;
    private String horario;
    private String telefone_grupo;
    private String conta_grupo;
    private int usuario_id;
    private int local_id;

    @Override
    public String toString() {
        return "Grupo{" +
                "id=" + id +
                ", nome_contato='" + nome_contato + '\'' +
                ", email_contato='" + email_contato + '\'' +
                ", nome_grupo='" + nome_grupo + '\'' +
                ", horario='" + horario + '\'' +
                ", telefone_grupo='" + telefone_grupo + '\'' +
                ", conta_grupo='" + conta_grupo + '\'' +
                ", usuario_id=" + usuario_id +
                ", local_id=" + local_id +
                '}';
    }

    public Grupo() {
    }

    public Grupo(int id, String nome_contato, String email_contato, String nome_grupo, String horario, String telefone_grupo, String conta_grupo, int usuario_id, int local_id) {

        this.id = id;
        this.nome_contato = nome_contato;
        this.email_contato = email_contato;
        this.nome_grupo = nome_grupo;
        this.horario = horario;
        this.telefone_grupo = telefone_grupo;
        this.conta_grupo = conta_grupo;
        this.usuario_id = usuario_id;
        this.local_id = local_id;
    }

    public int getId() {

        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getNome_grupo() {
        return nome_grupo;
    }

    public void setNome_grupo(String nome_grupo) {
        this.nome_grupo = nome_grupo;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getTelefone_grupo() {
        return telefone_grupo;
    }

    public void setTelefone_grupo(String telefone_grupo) {
        this.telefone_grupo = telefone_grupo;
    }

    public String getConta_grupo() {
        return conta_grupo;
    }

    public void setConta_grupo(String conta_grupo) {
        this.conta_grupo = conta_grupo;
    }

    public int getUsuario_id() {
        return usuario_id;
    }

    public void setUsuario_id(int usuario_id) {
        this.usuario_id = usuario_id;
    }

    public int getLocal_id() {
        return local_id;
    }

    public void setLocal_id(int local_id) {
        this.local_id = local_id;
    }
//local = db.relationship('Local', backref=db.backref('post', lazy='dynamic', cascade='all,delete'))
    //usuario = db.relationship('Usuario', backref=db.backref('post', lazy='dynamic', cascade='all,delete'))


}
