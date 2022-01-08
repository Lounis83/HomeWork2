package polymorphism;

public class Vehicule {
	//overloading in the run methode
	
	//encapsulation matricul is private
	// MaxSpeed is public
	//airBag is protected
	
	private String matricul;
	public double MaxSpeed;
	protected boolean airBag;
	 
	public void run() {
		System.out.println("vehicle");
		
	}
	
	public void run(String s) {
		System.out.println(s);
	}

}
