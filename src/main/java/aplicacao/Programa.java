package aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;


public class Programa {

	public static void main(String[] args) {

		Pessoa p1 = new Pessoa(1, "joao", "joao@gmail.com");
		Pessoa p2 = new Pessoa(2, "maria", "maria@gmail.com");
		Pessoa p3 = new Pessoa(3, "beto", "beto@gamil.com");

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();
		em.persist(p1);
		em.persist(p2);
		em.persist(p3);
		em.getTransaction().commit();

		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);

	}

}
