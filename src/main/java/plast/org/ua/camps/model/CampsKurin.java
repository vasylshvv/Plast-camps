package plast.org.ua.camps.model;

public class CampsKurin {
	private Long id;
	private Integer number;
	private String name;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Integer getNumber() {
		return number;
	}
	public void setNumber(Integer number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public CampsKurin(Long id, Integer number, String name) {
		this.id = id;
		this.number = number;
		this.name = name;
	}
	public CampsKurin() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
