/**
 * 
 */
package com.devpredator.practicawebservices.entity;

/**
 * @author 4PF28LA_2004
 *
 */
public class Restaurante {
	
	private Long idRestaurante;
	
	private String nombre;
	
	private String dirección;
	
	private String slogan;

	/**
	 * @return the idRestaurante
	 */
	public Long getIdRestaurante() {
		return idRestaurante;
	}

	/**
	 * @param idRestaurante the idRestaurante to set
	 */
	public void setIdRestaurante(Long idRestaurante) {
		this.idRestaurante = idRestaurante;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the dirección
	 */
	public String getDirección() {
		return dirección;
	}

	/**
	 * @param dirección the dirección to set
	 */
	public void setDirección(String dirección) {
		this.dirección = dirección;
	}

	/**
	 * @return the slogan
	 */
	public String getSlogan() {
		return slogan;
	}

	/**
	 * @param slogan the slogan to set
	 */
	public void setSlogan(String slogan) {
		this.slogan = slogan;
	}

}
