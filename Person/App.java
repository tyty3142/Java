public class App {

	public static void main(String[] args) {
		Student st1 = new Student("John", "Doe", 35);

		Faculty f1 = new Faculty("Bob", "Mart", 44);
		f1.setDegree("Masters");

		Ta t1 = new Ta("Max", "Suit", 24);
		t1.setSkills("Java");

		// Person p1 = new Person("John", "Doe", 35);

		Person[] pList = new Person[10];

		pList[0] = st1;
		pList[1] = f1;
		pList[2] = t1;

		for (int i = 0; i < pList.length; i++) {

			if (pList[i] instanceof Student)
				System.out.println(((Student) pList[i]).fullName());
			
			else if (pList[i] instanceof Faculty)
				System.out.println(((Faculty) pList[i]).getDegree());
			
			else if (pList[i] instanceof Ta)
				System.out.println(((Ta) pList[i]).getSkills());

		}

	}

}
