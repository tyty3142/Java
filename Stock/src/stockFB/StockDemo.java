package stockFB;

import edu.siu.isat.MyFunction.calc;

public class StockDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StockFB fb = new StockFB();
		fb.setName("Facebook");
		fb.setSymbol("FB");
		fb.setDate("02/04");
		fb.setTime("1:24PM");
		fb.setOpenPrice(111.80);
		fb.setPrevClos(112.69);
		fb.setPrice(110.04);
		System.out.println(StockFB.getCount());

		StockFB ms = new StockFB("MSFT", 51.58, "02/04", "2:26PM");
		ms.setOpenPrice(52.10);
		ms.setName("Microsoft");
		ms.setPrevClos(52.16);
		System.out.println(StockFB.getCount());

		System.out.println(fb);
		System.out.println("Variation is " + fb.getVariation());

		System.out.println(ms);
		System.out.println("Variation is " + ms.getVariation());
		System.out.println(StockFB.getCount());

		double value = calc.AddNumbers(1.5, 3.6);
		System.out.println(value);
	}
	

}
