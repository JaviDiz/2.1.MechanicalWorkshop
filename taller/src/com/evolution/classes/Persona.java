package com.evolution.classes;

public class Persona {

	private String nif;
	private String nom;
	private String llinatges;
	private String telefon;
	private String email;
	
	public Persona() {
		super();
	}
	
	public Persona(String nif, String nom, String llinatges, String email, String telefon) {
		this.nif = nif;
		this.nom = nom;
		this.llinatges = llinatges;
		this.telefon = telefon;
		this.email = email;
	}

	public String getNif() {
		return nif;
	}

	public void setNif(String nif) {
		this.nif = nif;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getLlinatges() {
		return llinatges;
	}

	public void setLlinatges(String llinatges) {
		this.llinatges = llinatges;
	}

	public String getTelefon() {
		return telefon;
	}

	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nif == null) ? 0 : nif.hashCode());
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
		Persona other = (Persona) obj;
		if (nif == null) {
			if (other.nif != null)
				return false;
		} else if (!nif.equals(other.nif))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Persona [nif=" + nif + ", nom=" + nom + ", llinatges=" + llinatges + ", telefon=" + telefon + ", email="
				+ email + "]";
	}
	
	
}
