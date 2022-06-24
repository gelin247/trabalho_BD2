package dao;

import java.util.Scanner;

import javax.persistence.EntityManager;

import entities.Conta;
import entities.Movimentos;
import utils.HibernateUtil;

public class ControllerMovimentos {
	
	EntityManager em = HibernateUtil.getEntityManager();
	Scanner scan = new Scanner(System.in);
	Movimentos movi = new Movimentos();
	
	public void createMovimentos() {
		
		System.out.print("Digite o CPF da pessoa que ira receber: ");
			movi.setCpfRecebente(scan.nextLine());
		System.out.print("Digite o valor para transferir: ");
			movi.setValor(scan.nextDouble()); scan.nextLine();
		System.out.print("Digite a forma da transferência: ");
			movi.setTipoMovimento(scan.nextLine());
			
			em.getTransaction().begin();
			em.persist(movi);
			em.getTransaction().commit();
			
		System.out.println("Movimentação criada com sucesso!!!");
	}
	
	public void deleteMovimentos() {
		System.out.print("Digite o ID do movimento a ser excluida: ");
			int id = scan.nextInt(); scan.nextLine();
			
		Movimentos movi = em.find(Movimentos.class, id);
		
		if (movi != null) {
			System.out.println("Id não encontrado");
		} else {
			em.getTransaction().begin();
			em.remove(movi);
			em.getTransaction().commit();
			
			System.out.println("Movimentos da conta excluída com sucesso!!!");
		}
			
	}
	
	public void updateMovimentos() {
		System.out.print("Digite o ID do movimento da conta para ser atualizada: ");
			int id = scan.nextInt(); scan.nextLine();
			
		Movimentos movi = em.find(Movimentos.class, id);
		
		if (movi != null) {
			createMovimentos();
			
		} else {
			System.out.println("Id do movimento não encontrado!!!");
			
		}
		System.out.println("Movimento da conta atualizada com sucesso!!!");
			
	}
	
	public void findByIdMovimentos() {
		System.out.print("Digite o id do movimento da conta: ");
		int id = scan.nextInt();   scan.nextLine();
		
		Movimentos movi = em.find(Movimentos.class, id);
		if (movi == null) {
			System.out.println("Movimento: " + id + " Id, não encontrado!!!");
			
		} else {
			System.out.println(movi);
		}
	}

}
