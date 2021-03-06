/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TesteListar;

import Modelo.Beans.Equipe;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Mateus Moreira
 */
public class ListarEquipe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("QuantumSystemPU");
        EntityManager em = emf.createEntityManager();
        
        List<Equipe>lista = em.createQuery("from Equipe").getResultList();
        
        for(Equipe e: lista){
            System.out.println("\n id: " + e.getId() + "\nNome Equipe: " + e.getNome_equip() + "\nGerente Equipe: " + e.getGerente() + "\nSituação equipe: "+ e.getSituacao_equip() + "\nNumero de integrantes: "+ e.getNum_integra());
        }
        
        
        
    }
    
}
