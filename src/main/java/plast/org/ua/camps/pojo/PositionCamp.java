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
@Table(name="positioncmap")
public class PositionCamp {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	@Column(name="lat")
	private Double lat;
	@Column(name = "lng")
	private Double lng;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "campsid")
	private Camps camps;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Double getLat() {
		return lat;
	}
	public void setLat(Double lat) {
		this.lat = lat;
	}
	public Double getLng() {
		return lng;
	}
	public void setLng(Double lng) {
		this.lng = lng;
	}
	
	public Camps getCamps() {
		return camps;
	}
	public void setCamps(Camps camps) {
		this.camps = camps;
	}
	
	public PositionCamp(Long id, Double lat, Double lng, Camps camps) {
		super();
		this.id = id;
		this.lat = lat;
		this.lng = lng;
		this.camps = camps;
	}
	public PositionCamp() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
