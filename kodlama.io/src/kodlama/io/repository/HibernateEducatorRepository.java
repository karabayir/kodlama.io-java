package kodlama.io.repository;

import kodlama.io.model.Educator;

public class HibernateEducatorRepository implements EducatorRepository {

	@Override
	public void add(Educator select) {
		System.out.println(HibernateMessage.addMessage+select);
		
	}

}
