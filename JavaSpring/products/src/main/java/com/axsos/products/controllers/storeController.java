package com.axsos.products.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.axsos.products.models.Category;
import com.axsos.products.models.Product;
import com.axsos.products.services.ProCatService;

@Controller
public class storeController {
private final ProCatService proCatservice;

public storeController(ProCatService proCatservice) {
	
	this.proCatservice = proCatservice;
}
@RequestMapping("/product/new")
	public String newproduct(@ModelAttribute("product")Product product)
	{
	return "product.jsp";
	}
	@RequestMapping(value= "/product/new",method=RequestMethod.POST)
	public String addProduct(@Valid@ModelAttribute("product") Product product , BindingResult result)
	{
		if (result.hasErrors())
		{
			return "product.jsp";
		}
		Product product1 =proCatservice.create(product);
		return "redirect:/product/new";
	}
	
	@RequestMapping("/category/new")
	public String newcategory(@ModelAttribute("category")Category category)
	{
	return "category.jsp";
	}
	@RequestMapping(value= "/category/new",method=RequestMethod.POST)
	public String addcategory(@Valid@ModelAttribute("category") Category category , BindingResult result)
	{
		if (result.hasErrors())
		{
			return "category.jsp";
		}
		Category category1 =proCatservice.create(category);
		return "redirect:/category/new";
	}
	@RequestMapping("/product/{id}")
	public String showProduct(@PathVariable Long id, Model model) {
		Product product = proCatservice.findproduct(id);
		List<Category> category=proCatservice.allcatEx(product);
		model.addAttribute("product", product);
		model.addAttribute("category", category);
		
		return "addproduct.jsp";
	}
	@RequestMapping("/category/{id}")
	public String addCategory(@PathVariable Long id, Model model) {
		Category category = proCatservice.findcategory(id);
		List<Product> product=proCatservice.allproEx(category);
		model.addAttribute("category", category);
		model.addAttribute("product", product);
		return "addcategory.jsp";
	}
	@RequestMapping(value="/product/{id}", method=RequestMethod.POST)
	public String updateProduct(@RequestParam(value="category")Long category_id,@PathVariable Long id  ) {
		proCatservice.createC(id,category_id);
		return "redirect:/product/"+id;
		}
	@RequestMapping(value="/category/{id}", method=RequestMethod.POST)
	public String updateCategory(@RequestParam(value="product")Long  product_id ,@PathVariable Long id ) {
		proCatservice.createP(id,product_id);
		return "redirect:/category/"+id;
		}
	}
