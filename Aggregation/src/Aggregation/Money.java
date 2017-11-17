package Aggregation;

import java.text.DecimalFormat;

public class Money {

	private long dollars;
	private long cents;

	public Money(double amount) {
		if (amount < 0) {
			System.out.println("Negative amount is not "
					+ "allowed");
			System.exit(0);
		}
		DecimalFormat df = new DecimalFormat("0.00");
		String num = df.format(amount);
		int pos = num.indexOf(".");
		String d = num.substring(0, pos);
		String c = num.substring(pos + 1);
		this.dollars = Long.parseLong(d);
		this.cents = Long.parseLong(c);
	}

	public Money(Money object1) {
		this.dollars = object1.dollars;
		this.cents = object1.cents;
	}

	// end of copy constructor
	public Money add(Money amount) {
		long c = this.cents + amount.cents;
		long r = c % 100;
		this.cents = r;
		long d = this.dollars + amount.dollars;
		if (c > 100) {
			d++;
		}
		this.dollars = d;
		return new Money(this);
	}

	public Money subtract(Money amount) {
		if (this.cents < amount.cents) {
			this.dollars--;
		}
		long d = this.dollars - amount.dollars;
		this.dollars = d;
		long c = (this.cents + 100) - amount.cents;
		this.cents = c;
		return new Money(this);
	}

	// end of method subtract
	public String toString() {
		return "$" + this.dollars + "." + this.cents 
				+ " (" + this.dollars + " dollars and "
				+ this.cents + " cents)";
	}

	public int compareTo(Money object1) {
		if (this.dollars < object1.dollars) {
			return -1;
		} else if (this.dollars > object1.dollars) {
			return 1;
		} else if (this.cents < object1.cents) {
			return -1;
		} else if (this.cents > object1.cents) {
			return 1;
		} else {
			return 0;
		}
	}
}