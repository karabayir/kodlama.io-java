package kodlama.io.service;

import java.util.List;

import kodlama.io.core.loging.Logger;
import kodlama.io.model.Educator;
import kodlama.io.repository.EducatorRepository;

public class EducatorService implements MainService<Educator> {
	
	private EducatorRepository educatorRepository;
	private List<Logger> loggers;

	public EducatorService(EducatorRepository educatorRepository, List<Logger> loggers) {
		this.educatorRepository = educatorRepository;
		this.loggers = loggers;
	}


	@Override
	public void add(Educator from) throws Exception {
		
		educatorRepository.add(from);
		
		for (Logger logger : loggers) {
			logger.log(from.getName()+from.getSurname());
		}
	}
	
}
