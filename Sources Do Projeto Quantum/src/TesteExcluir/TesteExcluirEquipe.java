/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TesteExcluir;

import Modelo.Beans.Equipe;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Mateus Moreira
 */
public class TesteExcluirEquipe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       EntityManagerFactory emf = Persistence.createEntityManagerFactory("QuantumSystemPU");
        EntityManager em = emf.createEntityManager();
        
        Equipe e = em.find(Equipe.class, 1);
        
           System.out.println("\n id: " + e.getId() + "\nNome Equipe: " + e.getNome_equip() + "\nGerente Equipe: " + e.getGerente() + "\nSituação equipe: "+ e.getSituacao_equip() + "\nNumero de integrantes: "+ e.getNum_integra());
                em.getTransaction().begin();
                em.remove(e);
                em.getTransaction().commit();
        
    }
    
}
