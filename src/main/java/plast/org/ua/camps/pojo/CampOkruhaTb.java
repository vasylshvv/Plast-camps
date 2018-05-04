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
@Table(name = "campokruha")
public class CampOkruhaTb {
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="campsid")
	private Camps camps;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="okruhaid")
	private Okruha okruha;

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

	public Okruha getOkruha() {
		return okruha;
	}

	public void setOkruha(Okruha okruha) {
		this.okruha = okruha;
	}

	public CampOkruhaTb(Long id, Camps camps, Okruha okruha) {
		this.id = id;
		this.camps = camps;
		this.okruha = okruha;
	}

	public CampOkruhaTb() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
