package entities;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="info_Projetos")
public class info_Projeto {
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String idInfoProjeto;
	
	
	@Column(name="data_inicio")
	private Date data_inicio;
	
	@Column(name="nome")
	private String nome_projeto;
	
	
	@OneToOne(mappedBy="info_id_fk1")
	private Projetos projetos;


	public String getIdInfoProjeto() {
		return idInfoProjeto;
	}


	public void setIdInfoProjeto(String idInfoProjeto) {
		this.idInfoProjeto = idInfoProjeto;
	}


	public Date getData_inicio() {
		return data_inicio;
	}


	public info_Projeto() {
		super();
		// TODO Auto-generated constructor stub
	}


	public void setData_inicio(Date data_inicio) {
		this.data_inicio = data_inicio;
	}


	public String getNome_projeto() {
		return nome_projeto;
	}


	public void setNome_projeto(String nome_projeto) {
		this.nome_projeto = nome_projeto;
	}


	public Projetos getProjetos() {
		return projetos;
	}


	public void setProjetos(Projetos projetos) {
		this.projetos = projetos;
	}
	
	
}
