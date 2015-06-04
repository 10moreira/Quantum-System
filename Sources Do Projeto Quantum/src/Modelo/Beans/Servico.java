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
@Entity(name="Servico")
public class Servico implements Serializable {
    @Id
    @Column(name = "ID")
    @SequenceGenerator(name = "SEQ_Ser", sequenceName = "GEN_Ser_ID", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_Ser")
    private Integer id;
    
    @Column(name = "tipoServico", length = 30, nullable = false)
    private String tipoServico;
    
    @Column(name = "valor_gasto", nullable = false, columnDefinition = "DECIMAL(10,3)")
    private Double valor_gasto;
     
    @ManyToOne
    @JoinColumn(name = "nome_equip", referencedColumnName = "id", nullable = false)
    private Equipe equip;
    
    @ManyToOne
    @JoinColumn(name="nome_empresa", referencedColumnName = "id", nullable= false)
    private Empresa nome_empresa;
    
//    @OneToMany(mappedBy="tipo")
//    @Cascade((org.hibernate.annotations.CascadeType.SAVE_UPDATE))
//    @LazyCollection(LazyCollectionOption.EXTRA)
//    private Collection<Equipamento> listaEquipamentos = new ArrayList<Equipamento>(); 
   
    public Servico() {
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
     * @return the tipo
     */
    public String getTipo() {
        return tipoServico;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipoServico = tipo;
    }

    /**
     * @return the valor_gasto
     */
    public Double getValor_gasto() {
        return valor_gasto;
    }

    /**
     * @param valor_gasto the valor_gasto to set
     */
    public void setValor_gasto(Double valor_gasto) {
        this.valor_gasto = valor_gasto;
    }

    public Equipe getEquip() {
        return equip;
    }

    public void setEquip(Equipe equip) {
        this.equip = equip;
    }

    public Empresa getNome_empresa() {
        return nome_empresa;
    }

    public void setNome_empresa(Empresa nome_empresa) {
        this.nome_empresa = nome_empresa;
    }

//    public Collection<Equipamento> getListaEquipamentos() {
//        return listaEquipamentos;
//    }
//
//    public void setListaEquipamentos(Collection<Equipamento> listaEquipamentos) {
//        this.listaEquipamentos = listaEquipamentos;
//    }

    
//    public void adicionarServico(Equipamento e){
//       e.setServ(this);
//       getListaEquipamentos().add(e);
//    }
//    public void removeServico(Equipamento e){
//        if(getListaEquipamentos().contains(e)){
//            getListaEquipamentos().remove(e);
//                    
//        }
//        
//    }

//    @Override
//    public String toString() {
//        return tipo;
//    }
//    
}
