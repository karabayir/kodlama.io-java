package kodlama.io.repository;

import kodlama.io.model.Camp;

public class JdbcCampRepository implements CampRepository {

	@Override
	public void add(Camp select) {
		
		System.out.println(JdbcMessage.addMessage+ select);
	}

}
