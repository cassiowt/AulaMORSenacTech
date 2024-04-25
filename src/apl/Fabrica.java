package apl;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.Endereco;
import modelo.Instrutor;

public class Fabrica {

	private static EntityManagerFactory factory;

	public static void main(String[] args) {

		try {
			factory = Persistence.createEntityManagerFactory("jpa");
			EntityManager em = factory.createEntityManager();
			System.out.println("Fabricado com Sucesso ; )");
			
			Endereco endereco = new Endereco("Rua frei Germano", 66, "Ipanema", "Porto Alergre", "RS");
			Instrutor instrutor = new Instrutor("Cassio", "cassiowt@gmail.com", "99677239", endereco);
			instrutor.setMatricula(1);
			
			em.getTransaction().begin();
			
			em.persist(instrutor);
			
			em.getTransaction().commit();
			
			em.close();

		} catch (RuntimeException e) {
			System.out.println("TRACE_____________________:");
			e.printStackTrace();
		}

	}

}
