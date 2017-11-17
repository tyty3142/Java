package BookeditingSolution;

/**
 * 
 * @author Andrey
 *
 */
public class Publisher {

	/*
	 * ATTRIBUTES
	 */
	private String name;
	private String address;
	private String url;
	private String phone;

	/*
	 * NO ARG CONSTRUCTOR
	 */
	public Publisher() {
	}

	/*
	 * ARG CONSTRUCTOR
	 */
	public Publisher(String name, String phone) {
		this.name = name;
		this.phone = phone;
	}

	/*
	 * COPY CONSTRUCTOR
	 */
	public Publisher(Publisher object) {
		this.name = object.name;
		this.address = object.address;
		this.url = object.url;
		this.phone = object.phone;
	}

	/*
	 * GETs and SETs
	 */
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

	/*
	 * TO STRING
	 */
	@Override
	public String toString() {
		return "\nPublisher [name=" + name + ", address=" + address + ", url=" + url + ", phone=" + phone + "]";
	}

}// end of class
