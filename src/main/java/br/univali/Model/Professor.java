package br.univali.Model;

public class Professor {
	private String nome;
	private String titulo;

	public Professor() {

	}

	public Professor(String nomeTemp, String tituloTemp) {
		this.nome = nomeTemp;
		this.titulo = tituloTemp;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nomeTemp) {
		this.nome = nomeTemp;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String tituloTemp) {
		this.titulo = tituloTemp;
	}

}
