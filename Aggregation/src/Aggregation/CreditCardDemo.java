package Aggregation;

public class CreditCardDemo {
	public static void main(String[] args) {
		Address adr = new Address("237J Harvey Hall", "Menomonie", "WI", "54751");
		Person owner = new Person("Christie", "Diane", adr);
		Money limit = new Money(1000);
		CreditCard visa = new CreditCard(owner, limit);
		
		System.out.println(visa.getOwner());
		System.out.println("Balance: " + visa.getBalance());
		System.out.println("Credit Limit: " + visa.getLimit());
		System.out.println();
		
		Money firstCharge = new Money(200);
		System.out.println("Attempt to charge " + firstCharge);
		visa.charge(firstCharge);
		System.out.println("Balance: " + visa.getBalance());
		System.out.println();

		Money secondCharge = new Money(10.02);
		System.out.println("Attempt to charge " + secondCharge);
		visa.charge(secondCharge);
		System.out.println("Balance: " + visa.getBalance());
		System.out.println();
		
		Money firstPayment = new Money(25);
		System.out.println("Attempt to pay " + firstPayment);
		visa.payment(firstPayment);
		System.out.println("Balance: " + visa.getBalance());
		System.out.println();
		
		Money thirdCharge = new Money(990);
		System.out.println("Attempt to charge " + thirdCharge);
		visa.charge(thirdCharge);
		System.out.println("Balance: " + visa.getBalance());
		System.out.println();
	}
}
