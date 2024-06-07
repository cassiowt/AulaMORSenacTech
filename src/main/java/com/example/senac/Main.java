package com.example.senac;

import com.example.senac.model.Author;
import com.example.senac.model.Book;
import com.example.senac.model.Telefone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        // Criar autor
        Author author = new Author();
        author.setName("João Silva");
        author.setPais("Brasil");

        // Criar telefones
        Telefone telefone1 = new Telefone("123456789", "Celular");
        Telefone telefone2 = new Telefone("987654321", "Fixo");

        List<Telefone> telefones = new ArrayList<>();
        telefones.add(telefone1);
        telefones.add(telefone2);

        // Associar telefones ao autor
        author.setTelefones(telefones);

        // Salvar autor e telefones
        em.persist(author);


        // Criar Livro
        Book book = new Book();
        book.setTitle("Java Persistence with JPA");

        //Associar livro ao autor
        book.setAuthor(author);

        // Salvar autor e telefones
        em.persist(book);


        em.getTransaction().commit();

        em.close();
        emf.close();

        System.out.println("Autor e telefones salvos com sucesso!");
    }
}
