package stockFB;

public class StockFB {
	// attributes
	private String symbol, name;
	private double openPrice, price;
	private double prevClos;
	private String time, date;
	private static int count;

	// Constructors

	// GETs and SETs
	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getOpenPrice() {
		return openPrice;
	}

	public void setOpenPrice(double openPrice) {
		this.openPrice = openPrice;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getPrevClos() {
		return prevClos;
	}

	public void setPrevClos(double prevClos) {
		this.prevClos = prevClos;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "symbol=" + symbol + ", price=" + price;
	}

	public StockFB(String symbol, double price, String time, String date) {
		super();
		this.symbol = symbol;
		this.price = price;
		this.time = time;
		this.date = date;
	}

	public StockFB() {
		super();
	}

	public static int getCount() {
		return count++;
	}

	// Methods
	public double getVariation() {
		return (this.prevClos - this.price);
	}
}
