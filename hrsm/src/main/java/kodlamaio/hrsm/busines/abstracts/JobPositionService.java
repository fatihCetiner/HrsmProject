package kodlamaio.hrsm.busines.abstracts;

import java.util.List;

import kodlamaio.hrsm.entities.concretes.JobPosition;

public interface JobPositionService {
	
	void save(JobPosition jobPosition);
	List<JobPosition> getAll();
	JobPosition getById(int id);

}
