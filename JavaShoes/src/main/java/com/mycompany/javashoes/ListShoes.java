/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javashoes;

import java.util.*;

/**
 *
 * @author Fatec
 */
public class ListShoes {
    HashSet<String> key = new HashSet<String>();
    ArrayList<JavaShoes> shoes = new ArrayList<JavaShoes>();
   
    public void addShoe(JavaShoes shoe){
        shoes.add(shoe);
    }
    
    public ArrayList<JavaShoes> getShoes(){
        return shoes;
    }
    
    public static void main(String[] args) {
        ListShoes listShoes = new ListShoes();
        
        listShoes.addShoe(new JavaShoes("Nike", "Air Max", "Preto"));
        listShoes.addShoe(new JavaShoes("Nike", "Air Max", "Preto"));
        
        System.out.println(listShoes.getShoes().size());
    }
}
