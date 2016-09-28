package br.com.peladafc.apppeladafc.model;

/**
 * Created by renanjunior on 7/22/16.
 */
public class Usuario {

    private Integer id;
    private String nome;
    private String email;
    private String telefone;
    private Boolean mensalista;
    private Time time;
    private TipoUsuario tipo_usuario ;

    public Usuario(int id, String nome, String email, String telefone, Boolean mensalista, Time time, TipoUsuario tipo_usuario) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.mensalista = mensalista;
        this.time = time;
        this.tipo_usuario = tipo_usuario;
    }

    public Usuario() {
    }

    public Usuario(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", telefone='" + telefone + '\'' +
                ", mensalista=" + mensalista +
                ", time_id=" + time +
                ", tipo_usuario_id=" + tipo_usuario +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public TipoUsuario getTipoUsuario() {
        return tipo_usuario;
    }

    public void setTipoUsuario(TipoUsuario tipo_usuario) {
        this.tipo_usuario = tipo_usuario;
    }
    //tipo_usuario = db.relationship('TipoUsuario', backref=db.backref('post', lazy='dynamic',cascade='all,delete'))
    //private  time = db.relationship('Time', backref=db.backref('post', lazy='dynamic', cascade='all,delete'))

}
