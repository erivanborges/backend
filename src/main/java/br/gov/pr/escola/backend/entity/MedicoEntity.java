/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.gov.pr.escola.backend.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
//import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.io.Serializable;

/**
 *
 * @author Administrador
 */
@Entity
@Table(name = "medico" )
public class MedicoEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cod_medico", nullable = false)
    private Long id;
    //@OneToMany Nao e uma collection ou colecao
    @ManyToOne
    @JoinColumn(name = "cod_cidade", nullable = false)
    private CidadeEntity cidade;
    @ManyToOne
    @JoinColumn(name = "num_ambulatorio", nullable = false)
    private AmbulatorioEntity ambulatorio;
    @Column(name = "nome_medico", length = 50)
    private String nome;
    @Column(name = "especialidade", length = 30)
    private String especialidade;
    @Column(name = "cpf", length = 11)
    private String cpf;
    @Column(name = "idade")
    private int idade;

    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return the cidade
     */
    public CidadeEntity getCidade() {
        return cidade;
    }

    /**
     * @param cidade the cidade to set
     */
    public void setCidade(CidadeEntity cidade) {
        this.cidade = cidade;
    }

    /**
     * @return the ambulatorio
     */
    public AmbulatorioEntity getAmbulatorio() {
        return ambulatorio;
    }

    /**
     * @param ambulatorio the ambulatorio to set
     */
    public void setAmbulatorio(AmbulatorioEntity ambulatorio) {
        this.ambulatorio = ambulatorio;
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
     * @return the especialidade
     */
    public String getEspecialidade() {
        return especialidade;
    }

    /**
     * @param especialidade the especialidade to set
     */
    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
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
     * @return the idade
     */
    public int getIdade() {
        return idade;
    }

    /**
     * @param idade the idade to set
     */
    public void setIdade(int idade) {
        this.idade = idade;
    }
    
}
