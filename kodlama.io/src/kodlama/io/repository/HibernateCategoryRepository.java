package kodlama.io.repository;

import kodlama.io.model.Category;

public class HibernateCategoryRepository implements CategoryRepository {

	@Override
	public void add(Category select) {
		System.out.println(HibernateMessage.addMessage+select);
		
	}

	

	
}
