package com.example.senac.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "enderecos")
public class Endereco {
    @Id @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    private String tipoLogradouro;
    private String nome;
    private String numero;
    private String bairro;
    private String cidade;
    private String cep;
    private String estado;
    private String pais;

    public Endereco() {}

    public Endereco(String tipoLogradouro, String nome, String numero, String bairro, String cidade, String cep, String estado, String pais) {
        this.tipoLogradouro = tipoLogradouro;
        this.nome = nome;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
        this.cep = cep;
        this.estado = estado;
        this.pais = pais;
    }

    public String getTipoLogradouro() {
        return tipoLogradouro;
    }

    public void setTipoLogradouro(String tipoLogradouro) {
        this.tipoLogradouro = tipoLogradouro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return "Endereco [tipoLogradouro=" + tipoLogradouro + ", nome=" + nome + ", numero=" + numero + ", bairro="
                + bairro + ", cidade=" + cidade + ", cep=" + cep + ", estado=" + estado + ", pais=" + pais + "]";
    }

    
}
