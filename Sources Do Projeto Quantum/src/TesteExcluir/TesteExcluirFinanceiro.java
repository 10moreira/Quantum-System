/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TesteExcluir;

import Modelo.Beans.Financeiro;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Mateus Moreira
 */
public class TesteExcluirFinanceiro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("QuantumSystemPU");
        EntityManager em = emf.createEntityManager();
        
        Financeiro f = em.find(Financeiro.class, 4);
          System.out.println("\n id: " + f.getId() + "\n Entrada Caixa: " + f.getEntrada_caixa() + "\nSaida Caixa: " + f.getSaida_caixa() + "\nData Caixa: "+ f.getData_caixa()+ "\nLucro: " + f.getLucro());

        em.getTransaction().begin();
        em.remove(f);
        em.getTransaction().commit();
        
    }
    
}
