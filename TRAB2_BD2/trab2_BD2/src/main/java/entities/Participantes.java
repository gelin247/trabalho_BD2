package entities;

import java.sql.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Participantes")
public class Participantes {

	@Id
	@Column(name = "autoID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String autoID;

	@Column(name = "data_entrada")
	private Date data_entrada;

	@Column(name = "Nome")
	private String nome;

	@ManyToOne(fetch = FetchType.LAZY)
	@Column(name = "id_projeto_fk")
	@JoinColumn(name = "id_projeto_fk")
	private Projetos projeto_fk2;

	public String getAutoID() {
		return autoID;
	}

	public void setAutoID(String autoID) {
		this.autoID = autoID;
	}

	public Date getData_entrada() {
		return data_entrada;
	}

	public void setData_entrada(Date data_entrada) {
		this.data_entrada = data_entrada;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Projetos getProjeto_fk2() {
		return projeto_fk2;
	}

	public void setProjeto_fk2(Projetos projeto_fk2) {
		this.projeto_fk2 = projeto_fk2;
	}

	public Participantes() {

	}

	public Participantes(String autoID, Date data_entrada, String nome, Projetos projeto_fk2) {
		super();
		this.autoID = autoID;
		this.data_entrada = data_entrada;
		this.nome = nome;
		this.projeto_fk2 = projeto_fk2;
	}
}
