package programcode;

public class DriverMain {
	public static void main(String[]raz)
	{
		Trainer t=new Trainer();
		t.name="mohit";
		t.empid=6;
		t.designation="Java Trainer in TestDept";
		t.displayTrainer();
		
		HR h=new HR();
		h.name="ravi";
		h.empid=3;
		h.designation="HR in development dept";
		h.dept="Jspider";
		h.displayHR();
			
		TrackerBoy b=new TrackerBoy();
		
		b.name="satish";
		b.empid=5;
		b.designation="Tracker development dept";
		b.floarincharge="3rdfloar";
		b.displayTracker();
		
		
	}

}
