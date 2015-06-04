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
@Entity
@Table(name="Equipe")
public class Equipe implements Serializable {
    @Id
    @Column(name = "id")
    @SequenceGenerator(name = "SEQ_equipe", sequenceName = "GEN_equipe_Id", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_equipe")
    private Integer id;
    @Column(name = "num_integra", nullable = false)
    private Integer num_integra;
    @Column(name = "nome_equip", length = 30, nullable = false)
    private String nome_equip;
    @Column(name = "gerente", length = 30, nullable = false)
    private String gerente;
    @Column(name = "situacao_equip", length = 80, nullable = false)
    private String situacao_equip;
   
    @ManyToOne
    @JoinColumn(name = "nome_empresa", referencedColumnName = "id", nullable = false)
    private Empresa nome_empresa;
    
    @ManyToOne
    @JoinColumn(name = "nome_admin", referencedColumnName = "id", nullable = false)
    private Administrador adm;
    
//    @OneToMany(mappedBy="nome_equip")
//    @Cascade((org.hibernate.annotations.CascadeType.SAVE_UPDATE))
//    @LazyCollection(LazyCollectionOption.EXTRA)
//    private Collection<Equipamento> listaEquipamentos = new ArrayList<Equipamento>(); 
    
    
    @OneToMany(mappedBy="nome_equip")
    @Cascade((org.hibernate.annotations.CascadeType.SAVE_UPDATE))
    @LazyCollection(LazyCollectionOption.EXTRA)
    private Collection<Funcionario> listaFuncionarios = new ArrayList<Funcionario>(); 
    
   
    public Equipe() {
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
     * @return the num_integra
     */
    public Integer getNum_integra() {
        return num_integra;
    }

    /**
     * @param num_integra the num_integra to set
     */
    public void setNum_integra(Integer num_integra) {
        this.num_integra = num_integra;
    }

    /**
     * @return the nome_equip
     */
    public String getNome_equip() {
        return nome_equip;
    }

    /**
     * @param nome_equip the nome_equip to set
     */
    public void setNome_equip(String nome_equip) {
        this.nome_equip = nome_equip;
    }

    /**
     * @return the gerente
     */
    public String getGerente() {
        return gerente;
    }

    /**
     * @param gerente the gerente to set
     */
    public void setGerente(String gerente) {
        this.gerente = gerente;
    }

    /**
     * @return the situacao_equip
     */
    public String getSituacao_equip() {
        return situacao_equip;
    }

    /**
     * @param situacao_equip the situacao_equip to set
     */
    public void setSituacao_equip(String situacao_equip) {
        this.situacao_equip = situacao_equip;
    }

    public Empresa getEmpre() {
        return nome_empresa;
    }

    public void setEmpre(Empresa empre) {
        this.nome_empresa = empre;
    }

    public Administrador getAdm() {
        return adm;
    }

    public void setAdm(Administrador adm) {
        this.adm = adm;
    }

//    public Collection<Equipamento> getListaEquipamentos() {
//        return listaEquipamentos;
//    }
//
//    public void setListaEquipamentos(Collection<Equipamento> listaEquipamentos) {
//        this.listaEquipamentos = listaEquipamentos;
//    }

//    public void adicionaEquipamento(Equipamento e){
//        e.setNome_equip(this);
//        getListaEquipamentos().add(e);
//    }
//    
//    public void removeEquipamentos(Equipamento e){
//        if(getListaEquipamentos().contains(e)){
//            getListaEquipamentos().remove(e);
//        }
        
    //}

    public Collection<Funcionario> getListaFuncionarios() {
        return listaFuncionarios;
    }

    public void setListaFuncionarios(Collection<Funcionario> listaFuncionarios) {
        this.listaFuncionarios = listaFuncionarios;
    }
    public void adicionarFuncionarios(Funcionario f){
        f.setNome_equip(this);
        getListaFuncionarios().add(f);
    }
    
    public void removeFuncionarios(Funcionario f){
        if(getListaFuncionarios().contains(f)){
            getListaFuncionarios().remove(f);
        }
    }

    @Override
    public String toString() {
        return nome_equip;
    }

    public Empresa getNome_empresa() {
        return nome_empresa;
    }

    public void setNome_empresa(Empresa nome_empresa) {
        this.nome_empresa = nome_empresa;
    }

    
}
