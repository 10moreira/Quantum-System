/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TesteExcluir;

import Modelo.Beans.Empresa;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Mateus Moreira
 */
public class TesteExcluirEmpresa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("QuantumSystemPU");
        EntityManager em = emf.createEntityManager();
        
        Empresa e = em.find(Empresa.class, 3);
                System.out.println("\nid: " + e.getId() + "\nNome Empresa: " + e.getNome_empresa() + "\nNome Fantasia: " + e.getNome_fantasi() + "\nRua: " + e.getRua() + "\nBairro: " + e.getBairro()+ "\nCep: " + e.getCep()+ "\nTelefone: " +e.getTelefone() + "\nCnpj: " +e.getCnpj() + "\nEmail: "+e.getEmail() +"\nNome Responsavel: " +e.getNome_respon() + "\nFunção Responsavel: " +e.getFuncao_resp() + "" + e.getTelefone());
              em.getTransaction().begin();
               em.remove(e);
                 em.getTransaction().commit();
    }
    
}
