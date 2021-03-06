package kodlamaio.hrsm.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "employers")
public class Employer implements kodlamaio.hrsm.entities.abstracts.Entity{
	
	
	@Id
	@GeneratedValue
	@Column(name = "id")
	private int id;
	
	@Column(name = "company_name")
	private String companyName;
	
	@Column(name = "web_address")
	private String webAddress;
	
	@Column(name = "phone_number")
	private String phoneNumber;
	
	@Column(name = "is_activited")
	private boolean isActivited;

	public Employer(int id, String companyName, String webAddress, String phoneNumber, boolean isActivited) {
		super();
		this.id = id;
		this.companyName = companyName;
		this.webAddress = webAddress;
		this.phoneNumber = phoneNumber;
		this.isActivited = isActivited;
	}
	
	public Employer() {
		
	}
	

}
