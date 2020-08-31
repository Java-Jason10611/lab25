import java.util.List;

public class Weather {
	private String location;
	private List<String> tempeture;
	private List<String> text;

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public List<String> getTempeture() {
		return tempeture;
	}

	public void setTempeture(List<String> tempeture) {
		this.tempeture = tempeture;
	}

	public List<String> getText() {
		return text;
	}

	public void setText(List<String> text) {
		this.text = text;
	}

}
