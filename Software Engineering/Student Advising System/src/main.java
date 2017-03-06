
public class main
{

	public static void main(String[] args)
	{
		
		CourseFactory offeredList = new CourseFactory();
		
		offeredList.addNewCourse("XX" , "YY" , 3 , 1500);
		offeredList.addNewCourse("12" , "gds" , 3 , 1500);
		offeredList.addNewCourse("asd" , "xx" , 3 , 1500);
		offeredList.addNewCourse("hdf" , "rw" , 3 , 1500);
		
		RegisterCourseController currentRegistration = new RegisterCourseController();
		
		currentRegistration.makeNewRegistration(offeredList);
		
		currentRegistration.addCourse("12");
		
		currentRegistration.addCourse("asd");
		
		for(int i = 0 ; i < currentRegistration.getRegistration().getCourseList().size() ; i++)
		{
			System.out.println(currentRegistration.getRegistration().getCourseList().get(i).getId());
		}
		
		System.out.println(currentRegistration.getRegistration().getTotal());
	}

}
