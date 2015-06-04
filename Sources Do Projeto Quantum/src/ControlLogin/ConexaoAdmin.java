///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package ControlLogin;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;
//
///**
// *
// * @author Mateus Moreira
// */
//public class ConexaoAdmin {
//  
//     
//       private ConexaoAdmin conn;
//    public Connection getConnection() {
//        try {   //retorna uma conexão com o banco de dados             
//            return DriverManager.getConnection("jdbc:postgresql://localhost:5432/BaseQuantum", "postgres", "postgres");                       
//        } catch (SQLException ex) { //se a conexão falhar, emite a mensagem abaixo no 
//            System.out.println("Exceção detectada na classe Conexão: " + ex.getMessage());
//            return null;  //se não estabeleceu a conexão, retorna nulo
//        }
//    }
//
//}
