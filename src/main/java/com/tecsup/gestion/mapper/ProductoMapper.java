package com.tecsup.gestion.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.tecsup.gestion.model.Producto;

public class ProductoMapper implements RowMapper<Producto> {

	
	public Producto mapRow(ResultSet rs, int rowNum) throws SQLException {
		Producto prod = new Producto();
		prod.setIdproducto(rs.getInt("idproducto"));
		prod.setNombre(rs.getString("nombre"));
		prod.setDescripcion(rs.getString("descripcion"));
		prod.setPrecio(rs.getInt("precio"));
		prod.setStock(rs.getInt("stock"));
		prod.setImportancia(rs.getInt("importancia"));
		prod.setImagen(rs.getString("imagen"));
		return prod;
	}
}
