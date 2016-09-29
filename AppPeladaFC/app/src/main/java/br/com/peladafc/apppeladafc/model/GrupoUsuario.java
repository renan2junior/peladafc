package br.com.peladafc.apppeladafc.model;

/**
 * Created by arthursilva on 28/09/16.
 */

public class GrupoUsuario {
    private boolean ativo;
    private Usuario usuario;
    private Grupo grupo;
    private TipoUsuario tipo_usuario;

    public GrupoUsuario() {
    }

    public GrupoUsuario(boolean ativo, Usuario usuario, Grupo grupo, TipoUsuario tipo_usuario) {
        this.ativo = ativo;
        this.usuario = usuario;
        this.grupo = grupo;
        this.tipo_usuario = tipo_usuario;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
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

    public TipoUsuario getTipoUsuario() {
        return tipo_usuario;
    }

    public void setTipoUsuario(TipoUsuario tipo_usuario) {
        this.tipo_usuario = tipo_usuario;
    }

    @Override
    public String toString() {
        return "GrupoUsuario{" +
                "ativo=" + ativo +
                ", usuario=" + usuario +
                ", grupo=" + grupo +
                ", tipo_usuario=" + tipo_usuario +
                '}';
    }
}
