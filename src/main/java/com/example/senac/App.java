package com.example.senac;


import java.sql.Date;

import javax.persistence.*;

import com.example.senac.model.Author;
import com.example.senac.model.Book;

public class App 
{
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("jpa");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        
        // Inserindo uma nova pessoa no banco de dados
        entityManager.getTransaction().begin();
       
        Author autor = new Author("Clarice Linspector", "Brasil");

        Date data = new Date(0);
        Book livro = new Book("Uma Viagem no Tempo ", autor, data);
        entityManager.persist(livro);
       
        entityManager.getTransaction().commit();
        

        // Buscando uma pessoa pelo ID
        Book livroRetornada = entityManager.find(Book.class,livro.getId());
        System.out.println("Livro encontrada: " + livroRetornada.getTitle() +
        ", Autor: " +livroRetornada.getAuthor() + " Data Publicão: " + livroRetornada.getPublisheDate());
        
        // Fechando o EntityManager e o EntityManagerFactory
        entityManager.close();
        entityManagerFactory.close();
    }

}
