/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TesteExcluir;

import Modelo.Beans.Administrador;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Mateus Moreira
 */
public class TesteExcluirAdministrador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           EntityManagerFactory emf = Persistence.createEntityManagerFactory("QuantumSystemPU");
        EntityManager em = emf.createEntityManager();
        Administrador a = em.find(Administrador.class, 1);
        
        System.out.println("\n id: "+ a.getId() + "\n Nome: " + a.getNome_admin() + "\n cpf: " + a.getCpf() + "\n senha: " + a.getSenha() + "\n função: " + a.getFuncao() + "\n Telefone: " + a.getTelefone());
              em.getTransaction().begin();
               em.remove(a);
                 em.getTransaction().commit();
    }
    
}
