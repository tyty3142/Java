package lab11;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Scanner;

public class Lab11 {

	@SuppressWarnings("unchecked")
	public Lab11() {
		

		File file = new File(
				"F:\\Junior Year\\Spring Junior Year 2016\\IST 312 Programming II\\Lab11\\src\\lab11\\dataMar-31-2016.csv");
		Scanner inputFile = null;
		try {
			inputFile = new Scanner(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		ArrayList list1 = new ArrayList();
		
		while(inputFile.hasNext()){
			String str = inputFile.nextLine();
			String columns[] = str.split(",");
			
			Membership member = new Membership(columns[0], columns[1], columns[2], columns[3], columns[4], columns[5]);
			

				list1.add(0, member.getID());
				list1.add(1, member.getName());
				list1.add(2, member.getEmail());
				list1.add(3, member.getPhone());
				list1.add(4, member.getState());
				list1.add(5, member.getCompany());
				
		System.out.println(list1.get(4));

		
		}
		int counter=list1.size();
		System.out.println("There are " + (counter - 506) + " people in the file." );
		inputFile.close();
	}

	public static void main(String[] args) {
		new Lab11();
	}
}
