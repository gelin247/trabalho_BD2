package dao;

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
@Table(name = "Projetos")
public class Projetos {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String idProjeto;

	@Column(name = "Custo")
	private float custoProjeto;

	@OneToOne
	@JoinColumn(name = "info_id_fk")
	@Column(name = "info_id_fk")
	private info_Projeto info_projeto;

	@OneToMany(mappedBy = "id_projeto_fk", fetch = FetchType.LAZY)
	private Participantes participantes_projeto;

	public Projetos() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getIdProjeto() {
		return idProjeto;
	}

	public void setIdProjeto(String idProjeto) {
		this.idProjeto = idProjeto;
	}

	public float getCustoProjeto() {
		return custoProjeto;
	}

	public void setCustoProjeto(float custoProjeto) {
		this.custoProjeto = custoProjeto;
	}

	public info_Projeto getInfo_projeto() {
		return info_projeto;
	}

	public void setInfo_projeto(info_Projeto info_projeto) {
		this.info_projeto = info_projeto;
	}

	public Participantes getParticipantes_projeto() {
		return participantes_projeto;
	}

	public Projetos(String idProjeto, float custoProjeto, info_Projeto info_projeto,
			Participantes participantes_projeto) {
		super();
		this.idProjeto = idProjeto;
		this.custoProjeto = custoProjeto;
		this.info_projeto = info_projeto;
		this.participantes_projeto = participantes_projeto;
	}

	public void setParticipantes_projeto(Participantes participantes_projeto) {
		this.participantes_projeto = participantes_projeto;
	}

}
