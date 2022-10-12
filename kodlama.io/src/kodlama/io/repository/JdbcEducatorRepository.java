package kodlama.io.repository;

import kodlama.io.model.Educator;

public class JdbcEducatorRepository implements EducatorRepository{

	@Override
	public void add(Educator select) {
		System.out.println(JdbcMessage.addMessage+select);
		
	}

	
}
