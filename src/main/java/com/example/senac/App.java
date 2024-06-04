package com.example.senac;


import javax.persistence.*;

import com.example.senac.model.Endereco;
import com.example.senac.model.Pessoa;
import com.example.senac.model.Usuario;

public class App 
{
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("jpa");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        
        // Inserindo uma nova pessoa no banco de dados
        entityManager.getTransaction().begin();
        Pessoa pessoa = new Pessoa("João", 30);
        entityManager.persist(pessoa);
        
        // Inserindo um novo usuario no banco de dados
        Usuario usuario = new Usuario("Orfelina", "orfelina@gmail.com", "12345678");
        entityManager.persist(usuario);

        // Inserindo um novo endereço no banco de dados
        Endereco endereco = new Endereco("AV", "Venancio Aires", "93", "Cidade Baixa", "Porto Alegre", "90000-000", "RS", "Brasil");
        entityManager.persist(endereco);
        entityManager.getTransaction().commit();
        

        // Buscando uma pessoa pelo ID
        Pessoa pessoaRetornada = entityManager.find(Pessoa.class, pessoa.getId());
        System.out.println("Pessoa encontrada: " + pessoaRetornada.getNome() + ", " + pessoaRetornada.getIdade() + " anos");
        
        // Fechando o EntityManager e o EntityManagerFactory
        entityManager.close();
        entityManagerFactory.close();
    }

}
