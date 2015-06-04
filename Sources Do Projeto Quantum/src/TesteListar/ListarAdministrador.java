/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TesteListar;

import Modelo.Beans.Administrador;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Mateus Moreira
 */
public class ListarAdministrador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("QuantumSystemPU");
        EntityManager em = emf.createEntityManager();
        
        List <Administrador>lista = em.createQuery("from Administrador").getResultList();
        
        for(Administrador a :lista){
            System.out.print("\n id: "+ a.getId() + "\n Nome: " + a.getNome_admin() + "\n cpf: " + a.getCpf() + "\n senha: " + a.getSenha() + "\n função: " + a.getFuncao() + "\n Telefone: " + a.getTelefone());
        }
        
    }
    
}
