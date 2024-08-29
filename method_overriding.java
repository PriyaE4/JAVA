package programs;
class Person{
	public void getFirstName(){
		String fn = "Jenny";
		System.out.println("First name: "+fn);
	}
	public void getLastName(){
		String ln = "Thomas";
		System.out.println("Last name: "+ln);
	}
}
class Employee extends Person{
	public void getEmployeeId() {
		int eid = 12;
		System.out.println("Employee id: "+eid);
	}
	public void getLastName(){
		String ejt = "HR";
		System.out.println("Employee job title: "+ejt);
	}
}
public class method_overriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Employee().getFirstName();
		new Employee().getLastName();
		new Employee().getEmployeeId();
		}
}
