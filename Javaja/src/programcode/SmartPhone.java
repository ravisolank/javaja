package programcode;


class SmartPhone extends MobilePhoone {
	String camCap;
	void displaySmartPhone()
	{
		System.out.println("Smartphone method");
		System.out.println("brand");
		System.out.println("price");
		System.out.println("servicep");
		System.out.println("camCap");
	}
	

	public static void main(String[] args) {
		SmartPhone s=new SmartPhone();
		s.brand="iphone";
		s.price="250000d";
		s.serviceP="jio";
		s.camCap=53;
		s.displayGP();
		// TODO Auto-generated method stub

	}

}

