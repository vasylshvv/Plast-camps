package plast.org.ua.camps.model;

public class CampPosition {
	private Double lat;
	private Double lng;
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
	public CampPosition(Double lat, Double lng) {
		super();
		this.lat = lat;
		this.lng = lng;
	}
	public CampPosition() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
