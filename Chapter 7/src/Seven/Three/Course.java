package Seven.Three;

import java.util.ArrayList;

public class Course
{
	// Create instance variables.
	private String name;
	private ArrayList<Student> studentsInCourse = new ArrayList<Student>();
	
	// Object constructor.
	public Course(String name)
	{
		this.name = name;
	}
	
	// Method that adds a student to the course.
	public void addStudent(Student student)
	{
		studentsInCourse.add(student);
	}
	
	// Method that returns the average of the test scores for all students in the course.
	public double average()
	{
		int averagesTotal = 0;
		
		for (Student student : studentsInCourse)
		{
			averagesTotal += student.average();
		}
		
		averagesTotal /= studentsInCourse.size();
		return averagesTotal;
	}
	
	// Method that prints all the students in the course.
	public String roll()
	{
		String studentList = "";
		
		for (Student student : studentsInCourse)
		{
			studentList += student.getStudentName() + "\n";
		}
		
		return studentList;
	}
}