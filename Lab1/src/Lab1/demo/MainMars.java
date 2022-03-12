package Lab1.demo;

public class MainMars {
	
	public static void main(String[] args)
	{
		Weight rectangle1 = new Weight(43);

		System.out.println("\nWeight in KG : "+rectangle1.weight);
		System.out.println("\nWeight in Mars : "+rectangle1.Calculate());
		
	}

}
