package com.evolution;

import com.evolution.classes.*;
import com.evolution.enums.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class app {

	public static void main(String[] args) {
		
		Treballador mecanic_1 = new Treballador(1, "43205569J", "Javi", "Diz", "", "", Categoria.TECNIC_SENIOR); 
		Treballador mecanic_2 = new Treballador(2, "43125678F", "Jose", "Cabello", "", "", Categoria.TECNIC_JUNIOR); 
		
		Client client_1 = new Client(1,"43156323J", "Joan", "Perez", "", "");
		Client client_2  = new Client(2,"57456324L", "Manolo", "Ques", "", "");
		
		Vehicle fiat500 = new Vehicle("4567HDP", "fiat500", 2010, client_1);
		Vehicle fordFocus = new Vehicle("1234ABC", "ford", 2005, client_2);
		
		// AVERIAS
		
		Avaria avaria_1 = new Avaria(1, "problema", "descri..", 150, NivellGravetat.LLEU);
		avaria_1.setVehicle(fiat500);
		avaria_1.setMecanicAssignat(mecanic_1);
		
		Avaria avaria_2 = new Avaria(2, "problema2", "descri..", 500, NivellGravetat.GREU);
		avaria_2.setVehicle(fiat500);
		avaria_2.setMecanicAssignat(mecanic_1);
		
		Avaria avaria_3 = new Avaria(3, "canvi oli", "oli de primera qualitat 40/10", 70.0, NivellGravetat.LLEU);
		avaria_3.setVehicle(fordFocus);
		avaria_3.setMecanicAssignat(mecanic_2);
		
		// LISTAS
		
		List<Avaria> llistaAvaries_1 = new ArrayList<>();
		llistaAvaries_1.add(avaria_1);
		llistaAvaries_1.add(avaria_2);
		
		List<Avaria> llistaAvaries_2 = new ArrayList<>();
		llistaAvaries_2.add(avaria_3);
		
		// FACTURAS
		
		FacturaReparacio factura_1 = new FacturaReparacio(1, true, LocalDate.of(2020, 3, 19), llistaAvaries_1);
		FacturaReparacio factura_2 = new FacturaReparacio(2, false, LocalDate.of(2019, 5, 5), llistaAvaries_2);
		
		
		
		// AVERIAS DE UNA FACTURA
		System.out.println("AVERIAS DE LA FACTURA 1: ");
		System.out.println("---------------------------------");
		for(Avaria item: factura_1.getLlistaAvaries()) {
			System.out.println( item.toString() );
		}
		System.out.println("---------------------------------");
		
		// LISTA FACTURAS Y PRECIO FINAL
		List<FacturaReparacio> llistaFacturesClient1 = new ArrayList<>();
		llistaFacturesClient1.add(factura_1);
		llistaFacturesClient1.add(factura_2);
		
		System.out.println("FACTURAS CLIENTE 1: ");
		System.out.println("---------------------------------");
		for(FacturaReparacio facItem: llistaFacturesClient1) {
			System.out.println( facItem.toString() );
			System.out.println( "Preu Total:" + facItem.preuTotalReparacio());
		}
		System.out.println("---------------------------------");
		
		
		// USUARIO
		UsuariWeb usuari = new UsuariWeb(client_1, "joan", "joan");
		System.out.println("DATOS USUARIO WEB");
		System.out.println("---------------------------------"); 
		System.out.println(usuari.toString());
		
		// IVA
		
		System.out.println("Calcula IVA pressupost");
		System.out.println("---------------------------------");
		double pressupost = FacturaReparacio.calculaIVA(100.0);
		
		System.out.println("PRESU + IVA: " + pressupost);
		
	}

}
