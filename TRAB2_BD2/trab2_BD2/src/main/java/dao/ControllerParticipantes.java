package dao;

import java.util.Scanner;

import javax.persistence.EntityManager;

import utils.HibernateUtil;

public class ControllerParticipantes {

	EntityManager em = HibernateUtil.getEntityManager();
	Scanner scan = new Scanner(System.in);
	Participantes participante = new Participantes();

	public void createParticipante() {

		System.out.print("Digite o nome do participante do projeto: ");
		participante.setNome(scan.next());

		em.getTransaction().begin();
		em.persist(participante);
		em.getTransaction().commit();

		System.out.println("Participante adicionado com sucesso!!!");
	}

	public void deleteParticipantes() {
		System.out.print("Digite o ID do participante a ser exlcuido: ");
		int id = scan.nextInt();
		scan.nextLine();

		Participantes participante = em.find(Participantes.class, id);

		if (participante != null) {
			System.out.println("Id não encontrado");
		} else {
			em.getTransaction().begin();
			em.remove(participante);
			em.getTransaction().commit();

			System.out.println("Movimentos da conta excluída com sucesso!!!");
		}

	}

	public void updateParticipantes() {
		System.out.print("Digite o ID do participante do projeto para ser atualizada: ");
		int id = scan.nextInt();
		scan.nextLine();

		Participantes participante = em.find(Participantes.class, id);

		if (participante != null) {
			createParticipante();

		} else {
			System.out.println("Id do participante não encontrado!!!");

		}
		System.out.println("Participante do projeto atualizado com sucesso!!!");

	}

	public void findByIdParticipantes() {
		System.out.print("Digite o id participante do projeto: ");
		int id = scan.nextInt();
		scan.nextLine();

		Participantes participante = em.find(Participantes.class, id);
		if (participante == null) {
			System.out.println("Movimento: " + id + " Id, não encontrado!!!");

		} else {
			System.out.println(participante);
		}
	}

}
