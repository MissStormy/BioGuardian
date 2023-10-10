package com.bioguardian.bioguardian.domain;

import javafx.scene.image.Image;

public class Planta {
    private int id;
    private String nombre;
    private String tipo;
    private String nLatin;
    private Image img;

    //Constructor vacio
    public Planta(){}
    //Constructor con parametros

    public Planta(int id, String nombre, String tipo, String nLatin, String img) {
        this.id = id;
        this.nombre = nombre;
        this.tipo = tipo;
        this.nLatin = nLatin;
        this.img = new Image("file:src/main/resoruces/images/" + img);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getnLatin() {
        return nLatin;
    }

    public void setnLatin(String nLatin) {
        this.nLatin = nLatin;
    }

    public Image getImg() {
        return img;
    }

    public void setImg(Image img) {
        this.img = img;
    }

    @Override
    public String toString() {
        return "Planta{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", tipo='" + tipo + '\'' +
                ", nLatin='" + nLatin + '\'' +
                ", img=" + img +
                '}';
    }
}
