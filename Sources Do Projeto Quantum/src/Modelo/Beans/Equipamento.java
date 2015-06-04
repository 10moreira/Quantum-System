/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Beans;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 *
 * @author Mateus Moreira
 */
@Entity
@Table(name="EQUIPAMENTO")
public class Equipamento implements Serializable {
    @Id
    @Column(name = "ID")
    @SequenceGenerator(name = "SEQ_EQUIPAMENTO", sequenceName = "GEN_EQUIPAMENTO_ID", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_EQUIPAMENTO")
    private Integer id;
    @Column(name = "tipo_equipamento", length = 40, nullable = false)
    private String tipo_equipamento;
    @Column(name = "descricao_equipamento", length = 80, nullable = false)
    private String descricao_equipamento;
    @Column(name = "quanti_equipamento", nullable = false)
    private Integer quanti_equipamento;
   @Column(name = "valor_gasto", nullable = false, columnDefinition = "DECIMAL(10,2)")
   private Double valor_gasto;

    @ManyToOne
    @JoinColumn(name = "nome_admin", referencedColumnName = "id", nullable = false)
    private Administrador admin;
   
    @ManyToOne
    @JoinColumn(name = "tipoServico", referencedColumnName = "id", nullable = false)
    private  Servico tipoServico;
    
    @ManyToOne
    @JoinColumn(name = "nome", referencedColumnName = "id", nullable = false)
    private Funcionario nome;
    
    @ManyToOne
    @JoinColumn(name = "nome_equip", referencedColumnName = "id", nullable = false)
    private Equipe nome_equip;
    
    
    public Equipamento() {
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
     * @return the tipo_equipamento
     */
    public String getTipo_equipamento() {
        return tipo_equipamento;
    }

    /**
     * @param tipo_equipamento the tipo_equipamento to set
     */
    public void setTipo_equipamento(String tipo_equipamento) {
        this.tipo_equipamento = tipo_equipamento;
    }

    /**
     * @return the descricao_equipamento
     */
    public String getDescricao_equipamento() {
        return descricao_equipamento;
    }

    /**
     * @param descricao_equipamento the descricao_equipamento to set
     */
    public void setDescricao_equipamento(String descricao_equipamento) {
        this.descricao_equipamento = descricao_equipamento;
    }

    /**
     * @return the quanti_equipamento
     */
    public Integer getQuanti_equipamento() {
        return quanti_equipamento;
    }

    /**
     * @param quanti_equipamento the quanti_equipamento to set
     */
    public void setQuanti_equipamento(Integer quanti_equipamento) {
        this.quanti_equipamento = quanti_equipamento;
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

    public Administrador getAdmin() {
        return admin;
    }

    public void setAdmin(Administrador admin) {
        this.admin = admin;
    }

    public Servico getServ() {
        return tipoServico;
    }

    public void setServ(Servico serv) {
        this.tipoServico = serv;
    }

    public Servico getTipo() {
        return tipoServico;
    }

    public void setTipo(Servico tipo) {
        this.tipoServico = tipo;
    }

    public Funcionario getNome() {
        return nome;
    }

    public void setNome(Funcionario nome) {
        this.nome = nome;
    }

    public Equipe getNome_equip() {
        return nome_equip;
    }

    public void setNome_equip(Equipe nome_equip) {
        this.nome_equip = nome_equip;
    }
    
}
