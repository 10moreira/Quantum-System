/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TesteListar;

import Modelo.Beans.Equipamento;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Mateus Moreira
 */
public class ListarEquipamento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          EntityManagerFactory emf = Persistence.createEntityManagerFactory("QuantumSystemPU");
        EntityManager em = emf.createEntityManager();
        
        List<Equipamento>lista = em.createQuery("from Equipamento").getResultList();
        
        for(Equipamento e:lista){
                  System.out.print("\n id: " + e.getId() + "\nQuantidade Equipamento: " + e.getQuanti_equipamento() + "\nDescrição equipamento: " + e.getDescricao_equipamento() + "\nTipo Equipamento: " + e.getTipo_equipamento() + "\nValor Gasto: " + e.getValor_gasto());

        }
        
    }
    
}
