/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TesteAlterar;

import Modelo.Beans.Equipamento;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Mateus Moreira
 */
public class TesteAlterarEquipamento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       EntityManagerFactory emf = Persistence.createEntityManagerFactory("QuantumSystemPU");
        EntityManager em = emf.createEntityManager();
        
        Equipamento eq = em.find(Equipamento.class, 3);
        
        eq.setDescricao_equipamento("Veja cod:0034324");
        eq.setQuanti_equipamento(15);
        eq.setTipo_equipamento("Produto para limpeza de vidros");
        eq.setValor_gasto(150.00);
        
        
        em.getTransaction().begin();
        em.persist(eq);
        em.getTransaction().commit();
        
        
    }
    
}
