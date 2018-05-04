package plast.org.ua.camps.model;

public class CampsSamHurtok {
	private Long id;
	private String name;
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
	public CampsSamHurtok(Long id, String name) {
		this.id = id;
		this.name = name;
	}
	public CampsSamHurtok() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
