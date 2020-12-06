package com.evolution.classes;

import com.evolution.enums.NivellGravetat;

public class Avaria {
	
	private long id;
	private String nom;
	private String descripcio;
	private double preu;
	
	private Treballador mecanicAssignat;
	private Vehicle vehicle;
	private NivellGravetat gravetat;
	
	public Avaria(long id, String nom, String descripcio, double preu, NivellGravetat gravetat) {
		super();
		this.id = id;
		this.nom = nom;
		this.descripcio = descripcio;
		this.preu = preu;
		this.gravetat = gravetat;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getDescripcio() {
		return descripcio;
	}

	public void setDescripcio(String descripcio) {
		this.descripcio = descripcio;
	}

	public double getPreu() {
		return preu;
	}

	public void setPreu(double preu) {
		this.preu = preu;
	}

	public Treballador getMecanicAssignat() {
		return mecanicAssignat;
	}

	public void setMecanicAssignat(Treballador mecanicAssignat) {
		this.mecanicAssignat = mecanicAssignat;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public NivellGravetat getGravetat() {
		return gravetat;
	}

	public void setGravetat(NivellGravetat gravetat) {
		this.gravetat = gravetat;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Avaria other = (Avaria) obj;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Avaria [id=" + id + ", nom=" + nom + ", descripcio=" + descripcio + ", preu=" + preu
				+ ", mecanicAssignat=" + mecanicAssignat + ", vehicle=" + vehicle + ", gravetat=" + gravetat + "]";
	}
	
	
	
	
	
}
