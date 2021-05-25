package kodlamaio.hrsm.busines.abstracts;

import java.util.List;

import kodlamaio.hrsm.entities.concretes.Candidate;

public interface CandidateService {
	
	void save(Candidate candidate);
	List<Candidate> getAll();
	Candidate getById(int id);

}
