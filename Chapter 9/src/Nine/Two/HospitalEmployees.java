package Nine.Two;

public class HospitalEmployees
{
	public static void main(String[] args)
	{
		//Create objects and variables.
		Admin admin = new Admin(1, 100000, 8, 16, true, true);
		Doctor doctor = new Doctor(2, 70000, 10, 8, false, true);
		Janitor janitor = new Janitor(3, 55000, 9, 7, true, false);
		Nurse nurse = new Nurse(4, 60000, 5, 4, false, true);
		Receptionist receptionist = new Receptionist(5, 60000, 8, 2, true, true);
		Surgeon surgeon = new Surgeon(6, 200000, 5, 1, true, false);
		
		// Do the stuff with the different employees.
		System.out.print("Admin: ");
		admin.administer();
		System.out.print("Surgeon: ");
		surgeon.doSurgery();
		System.out.print("Doctor: ");
		doctor.callNurse();
		System.out.print("Nurse: ");
		nurse.helpDoctor();
		System.out.println();
		
		System.out.println("Nurses id card: " + nurse.getId());
		System.out.println("Receptionist Salary: " + receptionist.getSalary());
	}
}