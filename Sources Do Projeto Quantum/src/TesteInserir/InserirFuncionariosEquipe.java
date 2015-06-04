/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TesteInserir;

import Modelo.Beans.Equipe;
import Modelo.Beans.Funcionario;
import PersistindoUtil.EntityManagerUtil;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Mateus Moreira
 */
public class InserirFuncionariosEquipe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          EntityManager em = EntityManagerUtil.getEntityManager();
        
        Equipe equi = em.find(Equipe.class, 1);
        Funcionario func = em.find(Funcionario.class, 1);
        
         equi.adicionarFuncionarios(func);
         em.getTransaction().begin();
         em.persist(func);
         em.getTransaction().commit();
         
         for(Funcionario f: equi.getListaFuncionarios()){
              System.out.println("Equipe: " + f.getNome());
         }
        
    }
    
}
