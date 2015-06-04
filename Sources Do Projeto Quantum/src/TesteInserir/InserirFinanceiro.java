/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TesteInserir;

import Modelo.Beans.Administrador;
import Modelo.Beans.Financeiro;
import PersistindoUtil.EntityManagerUtil;
import java.util.Calendar;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Mateus Moreira
 */
public class InserirFinanceiro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           EntityManager em = EntityManagerUtil.getEntityManager();
        
        Financeiro f = new Financeiro();
        Administrador admin = em.find(Administrador.class, 1);
        
        f.setEntrada_caixa(30.000);
        f.setLucro(6.000);
        f.setSaida_caixa(24.000);
        f.setData_caixa(Calendar.getInstance());
        f.setAdmin(admin);
        
        em.getTransaction().begin();
        em.persist(f);
        em.getTransaction().commit();
        
    }
    
}
