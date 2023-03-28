package lab3;

public class SalesManager extends Manager implements Sale {
	 private float commis;
	 public SalesManager(float salary, float kmult, float commis){
	 	super(salary,kmult);
	 	this.commis = commis;
	 }
	 public float ComputeSalary() {
	 	return super.ComputeSalary()*(1+commis/100);
	 }
	 public float getCom() {
		 return this.ComputeSalary();
	 }
	 public String getSaleName() {
		return super.getName();
	 }	}