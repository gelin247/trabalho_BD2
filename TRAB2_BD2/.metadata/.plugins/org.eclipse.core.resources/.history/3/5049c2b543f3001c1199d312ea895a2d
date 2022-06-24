package dao;

import java.util.Scanner;

import javax.persistence.EntityManager;

import entities.Conta;
import utils.HibernateUtil;

public class ControllerConta {
	
	Conta conta = new Conta();
	EntityManager em = HibernateUtil.getEntityManager();
	Scanner scan = new Scanner(System.in);

	public void createConta() {
		System.out.print("Digite o número da agencia: ");
			conta.setAgencia(scan.nextLine());
		System.out.print("Digite o saldo inicial: ");
			conta.setSaldo(scan.nextDouble()); scan.nextLine();
			
			em.getTransaction().begin();
			em.persist(conta);
			em.getTransaction().commit();
			
		System.out.println("Conta criada com sucesso!!!");
	}
	
	public void deleteConta() {
		System.out.print("Digite o ID da conta a ser excluida: ");
			int id = scan.nextInt(); scan.nextLine();
			
		Conta conta = em.find(Conta.class, id);
		
		if (conta != null) {
			System.out.println("Id não encontrado");
		} else {
			em.getTransaction().begin();
			em.remove(conta);
			em.getTransaction().commit();
			
			System.out.println("Conta excluída com sucesso!!!");
		}
			
	}
	
	public void updateConta() {
		System.out.print("Digite o ID da conta para ser atualizada: ");
			int id = scan.nextInt(); scan.nextLine();
			
		Conta conta = em.find(Conta.class, id);
		
		if (conta != null) {
			createConta();
			
		} else {
			System.out.println("Id da conta não encontrado!!!");
			
		}
		System.out.println("Conta atualizada com sucesso!!!");
			
	}
	
	public void findByIdConta() {
		System.out.print("Digite o id da conta: ");
		int id = scan.nextInt();   scan.nextLine();
		
		Conta conta = em.find(Conta.class, id);
		if (conta == null) {
			System.out.println("Conta: " + id + " Id, não encontrado!!!");
			
		} else {
			System.out.println(conta);
		}
	}
}
