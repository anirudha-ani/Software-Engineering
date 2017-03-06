import java.util.LinkedList;

public class Registration 
{
	private LinkedList <Course> courseList = new LinkedList<Course>() ;

	public LinkedList<Course> getCourseList()
	{
		return courseList;
	}

	public void setCourseList(LinkedList<Course> courseList)
	{
		this.courseList = courseList;
	}
	
	public void addCourse(Course course)
	{
		//System.out.println("Calling from Registration Class " + course.getId() + " " + course.getSubTotal());
//		Course tempCourse = new Course();
//		tempCourse.setId(course.getId());
//		tempCourse.setTitle(course.getTitle());
//		tempCourse.setCredit(course.getCredit());
//		tempCourse.setTutionPerCredit(course.getTutionPerCredit());
		courseList.add(course);
		
	}
	
	public int getTotal()
	{
		int total = 0 ; 
		
		for(int i = 0 ; i < courseList.size() ; i++)
		{
			Course currentIndex = courseList.get(i);
			
			total += currentIndex.getSubTotal(); 
		}
		
		return total;
	}

}
