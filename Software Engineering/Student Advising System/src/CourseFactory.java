import java.util.LinkedList;

public class CourseFactory 
{
	private LinkedList<Course> cList = new LinkedList<Course>() ;
	
	
	//Class Constructor Without Parameter 
	public CourseFactory()
	{
		addNewCourse("CSE 327" , "Soft. Eng.", 3 , 1500);
	}
	
	//Add New Course
	public void addNewCourse (String id , String title , int credit , int tutionPerCredit)
	{
		Course course = new Course();
		course.setId(id);
		course.setTitle(title);
		course.setCredit(credit);
		course.setTutionPerCredit(tutionPerCredit);
		cList.add(course);
	}
	
	public void deleteCourse (String id )
	{
		Course course = getCourse(id);
		cList.remove(course);
	}
	
	public Course getCourse(String id)
	{
		for(int i = 0 ; i < cList.size() ; i++)
		{
			Course val = cList.get(i);
			
			if(val.getId().equals(id))
			{
				return val;
			}
		}
		return null;
	}
}
