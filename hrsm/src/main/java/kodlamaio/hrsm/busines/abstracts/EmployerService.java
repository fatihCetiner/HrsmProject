package kodlamaio.hrsm.busines.abstracts;

import java.util.List;

import kodlamaio.hrsm.entities.concretes.Employer;

public interface EmployerService {
	
	void save(Employer employer);
	List<Employer> getAll();
	Employer getById(int id);

}
