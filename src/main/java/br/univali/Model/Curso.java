package br.univali.Model;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = "Curso")
@XmlAccessorType(XmlAccessType.FIELD)
public class Curso {
	@XmlAttribute(name="nome")
	private String nome;
	@XmlElement(name = "Semestre")
	private List<Semestre> semestres = new ArrayList<Semestre>();

	public Curso() {
	}

	public Curso(String nome, List<Semestre> semestres) {
		super();
		this.nome = nome;
		this.semestres = semestres;
	}


}
