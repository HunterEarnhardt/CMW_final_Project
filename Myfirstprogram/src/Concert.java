//Hunter Earnhardt

public class Concert {
	
	public String name;
	public int capacity;
	public int ticketsbyphone;
	public int ticketsbyvenue;
	public double pricebyphone;
	public double pricebyvenue;
	
	//default values
	public Concert()
	{
		this.name = "none";
		this.capacity = 0;
		this.ticketsbyphone = 0;
		this.ticketsbyvenue = 0;
		this.pricebyphone = 0.0;
		this.pricebyvenue = 0.0;
	}
	
	public Concert(String xName, int xCapacity,double xPriceByPhone,double xPriceAtVenue)
	{
		this.setBandName(xName);
		this.setCapacity(xCapacity);
		this.setPriceAtVenue(xPriceAtVenue);
		this.setPriceByPhone(xPriceByPhone);
	}
	
	public Concert(String xName, int xCapacity, int xTicketsByPhone, int xTicketsByVenue, double xPriceByPhone,double xPriceAtVenue)
	{
		this.setBandName(xName);
		this.setCapacity(xCapacity);
		this.buyTicketsByPhone(xTicketsByPhone);
		this.buyTicketsAtVenue(xTicketsByVenue);
		this.setPriceByPhone(xPriceByPhone);
		this.setPriceAtVenue(xPriceAtVenue);
	}

	//Accessors
	public String getBandName()
	{
		return this.name;
	}
	public int getCapacity()
	{
		return this.capacity;
	}
	public int getNumTicketsSoldByPhone()
	{
		return this.ticketsbyphone;
	}
	public int getNumTicketsSoldAtVenue()
	{
		return this.ticketsbyvenue;
	}
	
	//Mutators
	public void setBandName(String xName)
	{
		this.name = xName;
	}
	public void setCapacity(int xCapacity)
	{
		this.capacity = xCapacity;
	}
	public void setPriceByPhone(double xPriceByPhone)
	{
		if(xPriceByPhone >= 1)
		{
		this.pricebyphone = xPriceByPhone;
		}
		else
		{
			System.out.println("Invalid price entered!");
		}
	}
	public void setPriceAtVenue(double xPriceAtVenue)
	{
		if(xPriceAtVenue >= 1)
		{
			this.pricebyvenue = xPriceAtVenue;
		}
		else
		{
			System.out.println("Invalid price entered!");
		}
	}
	
	//Methods
	public int totalNumberOfTicketsSold()
	{
		return this.ticketsbyphone + this.ticketsbyvenue;
	}
	public int ticketsRemaining()
	{
		return this.capacity - (this.ticketsbyphone + this.ticketsbyvenue);
	}
	public void buyTicketsAtVenue(int xTicketsAtVenue)
	{
		if(xTicketsAtVenue >= 1)
		{
			this.ticketsbyvenue = xTicketsAtVenue;
		}
		else
		{
			System.out.println("Invalid value entered!");
		}
	}
	public void buyTicketsByPhone(int xTicketsByPhone)
	{
		if(xTicketsByPhone >= 1)
		{
			this.ticketsbyphone = xTicketsByPhone;
		}
		else
		{
			System.out.println("Invalid price entered!");
		}
	}
	public double totalSales()
	{
		return (this.pricebyvenue * this.ticketsbyvenue) + (this.pricebyphone * this.ticketsbyphone);
	}


	
	
}
