/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TesteAlterar;

import Modelo.Beans.Equipe;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Mateus Moreira
 */
public class TesteAlterarEquipe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         EntityManagerFactory emf = Persistence.createEntityManagerFactory("QuantumSystemPU");
        EntityManager em = emf.createEntityManager();
        
        Equipe e = em.find(Equipe.class, 1);
        
        
        e.setNome_equip("seguranças");
        e.setGerente("Rogerio");
        e.setNum_integra(15);
        e.setSituacao_equip("Trabalhando em turno noturno das 19hrs as 03:00hrs");
        
        em.getTransaction().begin();
        em.persist(e);
        em.getTransaction().commit();
        
    }
    
}
