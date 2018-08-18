package br.univali.Model;

import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;

public class Semestre {

	public String getNome() {
		return nome;
	}
	@XmlAttribute(name="nome")
	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}

	private String nome;
	private List<Disciplina> disciplinas;

	public Semestre() {
	}

	public Semestre(String nomeTemp, List<Disciplina> disciplinasTemp) {
		super();
		this.nome = nomeTemp;
		this.disciplinas = disciplinasTemp;
	}

}
