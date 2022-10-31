/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.javashoesstore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/**
 *
 * @author itaxxi
 */
public class JavaShoesStore {
    

    private ArrayList<JavaShoes> arrayShoes = new ArrayList<JavaShoes>();
    private HashSet<String> hashShoes = new HashSet<String>();
    private HashMap<String, String> mapShoes = new HashMap<String, String>();

    //construtor

    public void addShoes(JavaShoes shoe){
        this.arrayShoes.add(shoe);
    }
    public void addHash(String code){
        this.hashShoes.add(code);
    }

    public void addMap(String code, String shoe){
        this.mapShoes.put(code, shoe);
    }

    public ArrayList<JavaShoes> getList(){
        return arrayShoes;
    }

    public static void main(String[] args) {
        JavaShoesStore store = new JavaShoesStore();
        JavaShoes shoeOb = new JavaShoes("dc", "penza", "preto", "99");

        store.addShoes(new JavaShoes("nike", "air", "preto", "90"));
        store.addShoes(new JavaShoes("adidas", "court", "branco", "80"));
        store.addMap(shoeOb.getCodigo(), shoeOb.getInfo());
        System.out.println("qualquer coisa");

        for (JavaShoes shoe: store.getList()){
            System.out.println(shoe.getInfo());
        }
    }
}
