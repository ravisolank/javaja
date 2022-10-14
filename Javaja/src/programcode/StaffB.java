package programcode;

public class StaffB {
	String name;
	int empid;
	String designation;

}
class TrainerB extends StaffB
{
	int NoBatch;
	public void displayTrainerB()
	{
		System.out.println("name "+name);
		System.out.println("Empid "+empid);
		System.out.println("Designation "+designation);
		System.out.println("Batch no "+NoBatch);
		}
}
class trackerB extends StaffB
{
	String floar incharge;
	void dispalayTracker()
	{
		System.out.println("name "+name);
		System.out.println("Empid "+empid);
		System.out.println("Designation "+designation);
		System.out.println("Floar incharge "+floar incharge);
		
	}
}
class DriverMain
{
	public static void main(String[]arz)
	{
		TrainerB a=new TrainerB();
		a.name
	}
}

