package proj01;

public class Publisher {

	private String name;
	private String address;
	private String url;
	private String phone;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Publisher(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}

	public Publisher(String name, String address, String url, String phone) {
		super();
		this.name = name;
		this.address = address;
		this.url = url;
		this.phone = phone;
	}

	public Publisher(Publisher publisher) {
		this.name = publisher.name;
		this.address = publisher.address;
		this.url = publisher.url;
		this.phone = publisher.phone;
	}

	@Override
	public String toString() {
		return "Publisher name: " + name + "\nAddress: " + address + "\nUrl: " + url + "\nPhone: " + phone;
	}

}
