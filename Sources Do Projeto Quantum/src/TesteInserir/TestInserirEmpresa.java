/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TesteInserir;

import Modelo.Beans.Administrador;
import Modelo.Beans.Empresa;
import Modelo.Beans.Equipe;
import Modelo.Beans.Servico;
import PersistindoUtil.EntityManagerUtil;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Mateus Moreira
 */
public class TestInserirEmpresa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         EntityManager em = EntityManagerUtil.getEntityManager();
       
        Empresa e = new Empresa();
        Administrador admin = em.find(Administrador.class, 1);
        Servico ser = em.find(Servico.class, 1);
        Equipe equi = em.find(Equipe.class, 1);

        e.setNome_empresa("Universidade da região da campanha");
        e.setNome_fantasi("Urcamp");
        e.setNome_respon("Joao");
        e.setFuncao_resp("Diretor");
        e.setCnpj("1234567890");
        e.setEmail("urcamp@gmail.com");
        e.setRua("Av. Tupy Silveira");
        e.setBairro("Centro");
        e.setCep("096500");
        e.setTelefone("32471067");
        e.setAdmin(admin);
        
        
        em.getTransaction().begin();
        em.persist(e);
        em.getTransaction().commit();

    }
    
}
