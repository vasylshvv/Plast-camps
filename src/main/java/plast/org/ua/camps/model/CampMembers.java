package plast.org.ua.camps.model;

public class CampMembers {
	private Long id;
	private String name; 
	private String stupin;
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
	public String getStupin() {
		return stupin;
	}
	public void setStupin(String stupin) {
		this.stupin = stupin;
	}
	public CampMembers(Long id, String name, String stupin) {
		super();
		this.id = id;
		this.name = name;
		this.stupin = stupin;
	}
	public CampMembers() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
