package kodlama.io.service;


import java.util.ArrayList;
import java.util.List;

import kodlama.io.core.loging.Logger;
import kodlama.io.model.Category;
import kodlama.io.repository.CategoryRepository;

public class CategoryService implements MainService<Category> {
	
	 private CategoryRepository categoryRepository;
	 
	 List<String> categoryNameList= new ArrayList<>();
	 List<Logger> loggers;

	public CategoryService(CategoryRepository categoryRepository, List<Logger> loggers) {
		this.categoryRepository = categoryRepository;
		this.loggers = loggers;
	}

	@Override
	public void add(Category from) throws Exception {
		
		if(categoryNameList.contains(from.getCategoryName().toUpperCase()))
			throw new Exception("Kategori ismi tekrar edemez.");
		
		categoryNameList.add(from.getCategoryName().toUpperCase());
		
		categoryRepository.add(from);
		
		for (Logger logger : loggers) {
			logger.log(from.getCategoryName());
		}
		
	}
	
	

}
