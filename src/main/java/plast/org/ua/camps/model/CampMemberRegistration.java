package plast.org.ua.camps.model;

import java.util.Date;
import java.util.List;

public class CampMemberRegistration {
	private Long id;
	private String address;
	private Date birthday;
	private Date dataSword;
	private Date dataVstup;
	private String email;
	private String firstName;
	private String lastName;
	private Long kurinUSPID;
	private String phone;
	private Long stanytsyaID;
	private Long stupinID;
	private Long stupinKV;
	private Long uladId;
	private List<Long> vyshkil;
	private Long vyshkilCamp;
	private String work;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public Date getDataSword() {
		return dataSword;
	}
	public void setDataSword(Date dataSword) {
		this.dataSword = dataSword;
	}
	public Date getDataVstup() {
		return dataVstup;
	}
	public void setDataVstup(Date dataVstup) {
		this.dataVstup = dataVstup;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Long getKurinUSPID() {
		return kurinUSPID;
	}
	public void setKurinUSPID(Long kurinUSPID) {
		this.kurinUSPID = kurinUSPID;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Long getStanytsyaID() {
		return stanytsyaID;
	}
	public void setStanytsyaID(Long stanytsyaID) {
		this.stanytsyaID = stanytsyaID;
	}
	public Long getStupinID() {
		return stupinID;
	}
	public void setStupinID(Long stupinID) {
		this.stupinID = stupinID;
	}
	public Long getStupinKV() {
		return stupinKV;
	}
	public void setStupinKV(Long stupinKV) {
		this.stupinKV = stupinKV;
	}
	public Long getUladId() {
		return uladId;
	}
	public void setUladId(Long uladId) {
		this.uladId = uladId;
	}
	public List<Long> getVyshkil() {
		return vyshkil;
	}
	public void setVyshkil(List<Long> vyshkil) {
		this.vyshkil = vyshkil;
	}
	public Long getVyshkilCamp() {
		return vyshkilCamp;
	}
	public void setVyshkilCamp(Long vyshkilCamp) {
		this.vyshkilCamp = vyshkilCamp;
	}
	public String getWork() {
		return work;
	}
	public void setWork(String work) {
		this.work = work;
	}
	public CampMemberRegistration(Long id, String address, Date birthday, Date dataSword, Date dataVstup, String email,
			String firstName, String lastName, Long kurinUSPID, String phone, Long stanytsyaID, Long stupinID,
			Long stupinKV, Long uladId, List<Long> vyshkil, Long vyshkilCamp, String work) {
		this.id = id;
		this.address = address;
		this.birthday = birthday;
		this.dataSword = dataSword;
		this.dataVstup = dataVstup;
		this.email = email;
		this.firstName = firstName;
		this.lastName = lastName;
		this.kurinUSPID = kurinUSPID;
		this.phone = phone;
		this.stanytsyaID = stanytsyaID;
		this.stupinID = stupinID;
		this.stupinKV = stupinKV;
		this.uladId = uladId;
		this.vyshkil = vyshkil;
		this.vyshkilCamp = vyshkilCamp;
		this.work = work;
	}
	public CampMemberRegistration(String address, Date birthday, Date dataSword, Date dataVstup, String email,
			String firstName, String lastName, Long kurinUSPID, String phone, Long stanytsyaID, Long stupinID,
			Long stupinKV, Long uladId, List<Long> vyshkil, Long vyshkilCamp, String work) {
		this.address = address;
		this.birthday = birthday;
		this.dataSword = dataSword;
		this.dataVstup = dataVstup;
		this.email = email;
		this.firstName = firstName;
		this.lastName = lastName;
		this.kurinUSPID = kurinUSPID;
		this.phone = phone;
		this.stanytsyaID = stanytsyaID;
		this.stupinID = stupinID;
		this.stupinKV = stupinKV;
		this.uladId = uladId;
		this.vyshkil = vyshkil;
		this.vyshkilCamp = vyshkilCamp;
		this.work = work;
	}
	public CampMemberRegistration() {
		super();
		// TODO Auto-generated constructor stub
	}

}
