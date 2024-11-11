/**
 * 
 */
package com.devpredator.practicawebservices.ws;

import java.util.List;

import com.devpredator.practicawebservices.entity.Restaurante;
import com.devpredator.practicawebservices.service.RestauranteService;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.GenericEntity;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

/**
 * @author 4PF28LA_2004
 *
 */
@Path(value = "restaurantesWS")
public class RestaurantesWS {

	private RestauranteService restauranteService = new RestauranteService();

	@GET
	@Path("consultarRestaurantes")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public List<Restaurante> consultarRestaurantes() {
		return this.restauranteService.listaEmpleados();
	}

	@POST
	@Path("guardaRestaurante")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response consultarRestaurantes(Restaurante restaurante){
		  if (restaurante==null) {
			  return Response.status(400).entity("No se ingresó informción del restaurante").build();
		}
		  
		  if(restaurante.getIdRestaurante()==null || restaurante.getIdRestaurante()==0) {
			  return Response.status(400).entity("El id del restaurante es requerido").build();
		  }
		  
		  if(restaurante.getNombre()==null || restaurante.getNombre().isEmpty()) {
			  return Response.status(400).entity("El Nombre del restaurante es requerido").build();
		  }
		  
		  if(restaurante.getDirección()==null || restaurante.getDirección().isEmpty()) {
			  return Response.status(400).entity("La Dirección del restaurante es requerido").build();
		  }
		  
		GenericEntity<Restaurante> emEntity= new GenericEntity<Restaurante>(restaurante, Restaurante.class);
		System.out.println("Entrando a Guardar");
		return Response.ok(emEntity).build();
	}

}
