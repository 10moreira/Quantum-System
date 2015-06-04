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
@Entity(name="Funcionario")
public class Funcionario implements Serializable {
    @Id
    @Column(name = "ID")
    @SequenceGenerator(name = "SEQ_Func", sequenceName = "GEN_Func_ID", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_Func")
    private Integer id;
    @Column(name = "nome", length = 30)
    private String nome;
    @Column(name = "pis", length = 30, nullable = false)
    private String pis;
    @Column(name = "cpf", length = 30, nullable = false)
    private String cpf;
    @Column(name = "email", length = 40, nullable = false)
    private String email;
    @Column(name = "telefone", length = 30, nullable = false)
    private String telefone;
    @Column(name = "sexo", length = 10, nullable = false)
    private String sexo;
    @Column(name = "idade", nullable = false)
    private Integer idade;
    @Column(name = "Grau_escolari", length = 40, nullable = false)
    private String Grau_escolari;
    @Column(name = "endereco", length = 80, nullable = false)
    private String endereco;
    @Column(name = "imagem", length = 100, nullable = false)
    private String imagem; 
   
    @ManyToOne
    @JoinColumn(name = "nome_prof", referencedColumnName = "id", nullable = false)
    private Profissao nome_prof;
    
    @ManyToOne
    @JoinColumn(name = "nome_admin", referencedColumnName = "id", nullable = false)
    private Administrador adm;
    
    @OneToMany(mappedBy="nome")
    @Cascade((org.hibernate.annotations.CascadeType.SAVE_UPDATE))
    @LazyCollection(LazyCollectionOption.EXTRA)
    private Collection<Equipamento> listaEquipamentos2 = new ArrayList<Equipamento>(); 
   
     
    @ManyToOne
    @JoinColumn(name = "nome_equip", referencedColumnName = "id", nullable = false)
    private Equipe nome_equip;
    
    
    public Funcionario() {
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
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the pis
     */
    public String getPis() {
        return pis;
    }

    /**
     * @param pis the pis to set
     */
    public void setPis(String pis) {
        this.pis = pis;
    }

    /**
     * @return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the telefone
     */
    public String getTelefone() {
        return telefone;
    }

    /**
     * @param telefone the telefone to set
     */
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    /**
     * @return the sexo
     */
    public String getSexo() {
        return sexo;
    }

    /**
     * @param sexo the sexo to set
     */
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    /**
     * @return the endereco
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * @param endereco the endereco to set
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    /**
     * @return the imagem
     */
   
    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getGrau_escolari() {
        return Grau_escolari;
    }

    public void setGrau_escolari(String Grau_escolari) {
        this.Grau_escolari = Grau_escolari;
    }

    public Profissao getProf() {
        return nome_prof;
    }

    public void setProf(Profissao prof) {
        this.nome_prof = prof;
    }

    public Administrador getAdm() {
        return adm;
    }

    public void setAdm(Administrador adm) {
        this.adm = adm;
    }

    public Collection<Equipamento> getListaEquipamentos2() {
        return listaEquipamentos2;
    }

    public void setListaEquipamentos2(Collection<Equipamento> listaEquipamentos) {
        this.listaEquipamentos2 = listaEquipamentos;
    }

    
    public void adicionaEquipamento(Equipamento e){
       e.setNome(this);
        getListaEquipamentos2().add(e);
    }
    
    public void removeEquipamento(Equipamento e){
        if(getListaEquipamentos2().contains(e)){
            getListaEquipamentos2().remove(e);
        }
    }   

    public Equipe getNome_equip() {
        return nome_equip;
    }

    public void setNome_equip(Equipe nome_equip) {
        this.nome_equip = nome_equip;
    }

    @Override
    public String toString() {
        return nome;
    }

   
    public Profissao getNome_prof() {
        return nome_prof;
    }

    public void setNome_prof(Profissao nome_prof) {
        this.nome_prof = nome_prof;
    }

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }
    
    
}
