package com.example.senac;


import javax.persistence.*;
import com.example.senac.model.Pessoa;

public class App 
{
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("jpa");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        
        // Inserindo uma nova pessoa no banco de dados
        entityManager.getTransaction().begin();
        Pessoa pessoa = new Pessoa("João", 30);
        entityManager.persist(pessoa);
        entityManager.getTransaction().commit();
        
        // Buscando uma pessoa pelo ID
        Pessoa pessoaRetornada = entityManager.find(Pessoa.class, pessoa.getId());
        System.out.println("Pessoa encontrada: " + pessoaRetornada.getNome() + ", " + pessoaRetornada.getIdade() + " anos");
        
        // Fechando o EntityManager e o EntityManagerFactory
        entityManager.close();
        entityManagerFactory.close();
    }

}
