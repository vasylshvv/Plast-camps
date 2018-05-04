package plast.org.ua.camps.pojo;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "campsulad")
public class CampsUlad {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="campsid")
	private Camps camps;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="uladid")
	private Ulad ulad;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Camps getCamps() {
		return camps;
	}

	public void setCamps(Camps camps) {
		this.camps = camps;
	}

	public Ulad getUlad() {
		return ulad;
	}

	public void setUlad(Ulad ulad) {
		this.ulad = ulad;
	}

	public CampsUlad(Long id, Camps camps, Ulad ulad) {
		this.id = id;
		this.camps = camps;
		this.ulad = ulad;
	}

	public CampsUlad(Camps camps, Ulad ulad) {
		this.camps = camps;
		this.ulad = ulad;
	}

	public CampsUlad() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
