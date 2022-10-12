package kodlama.io.service;

import java.util.List;

import kodlama.io.core.loging.Logger;
import kodlama.io.model.Camp;
import kodlama.io.repository.CampRepository;

public class CampService implements MainService<Camp> {
	
	private CampRepository campRepository;
	List<Logger> loggers;
	
	public CampService(CampRepository campRepository, List<Logger> loggers) {
		this.campRepository = campRepository;
		this.loggers = loggers;
	}

	@Override
	public void add(Camp from) throws Exception {
		
		campRepository.add(from);
		
		for (Logger logger : loggers) {
			logger.log(from.getCampName());
		}
	}
	
}
