package abstraction;

public class Carnivorous extends Animal2 implements Animal,AnimalInterface  {

	@Override
	public void eat() {//from the interface Animal
		
		System.out.println("Eating meat");
	}

	@Override
	void walk() {//from the abstract class Animal2
		
		System.out.println("Carnivorous is walking");
		
	}

	@Override
	public void makeNoise() {//from the interface AnimalInterface
		System.out.println("Noise...");
	}

}
