/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TesteAlterar;

import Modelo.Beans.Profissao;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Mateus Moreira
 */
public class TesteAlterarProfissao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           EntityManagerFactory emf = Persistence.createEntityManagerFactory("QuantumSystemPU");
        EntityManager em = emf.createEntityManager();
        
        Profissao prof = em.find(Profissao.class, 2);
        
        prof.setNome("Pedreiro");
        prof.setSalario(900.00);
        
         em.getTransaction().begin();
        em.persist(prof);
        em.getTransaction().commit();
    }
    
}
