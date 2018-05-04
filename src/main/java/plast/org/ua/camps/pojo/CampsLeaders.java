package plast.org.ua.camps.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name = "campsleaders")
public class CampsLeaders {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="campsid")
	private Camps camps;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="leadersid")
	private Leaders leaders;
	
	
	@Column(name="countcamp")
	private Integer countсamp;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="personsid")
	private Persons persons;
	
	
	@Column(name="educationdoc")
	private String education;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Camps getCamps() {
		return camps;
	}

	public void setCamps(Camps camps) {
		this.camps = camps;
	}

	public Leaders getLeaders() {
		return leaders;
	}

	public void setLeaders(Leaders leaders) {
		this.leaders = leaders;
	}

	

	public Integer getCountсamp() {
		return countсamp;
	}

	public void setCountсamp(Integer countсamp) {
		this.countсamp = countсamp;
	}

	public Persons getPersons() {
		return persons;
	}

	public void setPersons(Persons persons) {
		this.persons = persons;
	}

	public String getEducation() {
		return education;
	}

	public void setEducation(String education) {
		this.education = education;
	}

	public CampsLeaders(Long id, Camps camps, Leaders leaders, Integer countсamp, Persons persons, String education) {
		this.id = id;
		this.camps = camps;
		this.leaders = leaders;
		this.countсamp = countсamp;
		this.persons = persons;
		this.education = education;
	}

	public CampsLeaders() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
