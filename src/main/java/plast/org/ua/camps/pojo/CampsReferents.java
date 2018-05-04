package plast.org.ua.camps.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "campsreferents")
public class CampsReferents {
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	@Column(name = "nameref")
	private String name;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public CampsReferents(Long id, String name) {
		this.id = id;
		this.name = name;
	}
	public CampsReferents() {
		super();
		// TODO Auto-generated constructor stub
	}
		
}
