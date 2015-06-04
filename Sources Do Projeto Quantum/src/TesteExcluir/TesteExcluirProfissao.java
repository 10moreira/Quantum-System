/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TesteExcluir;

import Modelo.Beans.Profissao;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Mateus Moreira
 */
public class TesteExcluirProfissao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           EntityManagerFactory emf = Persistence.createEntityManagerFactory("QuantumSystemPU");
        EntityManager em = emf.createEntityManager();
        
        Profissao p = em.find(Profissao.class, 2);
                System.out.print("\nid: " + p.getId() + "\nNome: " + p.getNome() + "\nSalario: " + p.getSalario());
                    em.getTransaction().begin();
                    em.remove(p);
                    em.getTransaction().commit();
        
    }
    
}
