package dao;

import java.util.Scanner;

import javax.persistence.EntityManager;

import utils.HibernateUtil;

public class ControllerProjetos {

	Projetos projeto = new Projetos();
	EntityManager em = HibernateUtil.getEntityManager();
	Scanner scan = new Scanner(System.in);

	public void createProjeto() {
		System.out.print("Digite o custo do projeto: ");
		projeto.setCustoProjeto(scan.nextFloat());

		em.getTransaction().begin();
		em.persist(projeto);
		em.getTransaction().commit();

		System.out.println("Conta criada com sucesso!!!");
	}

	public void deleteProjeto() {
		System.out.print("Digite o ID do projeto a ser excluido: ");
		int id = scan.nextInt();
		scan.nextLine();

		Projetos projeto = em.find(Projetos.class, id);

		if (projeto != null) {
			System.out.println("Id não encontrado");
		} else {
			em.getTransaction().begin();
			em.remove(projeto);
			em.getTransaction().commit();

			System.out.println("Projeto excluido com sucesso!!!");
		}

	}

	public void updateConta() {
		System.out.print("Digite o ID do projeto para ser atualizado: ");
		int id = scan.nextInt();
		scan.nextLine();

		Projetos projeto = em.find(Projetos.class, id);

		if (projeto != null) {
			createProjeto();

		} else {
			System.out.println("Id do projeto não encontrado!!!");

		}
		System.out.println("Projeto atualizada com sucesso!!!");

	}

	public void findByIdConta() {
		System.out.print("Digite o id do projeto: ");
		int id = scan.nextInt();
		scan.nextLine();

		Projetos projeto = em.find(Projetos.class, id);
		if (projeto == null) {
			System.out.println("Projeto: " + id + " Id, não encontrado!!!");

		} else {
			System.out.println(projeto);
		}
	}
}
