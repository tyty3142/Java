package Lab02;

public class SalesDemo {

	public static void main(String[] args) {
		SalesTag USB = new SalesTag();
		USB.setName("PNY -Turbo Plus 128GB USB 3.0 Flash Drive -Silver/Black");
		USB.setModel("P-FD128TBOP-GE | Review Rate: 4.7 | Unit Price ($): 29.99");
		USB.setQuantity(3);
		USB.setReview(4.7);
		USB.setPrice(29.99);
		System.out.println("Names: " + USB.getName() + "\n" + "Model" + USB.getModel() + "| Review Rate: "
				+ "| Unit Price ($): " + USB.getPrice() + "\nQuantity: " + USB.getQuantity() + "| Total Price = $"
				+ USB.getTotalPrice());
		System.out.println("");
		SalesTag Headphones = new SalesTag();
		Headphones.setName("Audio Technica ATH-M50X Professional Monitor Headphones");
		Headphones.setModel("ATH-M50X");
		Headphones.setQuantity(4);
		Headphones.setReview(4.1);
		Headphones.setPrice(169.00);
		System.out.println("Names: " + Headphones.getName() + "\n" + "Model: " + Headphones.getModel()
				+ "| Review Rate: " + "| Unit Price ($): " + Headphones.getPrice() + "\nQuantity: "
				+ Headphones.getQuantity() + "| Total Price = $" + Headphones.getTotalPrice());
	}
}
