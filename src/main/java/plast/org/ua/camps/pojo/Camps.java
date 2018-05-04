package plast.org.ua.camps.pojo;

import java.util.Date;
import java.util.Map;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
@Table(name = "camps")
public class Camps {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	
	@Column(name = "namecamp")
	private String name;
	
	@Temporal(value = TemporalType.DATE)
	@Column(name="datestart")
	private Date dateStart;
	
	@Temporal(value = TemporalType.DATE)
	@Column(name="dateend")
	private Date dateEnd;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "password")
	private String password;
//	
//	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
//	@JoinColumn(name = "uladid")
//	private Ulad uladID;
	
	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "campstatusid")
	private CampStatus statusID;

	@Column(name ="goal", length = 1000)
	private String goal; 
	
	@Column(name = "continuity")
	private Integer continuity;
	
	@Column(name = "place")
	private String place;
	
	//private Map<String, String> position; //{ lat: '', lng: ''} 
	

	
	@Column(name = "price", length = 10)
	private Integer price;
	
	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "genderid")
	private CampGender genderid; 
	
	@Column(name = "fromage")
	private Integer fromAge;// [10, 40] Number
	
	@Column(name = "toage")
	private Integer toAge;// [10, 40] Number
	
	@Column(name = "countmembers")
	private Integer countMembers;//(Кількість учасників): 10
	
	@Column(name = "reasonprice")
	private String reasonPrice; 
	
	@Column(name = "share")
	private Boolean share;
	
	@Column(name = "eventaftercamp")
	private Boolean eventaftercamp;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}



	public Date getDateStart() {
		return dateStart;
	}

	public void setDateStart(Date dateStart) {
		this.dateStart = dateStart;
	}

	public Date getDateEnd() {
		return dateEnd;
	}

	public void setDateEnd(Date dateEnd) {
		this.dateEnd = dateEnd;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	

//	public Ulad getUladID() {
//		return uladID;
//	}
//
//	public void setUladID(Ulad uladID) {
//		this.uladID = uladID;
//	}


	

	public Camps(Long id, String nameCamp, Date dateStart, Date dateEnd, String email, String password, /*Ulad uladID,*/
			CampStatus statusCampID) {
		this.id = id;
		this.name = nameCamp;
		this.dateStart = dateStart;
		this.dateEnd = dateEnd;
		this.email = email;
		this.password = password;
		//this.uladID = uladID;
		this.statusID = statusCampID;
	}

	public String getReasonPrice() {
		return reasonPrice;
	}

	public void setReasonPrice(String reasonPrice) {
		this.reasonPrice = reasonPrice;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public CampStatus getStatusID() {
		return statusID;
	}

	public void setStatusID(CampStatus statusID) {
		this.statusID = statusID;
	}

	public String getGoal() {
		return goal;
	}

	public void setGoal(String goal) {
		this.goal = goal;
	}

	public Integer getContinuity() {
		return continuity;
	}

	public void setContinuity(Integer continuity) {
		this.continuity = continuity;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	

	public CampGender getGenderid() {
		return genderid;
	}

	public void setGenderid(CampGender genderid) {
		this.genderid = genderid;
	}

	public Integer getCountMembers() {
		return countMembers;
	}

	public void setCountMembers(Integer countMembers) {
		this.countMembers = countMembers;
	}

	public Camps() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Camps(String nameCamp, Date dateStart, Date dateEnd, String email, String password, /*Ulad uladID,*/
			CampStatus statusCampID) {
		this.name = nameCamp;
		this.dateStart = dateStart;
		this.dateEnd = dateEnd;
		this.email = email;
		this.password = password;
		//this.uladID = uladID;
		this.statusID = statusCampID;
	}

	public Camps(Long id, String name) {
		this.id = id;
		this.name = name;
	}

	

	

	public Integer getFromAge() {
		return fromAge;
	}

	public void setFromAge(Integer fromAge) {
		this.fromAge = fromAge;
	}

	public Integer getToAge() {
		return toAge;
	}

	public void setToAge(Integer toAge) {
		this.toAge = toAge;
	}

	
	public Boolean getShare() {
		return share;
	}

	public void setShare(Boolean share) {
		this.share = share;
	}

	public Boolean getEventaftercamp() {
		return eventaftercamp;
	}

	public void setEventaftercamp(Boolean eventaftercamp) {
		this.eventaftercamp = eventaftercamp;
	}

	public Camps(Long id, String name, Date dateStart, Date dateEnd, String email, String password, CampStatus statusID,
			String goal, Integer continuity, String place, Integer price, CampGender genderid,
			Integer fromAge, Integer toAge, Integer countMembers, String reasonPrice, Boolean share, Boolean eventaftercamp) {
		this.id = id;
		this.name = name;
		this.dateStart = dateStart;
		this.dateEnd = dateEnd;
		this.email = email;
		this.password = password;
		this.statusID = statusID;
		this.goal = goal;
		this.continuity = continuity;
		this.place = place;
		this.price = price;
		this.genderid = genderid;
		this.fromAge = fromAge;
		this.toAge = toAge;
		this.countMembers = countMembers;
		this.reasonPrice = reasonPrice;
		this.share = share;
		this.eventaftercamp = eventaftercamp;
	}

	
	
	
}

