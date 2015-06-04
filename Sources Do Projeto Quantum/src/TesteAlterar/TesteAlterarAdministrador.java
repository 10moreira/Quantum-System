/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TesteAlterar;

import Modelo.Beans.Administrador;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Mateus Moreira
 */
public class TesteAlterarAdministrador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           EntityManagerFactory emf = Persistence.createEntityManagerFactory("QuantumSystemPU");
        EntityManager em = emf.createEntityManager();
        
        Administrador admin = em.find(Administrador.class, 1);
        
        admin.setNome_admin("Pedro");
        admin.setCpf("03398325076");
        admin.setFuncao("Estagiário");
        admin.setSenha("54321");
        admin.setTelefone("32456712");
        
        em.getTransaction().begin();
        em.persist(admin);
        em.getTransaction().commit();
        
    }
    
}
