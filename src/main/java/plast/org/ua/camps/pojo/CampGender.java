package plast.org.ua.camps.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "gender")
public class CampGender {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	
	@Column(name="namegender")
	private String nameGender;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNameGender() {
		return nameGender;
	}

	public void setNameGender(String nameGender) {
		this.nameGender = nameGender;
	}

	public CampGender(Long id, String nameGender) {
		super();
		this.id = id;
		this.nameGender = nameGender;
	}

	public CampGender() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
