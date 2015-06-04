/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TesteInserir;

import Modelo.Beans.Empresa;
import Modelo.Beans.Servico;
import PersistindoUtil.EntityManagerUtil;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Mateus Moreira
 */
public class InserirServicosEmpresas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          EntityManager em = EntityManagerUtil.getEntityManager();
          
        Servico ser = em.find(Servico.class, 1);
        Empresa emp = em.find(Empresa.class, 1);
        
        emp.adicionarServicos(ser);
        em.getTransaction().begin();
        em.persist(ser);
        em.getTransaction().commit();
        
        for(Servico s : emp.getListaServicos()){
            System.out.println("Tipo: " + s.getTipo());
        }
        
    }
    
}
