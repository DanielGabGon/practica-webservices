/**
 * 
 */
package com.devpredator.practicawebservices.service;

import java.util.ArrayList;
import java.util.List;

import com.devpredator.practicawebservices.entity.Restaurante;

/**
 * @author 4PF28LA_2004
 *
 */
public class RestauranteService {
	
	
	
	
	public List<Restaurante> listaEmpleados(){
		List<Restaurante> listaEmpleados= new ArrayList<Restaurante>();
		
		Restaurante restaurante = new Restaurante();
		restaurante.setIdRestaurante(1L);
		restaurante.setNombre("Tacos el Grande");
		restaurante.setDirección("Esquina de la tortilla col el buen taco.");
		restaurante.setSlogan("Te llenas por que te llenas");
		
		listaEmpleados.add(restaurante);
		
		Restaurante restaurante2= new Restaurante();
		restaurante2.setIdRestaurante(2L);
		restaurante2.setNombre("Camaron Gigante");
		restaurante2.setDirección("Mar de la alegria col el Azul");
		restaurante2.setSlogan("Como pez en el Mar");
		
		listaEmpleados.add(restaurante2);
		return listaEmpleados;
	}
	
	
	

}
