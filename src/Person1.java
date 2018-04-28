
public class Person1 {
	private String name;
	private int age;
	private String jobTitle;

	public Person1(String name,int age, String jobTitle) {
		this.name = name;
		this.age = age;
		this.jobTitle = jobTitle;

		System.out.println(this);
	}
	
		public String toString() {
			return "Name: " + name + " Age: " + age + " job: " + jobTitle;
			
		}
		
		public String getName() {
			return name;
		}
		
		public int getAge() {
			return age;
		}

		public String getJobTitle() {
			return jobTitle;
		}
		
			
		
}
