package plast.org.ua.camps.pojo;

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
@Table(name = "campstanytsya")
public class CampStanytsyaTb {
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="campsid")
	private Camps camps;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="stanytsyaid")
	private Stanytsya stanytsya;

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

	public Stanytsya getStanytsya() {
		return stanytsya;
	}

	public void setStanytsya(Stanytsya stanytsya) {
		this.stanytsya = stanytsya;
	}

	public CampStanytsyaTb(Long id, Camps camps, Stanytsya stanytsya) {

		this.id = id;
		this.camps = camps;
		this.stanytsya = stanytsya;
	}

	public CampStanytsyaTb() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
