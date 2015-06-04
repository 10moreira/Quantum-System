/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TesteInserir;

import Modelo.Beans.Administrador;
import Modelo.Beans.Profissao;
import PersistindoUtil.EntityManagerUtil;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Mateus Moreira
 */
public class InserirProfissao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         EntityManager em = EntityManagerUtil.getEntityManager();
        
        Profissao prof = new Profissao();
        Administrador admin = em.find(Administrador.class,1);
        
        prof.setNome("Segurança");
        prof.setSalario(875.00);
        prof.setAdmin(admin);
       
        
        em.getTransaction().begin();
        em.persist(prof);
        em.getTransaction().commit();
    }
    
}
