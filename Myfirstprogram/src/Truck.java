
public class Truck extends Vehicle{
	
	public double loadcapacity;
	public double towingcapacity;
	
	//default
	public Truck()
	{
		super();
		this.loadcapacity = 0.0;
		this.towingcapacity = 0.0;
	}
	
	public Truck(String xManuName, int xNumberOfCylinders, String xOwnerName, double xLoadCapacity, double xTowingCapacity)
	{
		this.setManufacturerName(xManuName);
		this.setNumberOfCylinders(xNumberOfCylinders);
		this.setOwnerName(xOwnerName);
		this.setLoadCapacity(xLoadCapacity);
		this.setTowingCapacity(xTowingCapacity);
	}
	
	public double getLoadCapacity()
	{
		return this.loadcapacity;
	}
	public double getTowingCapacity()
	{
		return this.towingcapacity;
	}
	
	public void setLoadCapacity(double xLoadCapacity)
	{
		if(xLoadCapacity >= 0)
		{
			this.loadcapacity = xLoadCapacity;
		}
		else
		{
			System.out.println("Invalid load value entered!");
		}
	}
	public void setTowingCapacity(double xTowingCapacity)
	{
		if(xTowingCapacity >= 0)
		{
			this.towingcapacity = xTowingCapacity;
		}
		else
		{
			System.out.println("Invalid towing capacity entered!");
		}
	}
	
	public boolean equals(Truck xTruck)
	{
		if(this.manuname.equalsIgnoreCase(xTruck.manuname) && this.numberofcylinders == xTruck.numberofcylinders && this.ownername.equalsIgnoreCase(xTruck.ownername) && this.loadcapacity == xTruck.loadcapacity && this.towingcapacity == xTruck.towingcapacity)
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
		System.out.println("Manufacturer's Name: " + this.manuname + "\nNumber Of Cylinders: " + this.numberofcylinders + "\nOwner's Name: " + this.ownername + "\nLoad Capacity: " + this.loadcapacity + "\nTowing Capacity: " + this.towingcapacity);
		return this.manuname;
	}
	
	
	
}
