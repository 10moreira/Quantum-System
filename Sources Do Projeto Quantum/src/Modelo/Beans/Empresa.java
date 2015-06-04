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
@Table(name = "EMPRESA")
public class Empresa implements Serializable {

    @Id
    @Column(name = "ID")
    @SequenceGenerator(name = "SEQ", sequenceName = "GEN_EMPRESA_ID", allocationSize = 1)
    @GeneratedValue(generator = "SEQ", strategy = GenerationType.SEQUENCE)
    private Integer id;

    @Column(name = "nome_empresa", length = 40, nullable = false)
    private String nome_empresa;
    @Column(name = "nome_respon", length = 30, nullable = false)
    private String nome_respon;
    @Column(name = "funcao_resp", length = 30, nullable = false)
    private String funcao_resp;
    @Column(name = "cnpj", length = 11, nullable = false)
    private String cnpj;
    @Column(name = "nome_fantasi", length = 40, nullable = false)
    private String nome_fantasi;
    @Column(name = "telefone", length = 10, nullable = false)
    private String telefone;
    @Column(name = "email", length = 30, nullable = false)
    private String email;
    @Column(name = "rua", length = 40, nullable = false)
    private String rua;
    @Column(name = "bairro", length = 40, nullable = false)
    private String bairro;
    @Column(name = "cep", length = 40, nullable = false)
    private String cep;

    @ManyToOne
    @JoinColumn(name = "admnistrador", referencedColumnName = "id", nullable = false)
    private Administrador admin;
   
     
    @OneToMany(mappedBy="nome_empresa")
    @Cascade((org.hibernate.annotations.CascadeType.SAVE_UPDATE))
    @LazyCollection(LazyCollectionOption.EXTRA)
    private Collection<Servico> listaServicos = new ArrayList<Servico>(); 
    
    @OneToMany(mappedBy="nome_empresa")
    @Cascade((org.hibernate.annotations.CascadeType.SAVE_UPDATE))
    @LazyCollection(LazyCollectionOption.EXTRA)
    private Collection<Equipe> listaEquipes = new ArrayList<Equipe>(); 
  
    
    public Empresa() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getNome_fantasi() {
        return nome_fantasi;
    }

    public void setNome_fantasi(String nome_fantasi) {
        this.nome_fantasi = nome_fantasi;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome_empresa() {
        return nome_empresa;
    }

    public void setNome_empresa(String nome_empresa) {
        this.nome_empresa = nome_empresa;
    }

    public String getNome_respon() {
        return nome_respon;
    }

    public void setNome_respon(String nome_respon) {
        this.nome_respon = nome_respon;
    }

    public String getFuncao_resp() {
        return funcao_resp;
    }

    public void setFuncao_resp(String funcao_resp) {
        this.funcao_resp = funcao_resp;
    }
    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public Administrador getAdmin() {
        return admin;
    }

    public void setAdmin(Administrador admin) {
        this.admin = admin;
    }

    public Collection<Servico> getListaServicos() {
        return listaServicos;
    }

    public void setListaServicos(Collection<Servico> listaServicos) {
        this.listaServicos = listaServicos;
    }
public void adicionarServicos(Servico s){
    s.setNome_empresa(this);
    getListaServicos().add(s);
}
public void removerServicos(Servico s){
    
    if(getListaServicos().contains(s)){
        getListaServicos().remove(s);
    }
    
}

    public Collection<Equipe> getListaEquipes() {
        return listaEquipes;
    }

    public void setListaEquipes(Collection<Equipe> listaEquipes) {
        this.listaEquipes = listaEquipes;
    }

    public void adicionarEquipe(Equipe e){
        e.setEmpre(this);
        getListaEquipes().add(e);
    }
    public void removeEquipe(Equipe e){
        if(getListaEquipes().contains(e)){
            getListaEquipes().remove(e);
        }
    }
    
}
