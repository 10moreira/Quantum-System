/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TesteInserir;

import Modelo.Beans.Equipamento;
import Modelo.Beans.Funcionario;
import PersistindoUtil.EntityManagerUtil;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Mateus Moreira
 */
public class InserirEquipamentosFunc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         EntityManager em = EntityManagerUtil.getEntityManager();
        
        Funcionario func = em.find(Funcionario.class, 1);
        Equipamento equi = em.find(Equipamento.class, 1);
        
        func.adicionaEquipamento(equi);
        em.getTransaction().begin();
        em.persist(equi);
        em.getTransaction().commit();
        
        
      for(Equipamento e: func.getListaEquipamentos2()){
              System.out.println("Tipo Equipamento: " + e.getTipo_equipamento());
        }
        
    }
    
}
