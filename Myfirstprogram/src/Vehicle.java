
public class Vehicle {
	
	public String manuname;
	public int numberofcylinders;
	public String ownername;
	
	//default
	public Vehicle()
	{
		this.manuname = "Ford";
		this.numberofcylinders = 6;
		this.ownername = "Joe";
	}
	
	public Vehicle(String xManuName, int xNumberOfCylinders, String xOwnerName)
	{
		this.setManufacturerName(xManuName);
		this.setNumberOfCylinders(xNumberOfCylinders);
		this.setOwnerName(xOwnerName);
	}
	
	//accesors and Mutators
	public String getManufacturerName()
	{
		return this.manuname ;
	}
	public int getNamberOfCylinders()
	{
		return this.numberofcylinders;
	}
	public String getOwnerName()
	{
		return this.ownername;
	}
	
	public void setManufacturerName(String xManuName)
	{
		this.manuname = xManuName;
	}
	public void setNumberOfCylinders(int xNumberOfCylinders)
	{
		if(xNumberOfCylinders > 0)
		{
		this.numberofcylinders = xNumberOfCylinders;
		}
		else
		{
			System.out.println("Invalid number entered!");
		}
	}
	public void setOwnerName(String xOwnerName)
	{
		this.ownername = xOwnerName;
	}
	
	//methods
	public boolean equals(Vehicle xVehicle)
	{
		if(this.manuname.equalsIgnoreCase(xVehicle.manuname) && this.numberofcylinders == xVehicle.numberofcylinders && this.ownername.equalsIgnoreCase(xVehicle.ownername))
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
		System.out.println("Manufacturer's Name: " + this.manuname + "\nNumber Of Cylinders: " + this.numberofcylinders + "\nOwner's Name: " + this.ownername);
		return this.manuname;
	}
	
	
	
	
	
	
	
	
	
	
	
}
