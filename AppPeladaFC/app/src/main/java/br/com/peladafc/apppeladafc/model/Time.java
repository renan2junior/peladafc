package br.com.peladafc.apppeladafc.model;import org.parceler.Parcel;/** * Created by renanjunior on 7/22/16. */@Parcelpublic class Time {    private Integer id;    private String nome;    public Time() {    }    public Time(Integer id) {        this.id = id;    }    public Time(Integer id, String nome) {        this.id = id;        this.nome = nome;    }    public Integer getId() {        return id;    }    public void setId(Integer id) {        this.id = id;    }    public String getNome() {        return nome;    }    public void setNome(String nome) {        this.nome = nome;    }    @Override    public String toString() {        return "Time{" +                "id=" + id +                ", nome='" + nome + '\'' +                '}';    }}