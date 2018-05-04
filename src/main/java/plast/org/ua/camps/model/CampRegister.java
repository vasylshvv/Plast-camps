package plast.org.ua.camps.model;

import java.util.Date;
import java.util.List;

public class CampRegister {
	private Long id;
	private String name;
	private Date dateStart;
	private Date dateEnd;
	private String email;
	private String password;
	private List<Long> uladID;
	//private CampStatus statusID;
	private Long statusID;
	
	private String token;
	
	


	public String getToken() {
		return token;
	}


	public void setToken(String token) {
		this.token = token;
	}


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


	

	


//	public CampStatus getStatusID() {
//		return statusID;
//	}
//
//
//	public void setStatusID(CampStatus statusID) {
//		this.statusID = statusID;
//	}


	public List<Long> getUladID() {
		return uladID;
	}


	public void setUladID(List<Long> uladID) {
		this.uladID = uladID;
	}


	public CampRegister() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Long getStatusID() {
		return statusID;
	}


	public void setStatusID(Long statusID) {
		this.statusID = statusID;
	}


	public CampRegister(Long id, String name, Date dateStart, Date dateEnd, String email, String password,
			List<Long> uladID, /*CampStatus*/ Long statusID, String token) {
		this.id = id;
		this.name = name;
		this.dateStart = dateStart;
		this.dateEnd = dateEnd;
		this.email = email;
		this.password = password;
		this.uladID = uladID;
		this.statusID = statusID;
		this.token = token;
	}


	public CampRegister(String name, Date dateStart, Date dateEnd, String email, String password, List<Long> uladID,
			/*CampStatus*/Long statusID) {
		this.name = name;
		this.dateStart = dateStart;
		this.dateEnd = dateEnd;
		this.email = email;
		this.password = password;
		this.uladID = uladID;
		this.statusID = statusID;
		
	}


	
	
}
