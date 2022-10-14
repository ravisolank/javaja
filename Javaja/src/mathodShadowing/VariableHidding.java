package mathodShadowing;

 class Tool 
 {
	String brand="cello";

}
 class Pen extends Tool
 {
	 String brand="camblig";
	 public static void main(String[]arex)
	 {
		 Pen p=new Pen();
		 System.out.println(p.brand);
		 Tool t=new Tool();
		 System.out.println(t.brand);
		 
	 }
 }
