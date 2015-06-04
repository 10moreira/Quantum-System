/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TesteInserir;

import Modelo.Beans.Administrador;
import Modelo.Beans.Equipamento;
import Modelo.Beans.Equipe;
import Modelo.Beans.Funcionario;
import Modelo.Beans.Servico;
import PersistindoUtil.EntityManagerUtil;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Mateus Moreira
 */
public class InserirEquipamento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         EntityManager em = EntityManagerUtil.getEntityManager();
        
        Equipamento e = new Equipamento();
        Administrador admin = em.find(Administrador.class, 1);
        Servico ser = em.find(Servico.class, 1);
        Funcionario func = em.find(Funcionario.class, 1);
        Equipe equi = em.find(Equipe.class, 1);
   
        
        e.setTipo_equipamento("Vassoura");
        e.setQuanti_equipamento(10);
        e.setDescricao_equipamento("Vassoura nº222233 verde");
        e.setValor_gasto(200.00);        
        e.setAdmin(admin);
        e.setServ(ser);
        e.setNome(func);
        e.setNome_equip(equi);
        
        em.getTransaction().begin();
        em.persist(e);
        em.getTransaction().commit();
        
    }
    
}
