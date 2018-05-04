package plast.org.ua.camps.model;

import java.util.Date;
import java.util.List;

public class CampsFullInfoMember {
	private String stupin;
	private String name;
	private String kurin;
	private Date birthday;
	private String stanytsya;
	private String kvstupin;
	private List<CampQualificationMember> qualification;//: (КВ-1, КВ-2),
	private String vyshkolycamp; //: ЛШ/ШБ,
	private String email;//: '',
	private String phone;//
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
	public String getKurin() {
		return kurin;
	}
	public void setKurin(String kurin) {
		this.kurin = kurin;
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

	public List<CampQualificationMember> getQualification() {
		return qualification;
	}
	public void setQualification(List<CampQualificationMember> qualification) {
		this.qualification = qualification;
	}
	public String getVyshkolycamp() {
		return vyshkolycamp;
	}
	public void setVyshkolycamp(String vyshkolycamp) {
		this.vyshkolycamp = vyshkolycamp;
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
	
	public String getKvstupin() {
		return kvstupin;
	}
	public void setKvstupin(String kvstupin) {
		this.kvstupin = kvstupin;
	}
	public CampsFullInfoMember(String stupin, String name, String kurin, Date birthday, String stanytsya,
			String kvstupin, List<CampQualificationMember> qualification, String vyshkolycamp, String email,
			String phone) {
		this.stupin = stupin;
		this.name = name;
		this.kurin = kurin;
		this.birthday = birthday;
		this.stanytsya = stanytsya;
		this.kvstupin = kvstupin;
		this.qualification = qualification;
		this.vyshkolycamp = vyshkolycamp;
		this.email = email;
		this.phone = phone;
	}
	public CampsFullInfoMember() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}
