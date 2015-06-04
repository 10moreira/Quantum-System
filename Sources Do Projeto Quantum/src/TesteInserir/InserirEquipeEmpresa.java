/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TesteInserir;

import Modelo.Beans.Empresa;
import Modelo.Beans.Equipe;
import PersistindoUtil.EntityManagerUtil;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Mateus Moreira
 */
public class InserirEquipeEmpresa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         EntityManager em = EntityManagerUtil.getEntityManager();
        
        Equipe equi = em.find(Equipe.class, 1);
        Empresa emp = em.find(Empresa.class, 1);
        
        emp.adicionarEquipe(equi);
        em.getTransaction().begin();
        em.persist(equi);
        em.getTransaction().commit();
        
        for(Equipe equ: emp.getListaEquipes()){
            System.out.println("Equipe :" + equ.getNome_equip());
        }
        
        
    }
    
}
