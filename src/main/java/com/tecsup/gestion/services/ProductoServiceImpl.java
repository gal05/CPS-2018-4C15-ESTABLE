package com.tecsup.gestion.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tecsup.gestion.dao.ProductoDAO;
import com.tecsup.gestion.exception.DAOException;
import com.tecsup.gestion.exception.EmptyResultException;
import com.tecsup.gestion.model.Producto;

@Service
public class ProductoServiceImpl implements ProductoService{

	@Autowired
	private ProductoDAO productoDAO;
	
	@Override
	public Producto find(int idproducto) throws DAOException, EmptyResultException {
	
		Producto prod=productoDAO.findProducto(idproducto);
		
		return prod;
		
	}

	@Override
	public List<Producto> findAll() throws DAOException, EmptyResultException {
	
		List<Producto> prod=productoDAO.findAllProductos();
		return prod;
	}

	@Override
	public int update(Producto producto) throws DAOException, EmptyResultException {
		
		productoDAO.update2(producto);
		return 3;
	}

	@Override
	public boolean delete(int idproducto) throws DAOException, EmptyResultException {
		productoDAO.delete(idproducto);

		return true;
	}
	


}
