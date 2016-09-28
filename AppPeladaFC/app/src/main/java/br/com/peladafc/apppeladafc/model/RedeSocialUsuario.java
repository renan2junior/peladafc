package br.com.peladafc.apppeladafc.model;

/**
 * Created by arthursilva on 28/09/16.
 */

public class RedeSocialUsuario {
    private String identificador;
    private Usuario usuario;
    private RedeSocial redesocial;

    public RedeSocialUsuario() {
    }

    public RedeSocialUsuario(String identificador, Usuario usuario, RedeSocial redesocial) {
        this.identificador = identificador;
        this.usuario = usuario;
        this.redesocial = redesocial;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public RedeSocial getRedesocial() {
        return redesocial;
    }

    public void setRedesocial(RedeSocial redesocial) {
        this.redesocial = redesocial;
    }

    @Override
    public String toString() {
        return "RedeSocialUsuario{" +
                "identificador='" + identificador + '\'' +
                ", usuario=" + usuario +
                ", redesocial=" + redesocial +
                '}';
    }
}
