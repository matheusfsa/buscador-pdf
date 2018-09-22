package com.ed2.buscador.api.util;

import java.io.Serializable;

public class PDF implements Comparable<PDF>, Serializable {
    private int id;
    private String titulo;
    private String link;

    public PDF(int id, String titulo, String link){
        this.id = id;
        this.titulo = titulo;
        this.link = link;
    }
    public String getTitulo() {
        return titulo;
    }

    public String getLink() {
        return link;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public int compareTo(PDF o) {
        if(id == o.id) {
            return 0;
        }else if(id > o.id){
            return 1;
        }else{
            return -1;
        }
    }

    public String toString(){
        return titulo;
    }

}
