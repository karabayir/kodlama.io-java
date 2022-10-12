package kodlama.io.repository;

import kodlama.io.model.Category;

public class JdbcCategoryRepository implements CategoryRepository {

	@Override
	public void add(Category select) {
		System.out.println(JdbcMessage.addMessage+select);
		
	}

	
}
