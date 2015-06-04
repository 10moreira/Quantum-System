/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TesteAlterar;

import Modelo.Beans.Empresa;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Mateus Moreira
 */
public class TesteAlterarEmpresa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         EntityManagerFactory emf = Persistence.createEntityManagerFactory("QuantumSystemPU");
        EntityManager em = emf.createEntityManager();
        
        Empresa e = em.find(Empresa.class, 6);
        
        e.setNome_empresa("Universidade federal do pampa");
        e.setNome_fantasi("Unipampa");
        e.setBairro("Ivo ferronato");
        e.setCep("96400300");
        e.setCnpj("1234567654");
        e.setEmail("unipampa@gmail.com");
        e.setNome_respon("Joana");
        e.setFuncao_resp("Reitora");
        e.setRua("Av. Maria da conceição");
        e.setTelefone("32473435");
      
        em.getTransaction().begin();
        em.persist(e);
        em.getTransaction().commit();
        
        
    }
    
}
