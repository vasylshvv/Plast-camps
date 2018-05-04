package plast.org.ua.camps.model;

public class CampRespAuth {
	private Long campID;
	private String name;
	private String token;
	public Long getCampID() {
		return campID;
	}
	public void setCampID(Long campID) {
		this.campID = campID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public CampRespAuth(Long campID, String name, String token) {
		super();
		this.campID = campID;
		this.name = name;
		this.token = token;
	}
	public CampRespAuth() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
