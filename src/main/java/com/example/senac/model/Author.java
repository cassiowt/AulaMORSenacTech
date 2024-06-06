package com.example.senac.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "autores")
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "autor_id")
    private long id;
    private String name;
    private String pais;

    public Author() {
    }

    public Author(String name, String pais) {
        this.name = name;
        this.pais = pais;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getpais() {
        return pais;
    }

    public void setpais(String pais) {
        this.pais = pais;
    }
    
}
