/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TesteListar;

import Modelo.Beans.Servico;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Mateus Moreira
 */
public class ListarServico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         EntityManagerFactory emf = Persistence.createEntityManagerFactory("QuantumSystemPU");
        EntityManager em = emf.createEntityManager();
        
        List<Servico>Lista = em.createQuery("from Servico").getResultList();
        
        for(Servico s:Lista){
            System.out.println("\nid: " + s.getId() + "\ntipo: " + s.getTipo() + "\nValor Gasto: " + s.getValor_gasto());
           
        }
    }
    
}
