package plast.org.ua.camps.model;

public class CampRefers {
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
	public CampRefers(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public CampRefers() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
