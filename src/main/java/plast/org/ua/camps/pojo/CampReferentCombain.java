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
@Table(name = "campreferenеtcombain")
public class CampReferentCombain {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="campsid")
	private Camps camps;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="referentsid")
	private CampsReferents referents;

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

	public CampsReferents getReferents() {
		return referents;
	}

	public void setReferents(CampsReferents referents) {
		this.referents = referents;
	}

	public CampReferentCombain(Long id, Camps camps, CampsReferents referents) {
		super();
		this.id = id;
		this.camps = camps;
		this.referents = referents;
	}

	public CampReferentCombain() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
