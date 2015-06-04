/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TesteInserir;

import Modelo.Beans.Administrador;
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
public class InserirEquipe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
      EntityManager em = EntityManagerUtil.getEntityManager();
        
         Equipe eq = new Equipe();
         Empresa emp = em.find(Empresa.class, 1);
         Administrador adm = em.find(Administrador.class, 1);
                 
         
         eq.setNome_equip("Encanadores");
         eq.setNum_integra(10);
         eq.setGerente("Jose");
         eq.setSituacao_equip("Trabalhando durante o turno da manhã das 08hrs ate ao 12:00");
         eq.setEmpre(emp);
         eq.setAdm(adm);
         
         em.getTransaction().begin();
         em.persist(eq);
         em.getTransaction().commit();
        
    }
    
}
