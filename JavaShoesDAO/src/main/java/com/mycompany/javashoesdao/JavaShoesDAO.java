/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.javashoesdao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author itaxxi
 */
public class JavaShoesDAO {

    Connection connect;
    ResultSet rs;
    PreparedStatement ps;

    String url = "jdbc:mysql://localhost:3306/javashoes";
    String user = "root";
    String password = "root";
    String driver = "com.mysql.jdbc.Driver";

    public void insertJavaShoes(JavaShoes j) throws SQLException {

        try {

            Class.forName(driver);
            connect = DriverManager.getConnection(url, user, password);
            String query = "INSERT INTO javashoes (marca, modelo, cor) VALUES (?,?,?)";
            ps = connect.prepareStatement(query);
            ps.setString(1, j.getMarca());
            ps.setString(2, j.getModelo());
            ps.setString(3, j.getCor());
            ps.execute();
            System.out.println("Dados inseridos inseridos!");

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(JavaShoesDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        connect.close();

    }

    public ArrayList<JavaShoes> getList() {

        ArrayList<JavaShoes> store = new ArrayList<JavaShoes>();

        try {

            connect = DriverManager.getConnection(url, user, password);
            ps = connect.prepareStatement("select * from Aluno");
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                JavaShoes s = new JavaShoes("", "", "");
                s.setMarca(rs.getString("marca"));
                s.setModelo(rs.getString("modelo"));
                s.setCor(rs.getString("cor"));
                store.add(s);
            }
            rs.close();
            ps.close();

        } catch (SQLException e) {

            e.printStackTrace();
        }

        return store;

    }

    public void imprimir(ArrayList<JavaShoes> store) {
        for (JavaShoes s : store) {
            System.out.println("Marca: " + s.getMarca());
            System.out.println("Modelo: " + s.getModelo());
            System.out.println("Cor: " + s.getCor());
        }
    }
}
