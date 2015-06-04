/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TesteInserir;

import Modelo.Beans.Administrador;
import Modelo.Beans.Equipe;
import Modelo.Beans.Funcionario;
import Modelo.Beans.Profissao;
import PersistindoUtil.EntityManagerUtil;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Mateus Moreira
 */
public class InserirFuncionario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          EntityManager em = EntityManagerUtil.getEntityManager();
          
        Funcionario func = new Funcionario();
        Profissao prof = em.find(Profissao.class, 1);
        Administrador admin = em.find(Administrador.class, 1);
        Equipe equi = em.find(Equipe.class, 1);
       
        func.setNome("Pedro da silva");
        func.setSexo("Masculino");
        func.setTelefone("32471169");
        func.setCpf("033.983.250-87");
        func.setIdade(29);
        func.setGrau_escolari("Ensino médio completo");
        func.setEmail("jose@hotmail.com");
        func.setEndereco("Rua 20 de setembro nº234 - Centro");
        func.setPis("123.345.234.21");
        func.setImagem("c:Bibliotecas\\Imagens");
        func.setProf(prof);
        func.setAdm(admin);
        func.setNome_equip(equi);
        
        em.getTransaction().begin();
        em.persist(func);
        em.getTransaction().commit();
        
    }
    
}
