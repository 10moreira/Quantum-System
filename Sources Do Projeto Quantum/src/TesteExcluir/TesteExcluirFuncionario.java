/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TesteExcluir;

import Modelo.Beans.Funcionario;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Mateus Moreira
 */
public class TesteExcluirFuncionario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("QuantumSystemPU");
        EntityManager em = emf.createEntityManager();
        
        Funcionario f = em.find(Funcionario.class, 2);
              System.out.println("\n id: " + f.getId() +"\nNome: "+ f.getNome() + "\nSexo: " + f.getSexo() + "\nTelefone: " + f.getTelefone() + "\nGrau de escolaridad: " + f.getGrau_escolari() + "\nEmail: " + f.getEmail() + "\nEndereço: " + f.getEndereco() + "\nFoto: " + f.getImagem() + "\nCpf: " + f.getCpf() + "\nPis: " + f.getPis());
            em.getTransaction().begin();
            em.remove(f);
            em.getTransaction().commit();
        
    }
    
}
