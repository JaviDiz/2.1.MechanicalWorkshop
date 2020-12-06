package com.evolution.classes;

import com.evolution.enums.Categoria;

public class Treballador extends Persona {
	
	private long id;
	private double preuHora;
	
	private Categoria categoria;
	
	public static final int JC = 8;
	
	public Treballador(String nif, String nom, String llinatges, String email, String telefon) {
		super(nif, nom, llinatges, email, telefon);
	}
	
	public Treballador(long id, String nif, String nom, String llinatges, String email, String telefon, Categoria cat) {
		super(nif, nom, llinatges, email, telefon);
		this.id = id;
		this.categoria = cat;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public double getPreuHora() {
		return preuHora;
	}

	public void setPreuHora(double preuHora) {
		this.preuHora = preuHora;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + (int) (id ^ (id >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Treballador other = (Treballador) obj;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Treballador [id=" + id + ", preuHora=" + preuHora + ", categoria=" + categoria + "]";
	}
	
		public double costSemanal() {
			double preuDia = this.preuHora*JC;
			return preuDia*5;
		}
	
}
