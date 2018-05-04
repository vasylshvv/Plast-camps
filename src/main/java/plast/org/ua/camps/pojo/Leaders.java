package plast.org.ua.camps.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Leaders {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	@Column(name = "nameleader")
	private String nameLeader;
	@Column(name = "type")
	private String type;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNameLeader() {
		return nameLeader;
	}
	public void setNameLeader(String nameLeader) {
		this.nameLeader = nameLeader;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Leaders(Long id, String nameLeader, String type) {
		super();
		this.id = id;
		this.nameLeader = nameLeader;
		this.type = type;
	}
	public Leaders() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
