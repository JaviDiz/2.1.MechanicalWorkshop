package com.evolution.classes;

import java.time.LocalDate;
import java.util.List;

public class FacturaReparacio {

	private long id;
	private boolean pagada;
	private LocalDate dataFactura;
	private List<Avaria> llistaAvaries;
	
	public static final double IVA = 0.21;
	public static final double PREMIUM = 0.05;
	
	public FacturaReparacio(long id, boolean pagada, LocalDate dataFactura, List<Avaria> llistaAvaries) {
		super();
		this.id = id;
		this.pagada = pagada;
		this.dataFactura = dataFactura;
		this.llistaAvaries = llistaAvaries;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public boolean isPagada() {
		return pagada;
	}

	public void setPagada(boolean pagada) {
		this.pagada = pagada;
	}

	public LocalDate getDataFactura() {
		return dataFactura;
	}

	public void setDataFactura(LocalDate dataFactura) {
		this.dataFactura = dataFactura;
	}

	public List<Avaria> getLlistaAvaries() {
		return llistaAvaries;
	}

	public void setLlistaAvaries(List<Avaria> llistaAvaries) {
		this.llistaAvaries = llistaAvaries;
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
		FacturaReparacio other = (FacturaReparacio) obj;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "FacturaReparacio [id=" + id + ", pagada=" + pagada + ", dataFactura=" + dataFactura + ", llistaAvaries="
				+ llistaAvaries + "]";
	}
	
	
	public double preuTotalReparacio() {
		double total = 0;
		for (Avaria e: this.llistaAvaries) {
			total += e.getPreu();
		}
		
		boolean clientPremium = this.llistaAvaries.get(0).getVehicle().getPropietari().isPremium();
				
		if (clientPremium) {
			double preuDescompte = (total * PREMIUM); 
			total= total - preuDescompte ; 
		}
		return total;
	}
	
	public double preuTotalReparacioAmbIVA() {
		double total = preuTotalReparacio();
		double iva = total * IVA;
		return (total + iva);
	}
	
	// Calcula IVA d'un preu 
	public static double  calculaIVA(double preu) {
		return preu * (1+IVA);
	}
	
}
