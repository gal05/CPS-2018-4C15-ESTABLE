package com.tecsup.gestion.dao.jdbc;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.tecsup.gestion.dao.ProductoDAO;
import com.tecsup.gestion.exception.DAOException;
import com.tecsup.gestion.exception.EmptyResultException;
import com.tecsup.gestion.mapper.ProductoMapper;
import com.tecsup.gestion.model.Producto;

@Repository
public class ProductoDAOImpl implements ProductoDAO {

	JdbcTemplate template;
	
	private static final Logger logger = LoggerFactory.getLogger(ProductoDAOImpl.class);
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	
	@Override
	public Producto findProducto(int idproducto) throws DAOException, EmptyResultException {

		String query = "SELECT idproducto, nombre, descripcion, precio, stock, importancia, imagen "
				+ " FROM producto WHERE idproducto = ?";

		Object[] params = new Object[] { idproducto };

		try {

			Producto emp = (Producto) jdbcTemplate.queryForObject(query, params, new ProductoMapper());
			//
			return emp;
			//return null;

		} catch (EmptyResultDataAccessException e) {
			throw new EmptyResultException();
		} catch (Exception e) {
			logger.info("Error: " + e.getMessage());
			throw new DAOException(e.getMessage());
		}
	}

	@Override
	public void create(int idproducto, String nombre, String descripcion, int precio, int stock, int importancia,
			String imagen) throws DAOException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int idproducto) throws DAOException,EmptyResultException {
		try {
		
			String query="delete from producto where idproducto="+idproducto+"";
		
		 jdbcTemplate.update(query);
			
		} catch (EmptyResultDataAccessException e) {
			throw new EmptyResultException();
		} catch (Exception e) {
			logger.info("Error Impl: " + e.getMessage());
			throw new DAOException(e.getMessage());
		}	
		
	}

	@Override
	public void update(int idproducto, String nombre, String descripcion, int precio, int stock, int importancia,
			String imagen) throws DAOException {
		String ggg=	"update  producto set nombre='viejo',descripcion='bada',precio=444,stock=5555,importancia=55,imagen='fff' where idproducto=1";
		
	}

	@Override
	public List<Producto> findAllProductos() throws DAOException, EmptyResultException {

		String query = "SELECT *  FROM producto";

		try {

			List<Producto> emp =  jdbcTemplate.query(query, new ProductoMapper());
			//
			return emp;
			//return null;

		} catch (EmptyResultDataAccessException e) {
			throw new EmptyResultException();
		} catch (Exception e) {
			logger.info("Error: " + e.getMessage());
			throw new DAOException(e.getMessage());
		}
	}

	@Override
	public List<Producto> findProductoByName(String name) throws DAOException, EmptyResultException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update2(Producto producto) throws DAOException, EmptyResultException {
		
		
		try {
		//String ggg=	"update  producto set nombre='viejo',descripcion='bada',precio=444,stock=5555,importancia=55,imagen='fff' where idproducto=1";
			String query="update  producto set nombre='"+producto.getNombre()+"',descripcion='"+producto.getDescripcion()+"',precio="+producto.getPrecio()+",stock="+producto.getStock()+",importancia="+producto.getImportancia()+",imagen='"+producto.getImagen()+"' where idproducto="+producto.getIdproducto()+"";
			
		
		 jdbcTemplate.update(query);
			
		} catch (EmptyResultDataAccessException e) {
			throw new EmptyResultException();
		} catch (Exception e) {
			logger.info("Error Impl: " + e.getMessage());
			throw new DAOException(e.getMessage());
		}		
		
		
	}

	
	
}
