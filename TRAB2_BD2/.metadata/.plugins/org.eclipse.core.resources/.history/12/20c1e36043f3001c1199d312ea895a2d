package dao;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="conta")
public class Conta {

	@Id
	@Column(name="numero_conta")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long numeroConta;
	
	@Column(name="agencia")
	private String agencia;
	
	@Column(name="saldo")
	private Double saldo;
	
	@OneToOne(mappedBy = "conta_fk1")
	private Detalhes detalhes;
	
	@OneToMany(mappedBy = "conta_fk2", fetch = FetchType.LAZY)
	private Set<Movimentos> movimentos;
	
	public Conta() {
		
	}

	public Conta(long numeroConta, String agencia, Double saldo, Detalhes detalhes, Set<Movimentos> movimentos) {
		this.numeroConta = numeroConta;
		this.agencia = agencia;
		this.saldo = saldo;
		this.detalhes = detalhes;
		this.movimentos = movimentos;
	}

	public long getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(long numeroConta) {
		this.numeroConta = numeroConta;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public Detalhes getDetalhes() {
		return detalhes;
	}

	public void setDetalhes(Detalhes detalhes) {
		this.detalhes = detalhes;
	}

	public Set<Movimentos> getMovimentos() {
		return movimentos;
	}

	public void setMovimentos(Set<Movimentos> movimentos) {
		this.movimentos = movimentos;
	}

	@Override
	public String toString() {
		return "Conta [numeroConta=" + numeroConta + ", agencia=" + agencia + ", saldo=" + saldo + ", detalhes="
				+ detalhes + ", movimentos=" + movimentos + "]";
	}
	
}
