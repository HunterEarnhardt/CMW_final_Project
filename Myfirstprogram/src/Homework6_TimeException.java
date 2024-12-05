
public class Homework6_TimeException  extends Exception{
	
	public Homework6_TimeException()
	{
		super();
		System.out.println("EXCEPTION: Invalid time entered");
	}
	
	public Homework6_TimeException(String msg)
	{
		super(msg);
	}
	
}
