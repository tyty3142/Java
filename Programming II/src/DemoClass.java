public class DemoClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RectangleClass box = new RectangleClass();
		box.setLength(10.0);
		box.setWidth(5.0);
		System.out.println(box.getArea());

		RectangleClass Kitchen = new RectangleClass();
		Kitchen.setLength(11.0);
		Kitchen.setWidth(10.0);
		System.out.println(Kitchen.getArea());

		RectangleClass Bedroom = new RectangleClass();
		Bedroom.setLength(12.0);
		Bedroom.setWidth(12.0);
		System.out.println(box.getArea());

		RectangleClass DenOffice = new RectangleClass();
		DenOffice.setLength(8.0);
		DenOffice.setWidth(9.0);
		System.out.println(DenOffice.getArea());
	}

}
