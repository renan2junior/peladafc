package br.com.peladafc.apppeladafc.model;

/**
 * Created by renanjunior on 7/22/16.
 */
public class Usuario {

    private int id;
    private String nome;
    private String email;
    private String telefone;
    private Boolean mensalista;
    private int time_id;
    private int tipo_usuario_id ;

    public Usuario(int id, String nome, String email, String telefone, Boolean mensalista, int time_id, int tipo_usuario_id) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.mensalista = mensalista;
        this.time_id = time_id;
        this.tipo_usuario_id = tipo_usuario_id;
    }

    public Usuario() {
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", telefone='" + telefone + '\'' +
                ", mensalista=" + mensalista +
                ", time_id=" + time_id +
                ", tipo_usuario_id=" + tipo_usuario_id +
                '}';
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Boolean getMensalista() {
        return mensalista;
    }

    public void setMensalista(Boolean mensalista) {
        this.mensalista = mensalista;
    }

    public int getTime_id() {
        return time_id;
    }

    public void setTime_id(int time_id) {
        this.time_id = time_id;
    }

    public int getTipo_usuario_id() {
        return tipo_usuario_id;
    }

    public void setTipo_usuario_id(int tipo_usuario_id) {
        this.tipo_usuario_id = tipo_usuario_id;
    }
    //tipo_usuario = db.relationship('TipoUsuario', backref=db.backref('post', lazy='dynamic',cascade='all,delete'))
    //private  time = db.relationship('Time', backref=db.backref('post', lazy='dynamic', cascade='all,delete'))

}
