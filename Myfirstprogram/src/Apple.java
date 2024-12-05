//Hunter Earnhardt

public class Apple {
	
	//base variables
	public String type;
	public double weight;
	public double price;
	
	//default apple
	public Apple()
	{
		this.type = "Gala";
		this.weight = 0.5;
		this.price = 0.88;
	}
	
	//accesors
	public String getType(String xType)
	{
		return this.type;
	}
	public double getWeight(double xWeight)
	{
		return this.weight;
	}
	public double getPrice(double xPrice)
	{
		return this.price;
	}
		
	//mutators
	public void setType(String xType)
	{
		if(xType.equalsIgnoreCase("Gala") || xType.equalsIgnoreCase("Red Delicious") || xType.equalsIgnoreCase("Golden Delicious") || xType.equalsIgnoreCase("Granny Smith"))
		{	
			this.type = xType;
		}
		else
		{
			System.out.println("Invalid value for Type!");
		}
	}
	
	public void setWeight(double xWeight)
	{
		if(xWeight >= 0 && xWeight <= 2)
		{
		this.weight = xWeight;
		}
		else
		{
			System.out.println("Invalid value for weight!");
		}
	}
	
	public void setPrice(double xPrice)
	{
		if(xPrice > 0 && xPrice < 1)
		{
		this.price = xPrice;
		}
		else
		{
			System.out.println("Invalid value for price!");
		}
	}
	
	//printing the output
	public void  writeOutput()
	{
		System.out.println("Type: " + type + "\nWeight: " + weight + "kg \nPrice: $" + price);
	}
	
}
