/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControlLogin;

import Modelo.Beans.Administrador;
import PersistindoUtil.EntityManagerUtil;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;


/**
 *
 * @author Mateus Moreira
 */
public class DAOAdmin {
   
    
     EntityManager em = EntityManagerUtil.getEntityManager();
        
    public Administrador getAdministrador(String nome_admin, String senha){
        
        try{
           
            Administrador admin = (Administrador)em.createQuery("FROM Administrador WHERE nome_admin=? AND senha=?")
              .setParameter("nome_admin", nome_admin).setParameter("senha", senha).getSingleResult();
//               
                    return admin;
        }catch(Exception e){
             return null;
            
        }
        
        
    }
    
    
    
    
    
    
    
//    private Connection conn;
//    
//    
//     public DAOAdmin(){
//        if( (conn = new ConexaoAdmin().getConnection())== null ){
//            JOptionPane.showMessageDialog(null, "Não conectou o banco de dados!!.");
//        }
//    }
//    
//     
//     public Administrador ValidarLogin(String nome_admin, String senha) {
//
//        boolean autenticado = false;
//        Administrador admin = null;
//        String sql = "select nome_admin, senha from Administrador where nome_admin = ? and senha = ?";
//
//        try {
//            PreparedStatement stmt = this.conn.prepareStatement(sql);
//
//            stmt.setString(1, nome_admin);
//            stmt.setString(2, senha);
//
//            ResultSet rs;
//            rs = stmt.executeQuery();
//            if (rs.next()) {
//                admin = new Administrador();
//                admin.setNome_admin(rs.getString("nome_admin"));
//                admin.setSenha(rs.getString("senha"));
//            }
//            stmt.close();
//            return admin;
//
//        } catch (SQLException ex) {
//            System.out.println("Erro ao recuperar Aluno!/ usuario");
//        }
//        return null;
//
//    }

}
