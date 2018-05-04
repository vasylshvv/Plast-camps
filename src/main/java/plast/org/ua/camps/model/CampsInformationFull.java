package plast.org.ua.camps.model;

import java.util.Date;
import java.util.List;

import plast.org.ua.camps.pojo.CampsLeaders;
import plast.org.ua.camps.pojo.CampsReferents;

public class CampsInformationFull {
	private Long id;
	private String name;
	private List<Long> uladID;
	private Long statusID;
	private Date dateStart;
	private Date dateEnd;
	private String email;
	private String goal;
	private Integer continuity;
	private String place;
	private CampPosition position;// (Координати табору): { lat: '', lng: ''}
	private Integer price;
	private Long gender; 
	private List<Integer> age;
	private Integer countMembers;
	private List<CampRefers> referenturaID;
	private List<CampsKurinUSPUPS> kureniStPl;  
	private List<CampsOkruha> okruhaID; 
	private List<CampsStanytsya> stanytsyaID;
	private List<CampsKurin> kurinID;
	private List<CampsHurtok> hurtokID;
	private List<CampsSamHurtok> samhurtokID;
	private List<CampLeader> provid;
	private String reasonPrice;
	private Boolean share;
	private Boolean eventaftercamp;
	
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

	public List<Long> getUladID() {
		return uladID;
	}

	public void setUladID(List<Long> uladID) {
		this.uladID = uladID;
	}

	public Long getStatusID() {
		return statusID;
	}

	public void setStatusID(Long statusID) {
		this.statusID = statusID;
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

	public CampPosition getPosition() {
		return position;
	}

	public void setPosition(CampPosition position) {
		this.position = position;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public Long getGender() {
		return gender;
	}

	public void setGender(Long gender) {
		this.gender = gender;
	}

	public List<Integer> getAge() {
		return age;
	}

	public void setAge(List<Integer> age) {
		this.age = age;
	}

	public Integer getCountMembers() {
		return countMembers;
	}

	public void setCountMembers(Integer countMembers) {
		this.countMembers = countMembers;
	}

	

	public List<CampRefers> getReferenturaID() {
		return referenturaID;
	}

	public void setReferenturaID(List<CampRefers> referenturaID) {
		this.referenturaID = referenturaID;
	}

	

	public List<CampsKurinUSPUPS> getKureniStPl() {
		return kureniStPl;
	}

	public void setKureniStPl(List<CampsKurinUSPUPS> kureniStPl) {
		this.kureniStPl = kureniStPl;
	}

	public List<CampsOkruha> getOkruhaID() {
		return okruhaID;
	}

	public void setOkruhaID(List<CampsOkruha> okruhaID) {
		this.okruhaID = okruhaID;
	}

	public List<CampsStanytsya> getStanytsyaID() {
		return stanytsyaID;
	}

	public void setStanytsyaID(List<CampsStanytsya> stanytsyaID) {
		this.stanytsyaID = stanytsyaID;
	}

	public List<CampsKurin> getKurinID() {
		return kurinID;
	}

	public void setKurinID(List<CampsKurin> kurinID) {
		this.kurinID = kurinID;
	}

	public List<CampsHurtok> getHurtokID() {
		return hurtokID;
	}

	public void setHurtokID(List<CampsHurtok> hurtokID) {
		this.hurtokID = hurtokID;
	}

	public List<CampsSamHurtok> getSamhurtokID() {
		return samhurtokID;
	}

	public void setSamhurtokID(List<CampsSamHurtok> samhurtokID) {
		this.samhurtokID = samhurtokID;
	}

	public List<CampLeader> getProvid() {
		return provid;
	}

	public void setProvid(List<CampLeader> provid) {
		this.provid = provid;
	}

	public String getReasonPrice() {
		return reasonPrice;
	}

	public void setReasonPrice(String reasonPrice) {
		this.reasonPrice = reasonPrice;
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

	public CampsInformationFull() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	
	public CampsInformationFull(String name, List<Long> uladID, Long statusID, Date dateStart, Date dateEnd,
			String email, String goal, Integer continuity, String place, CampPosition position, Integer price,
			Long gender, List<Integer> age, Integer countMembers, List<CampRefers> referenturaID, List<CampsKurinUSPUPS> kureniStPl,
			List<CampsOkruha> okruhaID, List<CampsStanytsya> stanytsyaID, List<CampsKurin> kurinID,
			List<CampsHurtok> hurtokID, List<CampsSamHurtok> samhurtokID, List<CampLeader> provid, String reasonPrice, Boolean share,
			Boolean eventaftercamp) {
		this.name = name;
		this.uladID = uladID;
		this.statusID = statusID;
		this.dateStart = dateStart;
		this.dateEnd = dateEnd;
		this.email = email;
		this.goal = goal;
		this.continuity = continuity;
		this.place = place;
		this.position = position;
		this.price = price;
		this.gender = gender;
		this.age = age;
		this.countMembers = countMembers;
		this.referenturaID = referenturaID;
		this.kureniStPl = kureniStPl;
		this.okruhaID = okruhaID;
		this.stanytsyaID = stanytsyaID;
		this.kurinID = kurinID;
		this.hurtokID = hurtokID;
		this.samhurtokID = samhurtokID;
		this.provid = provid;
		this.reasonPrice = reasonPrice;
		this.share = share;
		this.eventaftercamp = eventaftercamp;
	}

	public CampsInformationFull(Long id, String name, List<Long> uladID, Long statusID, Date dateStart, Date dateEnd,
			String email, String goal, Integer continuity, String place, CampPosition position, Integer price,
			Long gender, List<Integer> age, Integer countMembers, List<CampRefers> referenturaID, List<CampsKurinUSPUPS> kureniStPl,
			List<CampsOkruha> okruhaID, List<CampsStanytsya> stanytsyaID, List<CampsKurin> kurinID,
			List<CampsHurtok> hurtokID, List<CampsSamHurtok> samhurtokID, List<CampLeader> provid, String reasonPrice, Boolean share,
			Boolean eventaftercamp) {
		this.id = id;
		this.name = name;
		this.uladID = uladID;
		this.statusID = statusID;
		this.dateStart = dateStart;
		this.dateEnd = dateEnd;
		this.email = email;
		this.goal = goal;
		this.continuity = continuity;
		this.place = place;
		this.position = position;
		this.price = price;
		this.gender = gender;
		this.age = age;
		this.countMembers = countMembers;
		this.referenturaID = referenturaID;
		this.kureniStPl = kureniStPl;
		this.okruhaID = okruhaID;
		this.stanytsyaID = stanytsyaID;
		this.kurinID = kurinID;
		this.hurtokID = hurtokID;
		this.samhurtokID = samhurtokID;
		this.provid = provid;
		this.reasonPrice = reasonPrice;
		this.share = share;
		this.eventaftercamp = eventaftercamp;
	}

	
	
}
