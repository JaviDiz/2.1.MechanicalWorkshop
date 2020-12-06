package com.evolution.classes;

public class Vehicle {

	private String matricula;
	private String model;
	private int anyMatriculacio; 
	Client propietari;
	
	
	public Vehicle(String matricula) {
		super();
		this.matricula = matricula;
	}



	public Vehicle(String matricula, String model, int anyMatriculacio, Client propietari) {
		this.matricula = matricula;
		this.model = model;
		this.anyMatriculacio = anyMatriculacio;
		this.propietari = propietari;
	}



	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Client getPropietari() {
		return propietari;
	}

	public void setPropietari(Client propietari) {
		this.propietari = propietari;
	}
	

	public int getAnyMatriculacio() {
		return anyMatriculacio;
	}

	public void setAnyMatriculacio(int anyMatriculacio) {
		this.anyMatriculacio = anyMatriculacio;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((matricula == null) ? 0 : matricula.hashCode());
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
		Vehicle other = (Vehicle) obj;
		if (matricula == null) {
			if (other.matricula != null)
				return false;
		} else if (!matricula.equals(other.matricula))
			return false;
		return true;
	}



	@Override
	public String toString() {
		return "Vehicle [matricula=" + matricula + ", model=" + model + ", anyMatriculacio=" + anyMatriculacio
				+ ", propietari=" + propietari + "]";
	}
	
	
	
	
}
