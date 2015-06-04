/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TesteExcluir;

import Modelo.Beans.Equipamento;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Mateus Moreira
 */
public class TesteExcluirEquipamento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         EntityManagerFactory emf = Persistence.createEntityManagerFactory("QuantumSystemPU");
        EntityManager em = emf.createEntityManager();
        
        Equipamento e = em.find(Equipamento.class, 3);
        
          System.out.print("\n id: " + e.getId() + "\nQuantidade Equipamento: " + e.getQuanti_equipamento() + "\nDescrição equipamento: " + e.getDescricao_equipamento() + "\nTipo Equipamento: " + e.getTipo_equipamento() + "\nValor Gasto: " + e.getValor_gasto());

          em.getTransaction().begin();
          em.remove(e);
          em.getTransaction().commit();
          
    }
    
}
