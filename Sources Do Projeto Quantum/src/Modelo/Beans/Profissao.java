/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

/**
 *
 * @author Mateus Moreira
 */
@Table
@Entity(name="Profissao")
public class Profissao implements Serializable {
    @Id
    @Column(name = "ID")
    @SequenceGenerator(name = "SEQ_Prof", sequenceName = "GEN_Prof_ID", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_Prof")
    private Integer id;
    @Column(name = "nome_prof", length = 30, nullable = false)
    private String nome_prof;
    @Column(name = "salario", nullable = false, columnDefinition = "DECIMAL(10,2)")
    private Double salario;

    @ManyToOne
    @JoinColumn(name = "nome_admin", referencedColumnName = "id", nullable = false)
    private Administrador admin;
    
    @OneToMany(mappedBy="nome_prof")
    @Cascade((org.hibernate.annotations.CascadeType.SAVE_UPDATE))
    @LazyCollection(LazyCollectionOption.EXTRA)
    private Collection<Funcionario> listaFuncionarios = new ArrayList<Funcionario>(); 
    
    public Profissao() {
    }

    /**
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome_prof;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome_prof = nome;
    }

    /**
     * @return the salario
     */
    public Double getSalario() {
        return salario;
    }

    /**
     * @param salario the salario to set
     */
    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public Administrador getAdmin() {
        return admin;
    }

    public void setAdmin(Administrador admin) {
        this.admin = admin;
    }

    public Collection<Funcionario> getListaFuncionarios() {
        return listaFuncionarios;
    }

    public void setListaFuncionarios(Collection<Funcionario> listaFuncionarios) {
        this.listaFuncionarios = listaFuncionarios;
    }
    public void adicionarFuncionarios(Funcionario f){
        f.setProf(this);
        getListaFuncionarios().add(f);
    }
    
    public void removerFuncionarios(Funcionario f){
        if(getListaFuncionarios().contains(f)){
            getListaFuncionarios().remove(f);
        }
    }
    
}
