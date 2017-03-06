
public class Course 
{
	private String id;
	private String title;
	private double credit;
	public int tutionPerCredit;
	
	
	//Get Set Method For Course ID 
	public String getId()
	{
		return id;
	}
	public void setId(String id)
	{
		this.id = id;
	}
	
	//Get Set Method For Course Title 
	public String getTitle()
	{
		return title;
	}
	public void setTitle(String title)
	{
		this.title = title;
	}
	
	//Get Set Method For Course Credit . It can be double like - 1.5
	public double getCredit()
	{
		return credit;
	}
	public void setCredit(double credit)
	{
		this.credit = credit;
	}
	
	//Get Set Method For Tution Per Credit . It is integer , can't be double like 3.5 taka 
	public int getTutionPerCredit()
	{
		return tutionPerCredit;
	}
	public void setTutionPerCredit(int tutionPerCredit)
	{
		this.tutionPerCredit = tutionPerCredit;
	}
	
	public double getSubTotal()
	{
		return getCredit() * getTutionPerCredit();
	}

}
