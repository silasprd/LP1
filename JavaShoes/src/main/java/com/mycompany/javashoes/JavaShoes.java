/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.javashoes;

/**
 *
 * @author itaxxi
 */
public class JavaShoes {
    
    private String marca;
    private String modelo;
    private String cor;
   
    //construtor
    public JavaShoes(String marca, String modelo, String cor){
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
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
    
    //métodos da classe
    public void rasgar(String motivo){
        System.out.println(marca + " " + modelo + " rasgou " + motivo);
    }
    
    public void lavar(String weekday){
        System.out.println(marca + " " + modelo + " foi lavado " + weekday);
    }
    
    public int comprar(int valor){
        System.out.println(marca + " " + modelo + " comprado por " + valor + " reais ");
        return 10;
    }

    public static void main(String[] args) {
        System.out.println("Java Shoes");
        JavaShoes shoe = new JavaShoes("", "", "");
         
        shoe.setMarca("Nike");
        shoe.setModelo("Air Jordan");
        shoe.setCor("Preto/Vermelho");
        
        System.out.println(shoe.getMarca() + " " + shoe.getModelo() + " " + shoe.getCor());
        
        shoe.rasgar("andando de skate");
        shoe.lavar("segunda feira");
        shoe.comprar(490);
    }
}
