/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Beans;

import java.io.Serializable;
import java.util.Calendar;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Mateus Moreira
 */
@Entity
@Table(name="FINANCEIRO")
public class Financeiro implements Serializable {
    @Id
    @Column(name = "ID")
    @SequenceGenerator(name = "SEQ_Financ", sequenceName = "GEN_Financ_ID", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_Financ")
    private Integer id;
    @Column(name = "entrada_caixa", nullable = false, columnDefinition = "DECIMAL(10,3)")
    private Double entrada_caixa;
    @Column(name = "saida_caixa", nullable = false, columnDefinition = "DECIMAL(10,3)")
    private Double saida_caixa;
    @Column(name = "lucro", nullable = false, columnDefinition = "DECIMAL(10,3)")
    private Double lucro;
    @Column
    @Temporal(TemporalType.TIMESTAMP)
    private Calendar data_caixa;

    @ManyToOne
    @JoinColumn(name = "nome_admin", referencedColumnName = "id", nullable = false)
    private Administrador admin;
    
    public Financeiro() {
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
     * @return the entrada_caixa
     */
    public Double getEntrada_caixa() {
        return entrada_caixa;
    }

    /**
     * @param entrada_caixa the entrada_caixa to set
     */
    public void setEntrada_caixa(Double entrada_caixa) {
        this.entrada_caixa = entrada_caixa;
    }

    /**
     * @return the saida_caixa
     */
    public Double getSaida_caixa() {
        return saida_caixa;
    }

    /**
     * @param saida_caixa the saida_caixa to set
     */
    public void setSaida_caixa(Double saida_caixa) {
        this.saida_caixa = saida_caixa;
    }

    /**
     * @return the lucro
     */
    public Double getLucro() {
        return lucro;
    }

    /**
     * @param lucro the lucro to set
     */
    public void setLucro(Double lucro) {
        this.lucro = lucro;
    }

    /**
     * @return the data_caixa
     */
    public Calendar getData_caixa() {
        return data_caixa;
    }

    /**
     * @param data_caixa the data_caixa to set
     */
    public void setData_caixa(Calendar data_caixa) {
        this.data_caixa = data_caixa;
    }

    public Administrador getAdmin() {
        return admin;
    }

    public void setAdmin(Administrador admin) {
        this.admin = admin;
    }
}
