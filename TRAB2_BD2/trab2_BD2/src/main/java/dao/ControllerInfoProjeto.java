package dao;

import java.util.Scanner;

import javax.persistence.EntityManager;

import entities.info_Projeto;
import utils.HibernateUtil;

public class ControllerInfoProjeto {
	
	EntityManager em = HibernateUtil.getEntityManager();
	Scanner scan = new Scanner(System.in);
	info_Projeto detalhes =  new info_Projeto();
	
	public void createInfoProjeto() {
		System.out.print("Digite o nome do Projeto: ");
			detalhes.setNome_projeto(scan.nextLine());
		System.out.print("Digite o ID dos detalhes do projeto: ");
			detalhes.setIdInfoProjeto(scan.nextLine());
		
			em.getTransaction().begin();
			em.persist(detalhes);
			em.getTransaction().commit();
			
		System.out.println("Detalhes da conta criado com sucesso!!!");
	}	
	
	public void deleteInfoProjeto() {
		System.out.print("Digite o ID dos detalhes do projeto a ser excluido: ");
			int id = scan.nextInt(); scan.nextLine();
			
		info_Projeto detalhes = em.find(info_Projeto.class, id);
		
		if (detalhes != null) {
			System.out.println("Id não encontrado");
		} else {
			em.getTransaction().begin();
			em.remove(detalhes);
			em.getTransaction().commit();
			
			System.out.println("Detalhes do projeto excluido com sucesso!!!");
		}
			
	}
	
	public void updateInfoProjeto() {
		System.out.print("Digite o ID dos detalhes do projeto atualizado: ");
			int id = scan.nextInt(); scan.nextLine();
			
		info_Projeto detalhes = em.find(info_Projeto.class, id);
		
		if (detalhes != null) {
			createInfoProjeto();
			
		} else {
			System.out.println("Id não encontrado!!!");
			
		}
		System.out.println("Detalhes do projeto atualizados com sucesso!!!");
			
	}
	
	public void findByInfoProjeto() {
		System.out.print("Digite o id do detalhe do projeto: ");
		int id = scan.nextInt();   scan.nextLine();
		
		info_Projeto detalhes = em.find(info_Projeto.class, id);
		if (detalhes == null) {
			System.out.println("Detalhes do projeto: " + id + " Id, não encontrado!!!");
			
		} else {
			System.out.println(detalhes);
		}
	}

}
