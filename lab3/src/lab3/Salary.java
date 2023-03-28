package lab3;

public class Salary{
 public static void main(String[] args)
 {
//	 // TODO:
//	 // To create four different types of employees'
//	 Employee E1 = new Employee(1000);
////	 System.out.println( E1.getName());
//	 Employee E2 = new Employee(1500);
//	 
//	 Manager M1 = new Manager(2000 , 5);
////	 System.out.println( M1.getName());
//
//	 Manager M2 = new Manager(2500 , 3);

	 
	 // and to print their names and salaries
     Employee empl = new Employee(5000);
     System.out.print("Compute pay for " + empl.getName() + ": ");
     System.out.println(empl.ComputeSalary());
     empl = new SalesEmployee(5000,10);
     System.out.print("Compute pay for " + empl.getName() + ": ");
     System.out.println(empl.ComputeSalary());
     empl = new Manager(5000,5);
     System.out.print("Compute pay for " + empl.getName() + ": ");
     System.out.println(empl.ComputeSalary());
     empl = new SalesManager(5000, 4.2f, 12);
     System.out.print("Compute pay for " + empl.getName() + ": ");
     System.out.println(empl.ComputeSalary());
 }
}



