
public class Javacodebasics {

	public static void main(String[] args) {
		System.out.println("Hello Intro");
		
		Student edwin = new Student();
		edwin.firstName = "Edwin";
		edwin.lastName = "Ubuane";
		edwin.age = 34;
		System.out.println("Full Name = "+edwin.getFullName());
	}

	static class Student {
       String firstName;
       String lastName;
       int age;
     
       public String getfirstName() {
    	   return firstName;
       }
       
       public void setfirstName(String fName) {
    	   this.firstName = fName;
       }
       

       public String getlastName() {
    	   return lastName;
       }
       
       public void setlastName(String lName) {
    	   this.lastName = lName;
       }

       public int getAge() {
    	   return age;
       }
       
       public void setAge(int sage) {
    	   this.age = sage;
       }

       public String getFullName() {
    	   String fullName = this.firstName + " " + this.lastName+ " "+ this.age; 
    	   return fullName;		   
       }
       
	}
}


