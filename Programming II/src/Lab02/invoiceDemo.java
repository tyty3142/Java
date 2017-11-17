package Lab02;

public class invoiceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double total;
		invoice Accomodation = new invoice();
		Accomodation.setDescription("Accomodation");
		Accomodation.setQuality(1);
		Accomodation.setPrice(135.50);
		System.out.println("\t     INVOICE");
		System.out.println("");
		System.out.println("Description" + "\tQty" + "\tPrice");
		System.out.println("----------------------------------");
		System.out.println(Accomodation.getDescription() + "\t" + Accomodation.getQuality() + (" night") + ("\t") + ("")
				+ Accomodation.getPrice());
		total = Accomodation.getPrice();
		invoice internet = new invoice();
		internet.setDescription("Internet");
		internet.setQuality(2);
		internet.setPrice(20.00);
		System.out.println(internet.getDescription() + "\t" + internet.getQuality() + (" days") + ("\t") + ("")
				+ internet.getPrice());
		total = total + internet.getPrice();
		invoice food = new invoice();
		food.setDescription("Food");
		food.setQuality(1);
		food.setPrice(22.50);
		System.out.println(
				food.getDescription() + "\t\t" + food.getQuality() + (" small") + ("\t") + ("") + food.getPrice());
		total = total + food.getPrice();
		System.out.println("----------------------------------");
		System.out.println("\t    TOTAL: $" + total + "\n"
				+ ("\tTax (10%): $" + (total/10)));
	}
	// have the total add each other.

}
