package com.tecsup.gestion.model;

public class Producto {
	

	private int idproducto;
	private String nombre;
	private String descripcion;
	private int precio;
	private int stock;
	private int importancia;
	private String imagen;
	
	/**
	 * 
	 * @param idproducto
	 * @param nombre
	 * @param descripcion
	 * @param precio
	 * @param stock
	 * @param importancia
	 * @param imagen
	 */
	
	public Producto(int idproducto, String nombre, String descripcion, int precio, int stock, int importancia,
			String imagen) {
		super();
		this.idproducto = idproducto;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.precio = precio;
		this.stock = stock;
		this.importancia = importancia;
		this.imagen = imagen;
	}
	
	
	
	public Producto() {
		super();
	}



	public int getIdproducto() {
		return idproducto;
	}
	public void setIdproducto(int idproducto) {
		this.idproducto = idproducto;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public int getImportancia() {
		return importancia;
	}
	public void setImportancia(int importancia) {
		this.importancia = importancia;
	}
	public String getImagen() {
		return imagen;
	}
	public void setImagen(String imagen) {
		this.imagen = imagen;
	}
	@Override
	public String toString() {
		return "Producto [idproducto=" + idproducto + ", nombre=" + nombre + ", descripcion=" + descripcion
				+ ", precio=" + precio + ", stock=" + stock + ", importancia=" + importancia + ", imagen=" + imagen
				+ "]";
	}
	
	
	
	
	
	

}
