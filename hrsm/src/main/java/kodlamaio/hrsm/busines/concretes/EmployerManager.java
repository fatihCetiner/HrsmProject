package kodlamaio.hrsm.busines.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrsm.busines.abstracts.EmployerService;
import kodlamaio.hrsm.dataAccess.abstracts.EmployerDao;
import kodlamaio.hrsm.entities.concretes.Employer;

@Service
public class EmployerManager implements EmployerService {
	
	private EmployerDao employerDao;
	
	
	@Autowired
	public EmployerManager(EmployerDao employerDao) {
		super();
		this.employerDao = employerDao;
	}

	@Override
	public void save(Employer employer) {
		this.employerDao.save(employer);
		
	}

	@Override
	public List<Employer> getAll() {
		return this.employerDao.findAll();
	}

	@Override
	public Employer getById(int id) {
		return this.employerDao.findById(id).orElse(null);
	}

}
