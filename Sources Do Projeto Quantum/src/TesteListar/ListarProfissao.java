/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TesteListar;

import Modelo.Beans.Profissao;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Mateus Moreira
 */
public class ListarProfissao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
          EntityManagerFactory emf = Persistence.createEntityManagerFactory("QuantumSystemPU");
        EntityManager em = emf.createEntityManager();
        
        List<Profissao>Lista = em.createQuery("from Profissao").getResultList();
        
        for(Profissao p: Lista){
               System.out.print("\nid: " + p.getId() + "\nNome: " + p.getNome() + "\nSalario: " + p.getSalario());
        }
        
        
    }
    
}
