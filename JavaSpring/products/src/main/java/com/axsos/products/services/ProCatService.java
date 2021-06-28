package com.axsos.products.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.axsos.products.models.Category;
import com.axsos.products.models.Product;
import com.axsos.products.repositories.categoryRepository;
import com.axsos.products.repositories.productRepository;

@Service
public class ProCatService {
	 private final categoryRepository categoryRepo;
	 private final productRepository productRepo;
	public ProCatService(categoryRepository categoryRepo, productRepository productRepo) {
	
		this.categoryRepo = categoryRepo;
		this.productRepo = productRepo;
	}
	public Product create(Product product) {
		return productRepo.save(product);
	}
	public Category create(Category category) {
		return categoryRepo.save(category);
	}
	public List<Product> allproduct() {
		return productRepo.findAll();
	}
	public List<Category> allcategory() {
		return categoryRepo.findAll();
	}
	 public	Product findproduct(Long id) {
		 
		 Optional<Product> product=productRepo.findById(id);
	     if (product.isPresent())
		 return product.get();
	     else {
	    	 return null;
	     }
	    }
	 public	Category findcategory(Long id) {
		 Optional<Category> category=categoryRepo.findById(id);
		 if (category.isPresent())
	     return category.get();
		 else {
	    	 return null;
	     }
	    }
	 public List<Category> allcatEx(Product product){
			return categoryRepo.findByProductsNotContains(product);
		}
		public List<Product> allproEx(Category category){
			return productRepo.findByCategoriesNotContains(category);
		}
		public Product createC(Long id,Long category_id) {
			Product product=productRepo.findById(id).orElse(null);
			Category category=categoryRepo.findById(category_id).orElse(null);
			List<Category> cat=product.getCategories();
			cat.add(category);
			product.setCategories(cat);
			return productRepo.save(product);
		}
		public Category createP(Long id, Long product_id) {
			Category category=categoryRepo.findById(id).orElse(null);
			Product product=productRepo.findById(product_id).orElse(null);
			List<Product> pro=category.getProducts();
			pro.add(product);
			category.setProducts(pro);
			return categoryRepo.save(category);
		}
}
