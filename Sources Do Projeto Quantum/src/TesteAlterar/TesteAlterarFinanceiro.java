/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TesteAlterar;

import Modelo.Beans.Financeiro;
import java.util.Calendar;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Mateus Moreira
 */
public class TesteAlterarFinanceiro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         EntityManagerFactory emf = Persistence.createEntityManagerFactory("QuantumSystemPU");
        EntityManager em = emf.createEntityManager();
        
        Financeiro f =  em.find(Financeiro.class, 3);
        
        f.setEntrada_caixa(10.000);
        f.setData_caixa(Calendar.getInstance());
        f.setSaida_caixa(5.000);
        f.setLucro(5.000);
        
        em.getTransaction().begin();
        em.persist(f);
        em.getTransaction().commit();
    }
    
}
