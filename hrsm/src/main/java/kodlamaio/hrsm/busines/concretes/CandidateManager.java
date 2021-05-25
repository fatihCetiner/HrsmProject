package kodlamaio.hrsm.busines.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrsm.busines.abstracts.CandidateService;
import kodlamaio.hrsm.dataAccess.abstracts.CandidateDao;
import kodlamaio.hrsm.entities.concretes.Candidate;

@Service
public class CandidateManager implements CandidateService{
	
	

	private CandidateDao candidateDao;
	
	@Autowired
	public CandidateManager(CandidateDao candidateDao) {
		super();
		this.candidateDao = candidateDao;
	}
	

	@Override
	public void save(Candidate candidate) {
		this.candidateDao.save(candidate);
		
	}

	@Override
	public List<Candidate> getAll() {
		return this.candidateDao.findAll();
	}

	@Override
	public Candidate getById(int id) {
		return this.candidateDao.findById(id).orElse(null);
	}

}
