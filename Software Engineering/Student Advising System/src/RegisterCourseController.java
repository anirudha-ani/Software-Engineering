
public class RegisterCourseController 
{
	
	private Registration reg ;
	
	private CourseFactory offeredList = new CourseFactory();
		
	
	public void makeNewRegistration(CourseFactory offeredList)
	{
		reg = new Registration();
		this.offeredList = offeredList;
	};
	
	public void addCourse(String id)
	{
		//System.out.println("ID = " + offeredList.getCourse(id).getId());
		reg.addCourse(offeredList.getCourse(id));
	}
	
	public Registration getRegistration()
	{
		return reg;
	}
	

}
