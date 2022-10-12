package kodlama.io.repository;

import kodlama.io.model.Camp;

public class HibernateCampRepository implements CampRepository {

	@Override
	public void add(Camp select) {
		
		System.out.println(HibernateMessage.addMessage+ select);
	}

}
