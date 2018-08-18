package br.univali.Model;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;



public class Disciplina {
	private Long codigo;
	private String nome;
	private String descricao;
	private List<String> requisitos = new ArrayList<String>();
	private int creditos;
	private String sala;
	private Professor professor;

	public Disciplina() {
	}

	public Disciplina(Long codigo_disciplinaTemp, String nomeTemp, String descricaoTemp, List<String> requisitosTemp,
			int creditosTemp, String salaTemp, Professor professorTemp) {
		this.setCodigo_disciplina(codigo_disciplinaTemp);
		this.setNomeDisciplina(nomeTemp);
		this.descricao = descricaoTemp;
		this.requisitos = requisitosTemp;
		this.creditos = creditosTemp;
		this.sala = salaTemp;
		this.professor = professorTemp;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricaoTemp) {
		this.descricao = descricaoTemp;
	}

	public List<String> getRequisitos() {
		return requisitos;
	}

	public void setRequisitos(List<String> requisitosTemp) {
		this.requisitos = requisitosTemp;
	}

	public int getCreditos() {
		return creditos;
	}

	public void setCreditos(int creditosTemp) {
		this.creditos = creditosTemp;
	}

	public String getSala() {
		return sala;
	}

	public void setSala(String salaTemp) {
		this.sala = salaTemp;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professorTemp) {
		this.professor = professorTemp;
	}

	public void addRequisito(String disciplinaTemp) {
		this.requisitos.add(disciplinaTemp);
	}

	public String getNomeDisciplina() {
		return nome;
	}
	@XmlAttribute(name="nome")
	public void setNomeDisciplina(String nomeDisciplina) {
		this.nome = nomeDisciplina;
	}

	public Long getCodigo_disciplina() {
		return codigo;
	}
	@XmlAttribute(name="codigo")
	public void setCodigo_disciplina(Long codigo_disciplina) {
		this.codigo = codigo_disciplina;
	}
}
