package kodlamaio.hrsm.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrsm.busines.abstracts.JobPositionService;
import kodlamaio.hrsm.entities.concretes.JobPosition;

@RestController
@RequestMapping("/api/jop_position")
public class JobPositionController {
	
	private JobPositionService jobPositionService;

	
	@Autowired
	public JobPositionController(JobPositionService jobPositionService) {
		super();
		this.jobPositionService = jobPositionService;
	}
	
	@GetMapping("/getall")
	public List<JobPosition> getAll(){
		return this.jobPositionService.getAll();
	}
	
	@GetMapping("/getbyid/{id}")
	public JobPosition getById(int id) {
		return this.jobPositionService.getById(id);
	}
	
	

}
