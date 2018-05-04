package plast.org.ua.camps.controller;

import java.util.Date;
import java.util.List;

import org.springframework.expression.spel.ast.BooleanLiteral;

import plast.org.ua.camps.model.CampLeader;
import plast.org.ua.camps.model.CampLeaderPut;
import plast.org.ua.camps.model.CampPosition;
import plast.org.ua.camps.model.CampsHurtok;
import plast.org.ua.camps.model.CampsKurin;
import plast.org.ua.camps.model.CampsOkruha;
import plast.org.ua.camps.model.CampsSamHurtok;
import plast.org.ua.camps.model.CampsStanytsya;

public class CampsInfoFull {
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
	private List<Long> referenturaID;
	private List<Long> kureniStPl;  
	private List<Long> okruhaID; 
	private List<Long> stanytsyaID;
	private List<Long> kurinID;
	private List<Long> hurtokID;
	private List<Long> samhurtokID;
	private List<CampLeaderPut> provid;
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
	public List<Long> getReferenturaID() {
		return referenturaID;
	}
	public void setReferenturaID(List<Long> referenturaID) {
		this.referenturaID = referenturaID;
	}
	public List<Long> getKureniStPl() {
		return kureniStPl;
	}
	public void setKureniStPl(List<Long> kureniStPl) {
		this.kureniStPl = kureniStPl;
	}
	public List<Long> getOkruhaID() {
		return okruhaID;
	}
	public void setOkruhaID(List<Long> okruhaID) {
		this.okruhaID = okruhaID;
	}
	public List<Long> getStanytsyaID() {
		return stanytsyaID;
	}
	public void setStanytsyaID(List<Long> stanytsyaID) {
		this.stanytsyaID = stanytsyaID;
	}
	public List<Long> getKurinID() {
		return kurinID;
	}
	public void setKurinID(List<Long> kurinID) {
		this.kurinID = kurinID;
	}
	public List<Long> getHurtokID() {
		return hurtokID;
	}
	public void setHurtokID(List<Long> hurtokID) {
		this.hurtokID = hurtokID;
	}
	public List<Long> getSamhurtokID() {
		return samhurtokID;
	}
	public void setSamhurtokID(List<Long> samhurtokID) {
		this.samhurtokID = samhurtokID;
	}
	
	public List<CampLeaderPut> getProvid() {
		return provid;
	}
	public void setProvid(List<CampLeaderPut> provid) {
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
	public CampsInfoFull() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CampsInfoFull(Long id, String name, List<Long> uladID, Long statusID, Date dateStart, Date dateEnd,
			String email, String goal, Integer continuity, String place, CampPosition position, Integer price,
			Long gender, List<Integer> age, Integer countMembers, List<Long> referenturaID, List<Long> kureniStPl,
			List<Long> okruhaID, List<Long> stanytsyaID, List<Long> kurinID, List<Long> hurtokID,
			List<Long> samhurtokID, List<CampLeaderPut> provid, String reasonPrice, Boolean share, Boolean eventaftercamp) {
		super();
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
	public CampsInfoFull(String name, List<Long> uladID, Long statusID, Date dateStart, Date dateEnd, String email,
			String goal, Integer continuity, String place, CampPosition position, Integer price, Long gender,
			List<Integer> age, Integer countMembers, List<Long> referenturaID, List<Long> kureniStPl,
			List<Long> okruhaID, List<Long> stanytsyaID, List<Long> kurinID, List<Long> hurtokID,
			List<Long> samhurtokID, List<CampLeaderPut> provid, String reasonPrice, Boolean share, Boolean eventaftercamp) {
		super();
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
		this.reasonPrice = reasonPrice;
		this.samhurtokID = samhurtokID;
		this.provid = provid;
		this.share = share;
		this.eventaftercamp = eventaftercamp;
	}
	
}
