/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.javashoesstore;

/**
 *
 * @author itaxxi
 */
public class JavaShoesStore {
    
    private String marca;
    private String modelo;
    private String cor;
    private String codigo;
   
    //construtor
    public JavaShoesStore(String marca, String modelo, String cor, String codigo){
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

    public static void main(String[] args) {
        System.out.println("Java Shoes");
        JavaShoesStore shoe = new JavaShoesStore("", "", "", "");
         
        shoe.setMarca("Nike");
        shoe.setModelo("Air Jordan");
        shoe.setCor("Preto/Vermelho");
        shoe.setCodigo("12345");
        
        System.out.println(shoe.getCodigo() + " - " + shoe.getMarca() + " " + shoe.getModelo() + " " + shoe.getCor());
    }
}
