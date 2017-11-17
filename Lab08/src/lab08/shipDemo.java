package lab08;

public class shipDemo {

	public static void main(String[] args) {
		CruiseShip cruise1 = new CruiseShip("Titanic", "1942");
		cruise1.setPassengers(526);
		CruiseShip cruise2 = new CruiseShip("Davy Jones", "1569");
		cruise2.setPassengers(394);
		
		CargoShip cargo1 = new CargoShip("Heavy Lifter","1982");
		cargo1.setTonnage(183);
		CargoShip cargo2 = new CargoShip("Heavy Flow","2009");
		cargo2.setTonnage(200);
		
		ship[] ship = new ship[10];
		
		ship[0]=cruise1;
		ship[1]=cruise2;
		ship[2]=cargo1;
		ship[3]=cargo2;
		
		for (int i = 0; i < ship.length; i++) {

			if (ship[i] instanceof CruiseShip)
				System.out.println(((CruiseShip) ship[i]));
			
			else if (ship[i] instanceof CargoShip)
				System.out.println(((CargoShip) ship[i]));
		}
	}

}
