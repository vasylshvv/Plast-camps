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
@Table(name = "campkurin")
public class CampKurinTb {
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="campsid")
	private Camps camps;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="kurinid")
	private KurinUPU kurinUPU;

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

	public KurinUPU getKurinUPU() {
		return kurinUPU;
	}

	public void setKurinUPU(KurinUPU kurinUPU) {
		this.kurinUPU = kurinUPU;
	}

	public CampKurinTb(Long id, Camps camps, KurinUPU kurinUPU) {
		this.id = id;
		this.camps = camps;
		this.kurinUPU = kurinUPU;
	}

	public CampKurinTb() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
