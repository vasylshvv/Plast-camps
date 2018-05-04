package plast.org.ua.camps.model;

public class CampLeaderPut {
	private Long providID;
	 private String education;
	 private Integer countcamp;
	 private Long memberID;
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
	public Long getMemberID() {
		return memberID;
	}
	public void setMemberID(Long memberID) {
		this.memberID = memberID;
	}
	public CampLeaderPut(Long providID, String education, Integer countcamp, Long memberID) {
		this.providID = providID;
		this.education = education;
		this.countcamp = countcamp;
		this.memberID = memberID;
	}
	public CampLeaderPut() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	 
}
