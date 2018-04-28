import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Person {

	private static List<Person1> namelist = new ArrayList<Person1>();

	//private static Person1 p1,p2;
	
	
	private static String namesearch(String name) {
		String x = " ";
		 for(Person1 p:namelist) {
		    	if (p.getName().equalsIgnoreCase(name)){
		    		System.out.println(p.toString());
		    	
		    }
		    
			
	}
		 return x;
	}
	
	
		public static void main(String[]args) {


			Person1 p1= new Person1("arun",21,"ceo");
			Person1 p2 = new Person1("me",34,"dj");
			//person.toString();
			//person1.toString();
			
			namelist.add(p1);
			namelist.add(p2);

			System.out.println("Enter name:");
			Scanner query = new Scanner(System.in);
			
			namesearch( query.nextLine());
			query.close();
		   
		    
		}
}










