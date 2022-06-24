package dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="movimentos")
public class Movimentos {
	
	@Id
	@Column(name="id_mov_usuario")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idMovUsuario;
	
	@Column(name="cpf_recebente")
	private String cpfRecebente;
	
	@Column(name="valor")
	private Double valor;
	
	@Column(name="tipo_movimento")
	private String tipoMovimento;
	
	@Column(name="conta_fk")
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="conta_fk")
	private Conta contaFk2;

	
	public Movimentos() {
		
	}

	public Movimentos(long idMovUsuario, String cpfRecebente, Double valor, String tipoMovimento, Conta contaFk2) {
		this.idMovUsuario = idMovUsuario;
		this.cpfRecebente = cpfRecebente;
		this.valor = valor;
		this.tipoMovimento = tipoMovimento;
		this.contaFk2 = contaFk2;
	}

	public long getIdMovUsuario() {
		return idMovUsuario;
	}

	public void setIdMovUsuario(long idMovUsuario) {
		this.idMovUsuario = idMovUsuario;
	}

	public String getCpfRecebente() {
		return cpfRecebente;
	}

	public void setCpfRecebente(String cpfRecebente) {
		this.cpfRecebente = cpfRecebente;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public String getTipoMovimento() {
		return tipoMovimento;
	}

	public void setTipoMovimento(String tipoMovimento) {
		this.tipoMovimento = tipoMovimento;
	}

	public Conta getContaFk2() {
		return contaFk2;
	}

	public void setContaFk2(Conta contaFk2) {
		this.contaFk2 = contaFk2;
	}

	@Override
	public String toString() {
		return "Movimentos [idMovUsuario=" + idMovUsuario + ", cpfRecebente=" + cpfRecebente + ", valor=" + valor
				+ ", tipoMovimento=" + tipoMovimento + ", contaFk2=" + contaFk2 + "]";
	}
	
}
