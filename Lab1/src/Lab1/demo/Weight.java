package Lab1.demo;

public class Weight {
	
	public double weight;
	public double mars = 3.8;
	
	public Weight(){}
		
	public Weight(double weight)
	{
		this.weight = weight;
	}
	
	public double Calculate() 
	{
		return (weight*mars);		
	}

}
