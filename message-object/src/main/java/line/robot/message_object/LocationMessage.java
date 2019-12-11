package line.robot.message_object;

public class LocationMessage extends BaseMessage{
	private String title;
	private String address;
	private double latitude;
	private double longitude;
	
	public LocationMessage(String title, String address, double latitude, double longitude) {
		super("location");
		this.title = title;
		this.address = address;
		this.latitude = latitude;
		this.longitude = longitude;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	@Override
	public String toString() {
		return "{\"title\":\"" + title + "\", \"address\":\"" + address + "\", \"latitude\":\"" + latitude + "\", \"longitude\":\""
				+ longitude + "\", \"type\":\"location\"}";
	}
	
	
}
