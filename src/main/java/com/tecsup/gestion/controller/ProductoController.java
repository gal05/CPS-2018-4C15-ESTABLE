package com.tecsup.gestion.controller;


import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.tecsup.gestion.exception.DAOException;
import com.tecsup.gestion.exception.EmptyResultException;
import com.tecsup.gestion.model.Employee;
import com.tecsup.gestion.model.Producto;
import com.tecsup.gestion.services.ProductoService;


@Controller
public class ProductoController {
	
	
	
	private static final Logger logger = LoggerFactory.getLogger(ProductoController.class);
	
	@Autowired
	private ProductoService productoService;
		
	
	@GetMapping("/admin/product/prodList/")
	public String list(@ModelAttribute("SpringWeb") Producto producto, ModelMap model) {

		try {
			model.addAttribute("productos", productoService.findAll());
		} catch (Exception e) {
			logger.info(e.getMessage());
			model.addAttribute("message", e.getMessage());
		}

		return "admin/product/prodList";
	}
	
	//edit to form para editar
	@RequestMapping("/admin/product/editform/{idproducto}")
	public ModelAndView toEdit(@PathVariable int idproducto, ModelMap model) {
		
		Producto producto = null;
		
		try {
			 producto = productoService.find(idproducto);
		} catch (Exception e) {
			logger.info(e.getMessage());
			model.addAttribute("message", "Error en la consulta del producto");
			
		} 

		return new ModelAndView("/admin/product/editProducto","command",producto);  
	}
	
    @RequestMapping(value="/admin/producto/editSave",method = RequestMethod.POST)  
    public ModelAndView editSave(@ModelAttribute("emp") Producto emp){  
    	try {
			productoService.update(emp);
		} catch (DAOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (EmptyResultException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        return new ModelAndView("redirect:/admin/product/prodList/");

    }
	
	
	
	@RequestMapping(value="/admin/product/editform/edit")
	public String edit(@RequestBody Producto producto, ModelMap model) {
		return "admin/product/editProducto";
	}
	
	

//delete
	
	@RequestMapping("/admin/producto/delete/{idproducto}")
	public ModelAndView delete(@PathVariable int idproducto, ModelMap model) {
		
		Producto producto = null;
		boolean ja = false;
		try {
			  //productoService.delete(idproducto);
		} catch (Exception e) {
			logger.info(e.getMessage());
			model.addAttribute("message", "Error al borrar");
			
		} 

		return new ModelAndView("/admin/product/editProducto","command",producto);  
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
    
    
    @RequestMapping("/admin/product/prodform")  
    public ModelAndView showform(){  
        return new ModelAndView("/admin/product/prodform","command",new Producto());  
    } 
    
    
    
}