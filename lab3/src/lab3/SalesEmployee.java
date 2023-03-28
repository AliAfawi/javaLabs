package lab3;

public class SalesEmployee extends Employee implements Sale {
	 private float commis;
	 public SalesEmployee(float salary, float commis) {
	 	super(salary);
	 	this.commis=commis;
	 }
	 public float ComputeSalary() {
	 	return super.ComputeSalary()*(1+getCom()/100);
	 }
	 public float getCom() {
		 return commis;
	 }
	 public String getSaleName() {
		 return "Sales";
	 }

}
