package com.tecsup.gestion.services;

import java.util.List;

import com.tecsup.gestion.exception.DAOException;
import com.tecsup.gestion.exception.EmptyResultException;
import com.tecsup.gestion.model.Producto;



public interface ProductoService {
	Producto find(int idproducto) throws DAOException, EmptyResultException;

	List<Producto> findAll() 
			throws DAOException, EmptyResultException;
	
	int update(Producto producto) throws DAOException, EmptyResultException;
	
	
	boolean delete(int idproducto) throws DAOException, EmptyResultException;
}
