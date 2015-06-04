/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TesteInserir;

import Modelo.Beans.Administrador;
import PersistindoUtil.EntityManagerUtil;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Mateus Moreira
 */
public class InserirAdministrador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
      EntityManager em = EntityManagerUtil.getEntityManager();
        
        Administrador a = new Administrador();
        
        a.setNome_admin("Jefferson");
        a.setSenha("123456");
        a.setFuncao("cadastros");
        a.setCpf("03398325092");
        a.setTelefone("32471067");
        
        em.getTransaction().begin();
        em.persist(a);
        em.getTransaction().commit();
        
    }
    
}
