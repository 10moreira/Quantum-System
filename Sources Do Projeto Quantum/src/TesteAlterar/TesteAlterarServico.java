/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TesteAlterar;

import Modelo.Beans.Servico;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Mateus Moreira
 */
public class TesteAlterarServico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         EntityManagerFactory emf = Persistence.createEntityManagerFactory("QuantumSystemPU");
        EntityManager em = emf.createEntityManager();
        
        Servico ser = em.find(Servico.class, 2);
        
        ser.setTipo("Construcao");
        ser.setValor_gasto(10.000);
        
        em.getTransaction().begin();
        em.persist(ser);
        em.getTransaction().commit();
    }
    
}
