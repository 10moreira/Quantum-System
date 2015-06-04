/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TesteAlterar;

import Modelo.Beans.Funcionario;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Mateus Moreira
 */
public class TestesAlterarFuncionario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         EntityManagerFactory emf = Persistence.createEntityManagerFactory("QuantumSystemPU");
        EntityManager em = emf.createEntityManager();
        
        Funcionario func = em.find(Funcionario.class, 1);
        
        func.setCpf("03398323");
        func.setEmail("luizdasila@gmail.com");
        func.setEndereco("Rua presidente vargas - 168 - centro");
        func.setGrau_escolari("Ensino mdio completo");
        func.setIdade(50);
        func.setImagem(null);
        func.setNome("Luiz da silva neto");
        func.setPis("123-34-2-56");
        func.setSexo("Maculino");
        func.setTelefone("32478909");
                 
        em.getTransaction().begin();
        em.persist(func);
        em.getTransaction().commit();
        
    }
    
}
