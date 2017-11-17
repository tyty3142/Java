package Lab02;

public class SalesTag {
	// Attributes
	private String Name;
	private String Model;
	private int Quantity;
	private double Review;
	private double Price;
	double totalPrice;

	// Constructors

	// GETs and SETs
	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getModel() {
		return Model;
	}

	public void setModel(String model) {
		Model = model;
	}

	public int getQuantity() {
		return Quantity;
	}

	public void setQuantity(int quantity) {
		Quantity = quantity;
	}

	public double getReview() {
		return Review;
	}

	public void setReview(double review) {
		Review = review;
	}

	public double getTotalPrice() {
		return totalPrice = this.Price * this.Quantity;
	}

	public double getPrice() {
		return Price;
	}

	public void setPrice(double price) {
		Price = price;
	}

	// Methods
}
