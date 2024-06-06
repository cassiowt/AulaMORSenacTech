package com.example.senac.model;

import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name = "livros")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "livro_id")
    private long id;
    
    @Column(name = "titulo", unique = true, nullable = false)
    private String title;

    @JoinColumn(name = "autores", referencedColumnName = "autor_id") 
    @OneToOne(cascade={CascadeType.PERSIST})
    private Author author;

    @Column(name = "data_publicacao")
    private Date publisheDate;

    public Book() {
    }
    
    public Book( String title, Author author, Date publisheDate) {
        this.title = title;
        this.author = author;
        this.publisheDate = publisheDate;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Date getPublisheDate() {
        return publisheDate;
    }

    public void setPublisheDate(Date publisheDate) {
        this.publisheDate = publisheDate;
    }

    @Override
    public String toString() {
        return "Book [id=" + id + ", title=" + title + ", author=" + author + ", publisheDate=" + publisheDate + "]";
    }

    
}
