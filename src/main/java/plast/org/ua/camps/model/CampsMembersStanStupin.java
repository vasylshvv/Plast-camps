package plast.org.ua.camps.model;

import java.util.Date;
import java.util.List;

public class CampsMembersStanStupin {
	private String stupin;
	private String name;
	private Date birthday;
	private String stanytsya;
	private String email;
	private String phone;
	public String getStupin() {
		return stupin;
	}
	public void setStupin(String stupin) {
		this.stupin = stupin;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public String getStanytsya() {
		return stanytsya;
	}
	public void setStanytsya(String stanytsya) {
		this.stanytsya = stanytsya;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public CampsMembersStanStupin(String stupin, String name, Date birthday, String stanytsya, String email,
			String phone) {
		this.stupin = stupin;
		this.name = name;
		this.birthday = birthday;
		this.stanytsya = stanytsya;
		this.email = email;
		this.phone = phone;
	}
	public CampsMembersStanStupin() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
