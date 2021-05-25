package kodlamaio.hrsm.busines.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrsm.busines.abstracts.JobPositionService;
import kodlamaio.hrsm.dataAccess.abstracts.JobPositionDao;
import kodlamaio.hrsm.entities.concretes.JobPosition;

@Service
public class JobPositionManager implements JobPositionService{
	
	
	private JobPositionDao jobPositionDao;
	
	
	@Autowired
	public JobPositionManager(JobPositionDao jobPositionDao) {
		super();
		this.jobPositionDao = jobPositionDao;
	}

	@Override
	public void save(JobPosition jobPosition) {
		this.jobPositionDao.save(jobPosition);
		
	}

	@Override
	public List<JobPosition> getAll() {
		return this.jobPositionDao.findAll();
	}

	@Override
	public JobPosition getById(int id) {
		return this.jobPositionDao.findById(id).orElse(null);
	}

}
