
public class Car extends Vehicle{
	
	public double gasmileage;
	public int numberofpassengers;
	
	public Car()
	{
		super();
		this.gasmileage = 0.0;
		this.numberofpassengers = 2;
	}
	
	public Car(String xManuName, int xNumberOfCylinders, String xOwnerName, double xGasMileage, int xNumberOfPassengers)
	{
		this.setManufacturerName(xManuName);
		this.setNumberOfCylinders(xNumberOfCylinders);
		this.setOwnerName(xOwnerName);
		this.setGasMileage(xGasMileage);
		this.setNumberOfPassengers(xNumberOfPassengers);
	}
	public double getGasMileage()
	{
		return this.gasmileage;
	}
	public int getNumberOfPassengers()
	{
		return this.numberofpassengers;
	}
	
	public void setGasMileage(double xGasMileage)
	{
		if(xGasMileage >= 0)
		{
			this.gasmileage = xGasMileage;
		}
		else
		{
			System.out.println("Invalid gas mileage value entered!");
		}
	}
	public void setNumberOfPassengers(int xNumberOfPassengers)
	{
		if(xNumberOfPassengers >= 0)
		{
			this.numberofpassengers = xNumberOfPassengers;
		}
		else
		{
			System.out.println("Invalid number of passengers entered!");
		}
	}
	
	public boolean equals(Car xCar)
	{
		if(this.manuname.equalsIgnoreCase(xCar.manuname) && this.numberofcylinders == xCar.numberofcylinders && this.ownername.equalsIgnoreCase(xCar.ownername) && this.gasmileage == xCar.gasmileage && this.numberofpassengers == xCar.numberofpassengers)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public String toString()
	{
		return"Manufacturer's Name: " + this.manuname + "\nNumber Of Cylinders: " + this.numberofcylinders + "\nOwner's Name: " + this.ownername + "\nGas Mileage: " + this.gasmileage + "\nNumber of Passengers: " + this.numberofpassengers;
		
	}
	
	
	
	
}
