package plast.org.ua.camps.model;

public class CampsAuthorization {
	private Long campID;
	private String email;
	private String password;
	
	public Long getCampID() {
		return campID;
	}
	public void setCampID(Long campID) {
		this.campID = campID;
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
	
	
	
	public CampsAuthorization(Long campID, String email, String password) {
		super();
		this.campID = campID;
		this.email = email;
		this.password = password;
	}
	public CampsAuthorization() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
