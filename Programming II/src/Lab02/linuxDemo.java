package Lab02;

public class linuxDemo {

	public static void main(String[] args) {
		linuxDistro Ubuntu = new linuxDistro();
		Ubuntu.setDeveloper("Canonical");
		Ubuntu.setYear_of_initial_release(2004);
		Ubuntu.setName("Ubuntu");
		System.out.println("- Name: " + Ubuntu.getName() + "\n- Developer: " + Ubuntu.getDeveloper()
				+ "\n- Year of Initial Release: " + "(" + Ubuntu.getDistroAge() + " Years ago)");
		
		System.out.println("");
		linuxDistro Red = new linuxDistro();
		Red.setDeveloper("Red Hat");
		Red.setYear_of_initial_release(1995);
		Red.setName("Red Hat Linux");
		System.out.println("- Name: " + Red.getName() + "\n- Developer: " + Red.getDeveloper()
				+ "\n- Year of Initial Release: " + "(" + Red.getDistroAge() + " Years ago)");
		System.out.println("");
		linuxDistro Debian = new linuxDistro();
		Debian.setDeveloper("Debian Project");
		Debian.setYear_of_initial_release(1993);
		Debian.setName("Debian");
		System.out.println("- Name: " + Debian.getName() + "\n- Developer: " + Debian.getDeveloper()
				+ "\n- Year of Initial Release: " + "(" + Debian.getDistroAge() + " Years ago)");
	}

}
