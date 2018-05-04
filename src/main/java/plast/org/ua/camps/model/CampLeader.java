package plast.org.ua.camps.model;

public class CampLeader {
	 
	 private Long providID;
	 private String education;
	 private Integer countcamp;
	 private CampMembers members;
	
	public Long getProvidID() {
		return providID;
	}
	public void setProvidID(Long providID) {
		this.providID = providID;
	}
	public String getEducation() {
		return education;
	}
	public void setEducation(String education) {
		this.education = education;
	}
	public Integer getCountcamp() {
		return countcamp;
	}
	public void setCountcamp(Integer countcamp) {
		this.countcamp = countcamp;
	}
	
	
	
	
	public CampMembers getMembers() {
		return members;
	}
	public void setMembers(CampMembers members) {
		this.members = members;
	}
	
	public CampLeader(Long providID, String education, Integer countcamp, CampMembers members) {
		super();
		this.providID = providID;
		this.education = education;
		this.countcamp = countcamp;
		this.members = members;
	}
	public CampLeader() {
		super();
		// TODO Auto-generated constructor stub
	}
	 
}
