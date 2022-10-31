package com.mycompany.javashoesstore;

public class JavaShoes {
    private String marca;
    private String modelo;
    private String cor;
    private String codigo;

    public JavaShoes(String marca, String modelo, String cor, String codigo){
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.codigo = codigo;
    }

    //métodos de acesso
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo){
        this.codigo = codigo;
    }

    public String getInfo(){
        return getMarca() + " " + getModelo() + " " + getCor();
    }
}
