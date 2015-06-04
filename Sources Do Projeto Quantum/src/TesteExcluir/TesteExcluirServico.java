/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TesteExcluir;

import Modelo.Beans.Servico;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Mateus Moreira
 */
public class TesteExcluirServico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("QuantumSystemPU");
        EntityManager em = emf.createEntityManager();
        
        Servico s = em.find(Servico.class, 2);
               System.out.println("\nid: " + s.getId() + "\ntipo: " + s.getTipo() + "\nValor Gasto: " + s.getValor_gasto());

               em.getTransaction().begin();
               em.remove(s);
               em.getTransaction().commit();
               
    }
    
}
