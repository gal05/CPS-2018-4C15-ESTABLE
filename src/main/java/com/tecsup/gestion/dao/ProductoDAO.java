package com.tecsup.gestion.dao;

import java.util.List;

import com.tecsup.gestion.exception.DAOException;
import com.tecsup.gestion.exception.EmptyResultException;
import com.tecsup.gestion.exception.LoginException;
import com.tecsup.gestion.model.Producto;
 
public interface ProductoDAO {
	Producto findProducto(int id) throws DAOException, EmptyResultException;

	void create(int idproducto, String nombre, String descripcion, int  precio, int stock, int importancia, String imagen) throws DAOException;

	void delete(int idproducto) throws DAOException,EmptyResultException;
	
	
	
	void update2(Producto producto)throws DAOException, EmptyResultException;
	
	void update(int idproducto, String nombre, String descripcion, int  precio, int stock, int importancia, String imagen) throws DAOException;

	List<Producto> findAllProductos() throws DAOException, EmptyResultException;

	List<Producto> findProductoByName(String name) throws DAOException, EmptyResultException;
	
}
