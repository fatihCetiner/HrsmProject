package kodlamaio.hrsm.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrsm.entities.concretes.Employer;

public interface EmployerDao extends JpaRepository<Employer, Integer> {

}
