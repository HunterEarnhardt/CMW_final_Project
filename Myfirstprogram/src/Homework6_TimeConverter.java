
public class Homework6_TimeConverter{
	
	//variables
	public int hours;
	public int minutes;
	public int seconds;
	public boolean notPM;
	
	//default values
	public Homework6_TimeConverter()
	{
		this.hours = 00;
		this.minutes = 00;
		this.seconds = 00;
		notPM = true;
	}
	
	//parameterized constructors
	public Homework6_TimeConverter(int xHours, int xMinutes, int xSeconds)
	{
		this.setHours(xHours);
		this.setMinutes(xMinutes);
		this.setSeconds(xSeconds);
	}
	
	//Methods
	public int getHours()
	{
		return this.hours;
	}
	public int getMinutes()
	{
		return this.minutes;
	}
	public int getSeconds()
	{
		return this.seconds;
	}
	
	//Mutators
	public void setHours(int xHours )
	{
		if(xHours >= 0 && xHours <= 24)
		{
		this.hours = xHours;
		}
		else
		{
			Homework6_TimeException EX = new Homework6_TimeException();
		}
	}
	public void setMinutes(int xMinutes)
	{
		if(xMinutes >= 0 && xMinutes <= 59)
		{
		this.minutes = xMinutes;
		}
		else
		{
			Homework6_TimeException EX = new Homework6_TimeException();
		}
	}
	public void setSeconds(int xSeconds) 
	{
		if(xSeconds <= 59 && xSeconds >= 0)
		{
		this.seconds = xSeconds;
		}
		else
		{
			Homework6_TimeException EX = new Homework6_TimeException();
		}
	}
	
	//changing time
	public void UpdateTime()
	{
		if(this.hours > 12)
		{
			this.hours = this.hours - 12;
			notPM = false;
		}
		else
		{
			notPM = true;
		}
		
	}
	
	public void UpdateTime(String Time)
	{
		String[] times = Time.split(":");
		setHours(Integer.parseInt(times[0]));
		setMinutes(Integer.parseInt(times[1]));
		setSeconds(Integer.parseInt(times[2]));
	}
	
	public void DisplayTime()
	{
		if(notPM == false)
		{
			System.out.println("12-hour clock time → " + this.hours + ":" + this.minutes + ":" + this.seconds + "   PM");
		}
		else
		{
			System.out.println("12-hour clock time → " + this.hours + ":" + this.minutes + ":" + this.seconds + "   AM");
		}
	}
}
