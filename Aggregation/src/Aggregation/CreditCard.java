package Aggregation;

public class CreditCard {
	private Money balance;
	private Money limit;
	private Person owner;

	public CreditCard(Person owner, Money limit) {
		this.balance = new Money(0);
		this.limit = limit;
		this.owner = owner;
	}

	// end of constructor
	public Money getBalance() {
		return this.balance;
	}

	public Money getLimit() {
		return this.limit;
	}
	public Person getOwner(){
		return this.owner;
	}
	public void charge(Money amount){
		Money after = new Money(this.balance);
		after.add(amount);
		
		if(after.compareTo(this.limit)==-1){
			this.balance.add(amount);
		}
		else {
			System.out.println("This charge exceeds the"
					+ " limit");
		}
	}
	public void payment(Money amount){
		this.balance.subtract(amount);
	}
}