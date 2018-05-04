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
@Table(name = "campsmhurtok")
public class CampSMHurtok {
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="campsid")
	private Camps camps;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="samhurtokid")
	private SamHurtokUPU samHurtok;

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

	public SamHurtokUPU getSamHurtok() {
		return samHurtok;
	}

	public void setSamHurtok(SamHurtokUPU samHurtok) {
		this.samHurtok = samHurtok;
	}

	public CampSMHurtok(Long id, Camps camps, SamHurtokUPU samHurtok) {
		this.id = id;
		this.camps = camps;
		this.samHurtok = samHurtok;
	}

	public CampSMHurtok() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
