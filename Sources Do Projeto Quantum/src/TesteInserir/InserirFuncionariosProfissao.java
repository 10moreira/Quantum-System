/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TesteInserir;

import Modelo.Beans.Funcionario;
import Modelo.Beans.Profissao;
import PersistindoUtil.EntityManagerUtil;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Mateus Moreira
 */
public class InserirFuncionariosProfissao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         EntityManager em = EntityManagerUtil.getEntityManager();
        
        Funcionario func = em.find(Funcionario.class, 1);
        Profissao prof = em.find(Profissao.class, 1);
        
        prof.adicionarFuncionarios(func);
        em.getTransaction().begin();
        em.persist(func);
        em.getTransaction().commit();
        
        for(Funcionario f: prof.getListaFuncionarios()){
            System.out.println("Funcionarios: " + f.getNome());
        }  
    }
    
}
