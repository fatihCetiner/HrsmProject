package kodlamaio.hrsm.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "job_position")
public class JobPosition implements kodlamaio.hrsm.entities.abstracts.Entity {
	
	@Id
	@GeneratedValue
	@Column(name = "id")
	private int id;
	

	@Column(name = "position")
	private String position;
	
	@Column(name = "position_detail")
	private String positionDetail;
	
	public JobPosition(int id, String position, String positionDetail) {
		super();
		this.id = id;
		this.position = position;
		this.positionDetail = positionDetail;
	}
	
	public JobPosition() {
		
	}

}
