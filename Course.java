public class Course {
   /*the basic features of a course*/
	//data
	public String courseName;
	private String courseNumber;
	public String instructorName;
	private Student[] listStudents;
	
	/*construct a course object (TWO constructors)*/
	public Course(String course, String number, String instructor, Student[] students) {
		this.courseName = course;
		this.courseNumber = number;
		this.instructorName = instructor;
		
		this.listStudents = new Student[students.length];//allocate memory space
			for(int i = 0; i < students.length; i++) {
				this.listStudents[i] = new Student(students[i]);
			}
		
	}
	//copy constructor
	public Course(Course c) {
		//error checking
		if(c == null || c.courseName.equals("") || c.courseNumber.equals("") || c.instructorName.equals("") || c.listStudents == null) {
			System.out.println("Invalid course object! Stop!");
			System.exit(0);
		}
		this.courseName = c.courseName;
		this.courseNumber = c.courseNumber;
		this.instructorName = c.instructorName;
		
		this.listStudents = new Student[c.listStudents.length];//allocate memory space
			for(int i = 0; i < c.listStudents.length; i++) {
				this.listStudents = new Student[i];
			}
		
	}
	//set methods
	public void setListStudents(Student[] students) {
		//this.students = students; NOT GOOD!!!!
		this.listStudents = new Student[students.length];//request memory space
		for(int i = 0; i < students.length; i++) {
			this.listStudents[i] = new Student(students[i]);
		}
	}
	
	public void setCourseName(String course) {
		this.courseName = course;
	}
	
	public void setCourseNumber(String number) {
		this.courseNumber = number;
	}
	
	public void setInstructorName(String instructor) {
		this.instructorName = instructor;
	}
	
	//get methods
	public Student[] getStudents() {
		Student[] temp = new Student[this.listStudents.length];//request space in memory using internal data
			for(int j = 0; j < temp.length; j++) {
				temp[j] = new Student(this.listStudents[j]);
			}
			return temp;	
	}
	
	public String getCourseName() {
		return this.courseName;
	}
	
	public String getCourseNumber() {
		return this.courseNumber;
	}
	
	public String getInstructorNmae() {
		return this.instructorName;
	}
	
	//toString method
	
	public String toString() {
		String output = "";
		output += "Course Info:\n\nCourse Name: " + this.courseName + "\n";
		output += "\nCourse Number: " + this.courseNumber + "\n";
		output += "\nInstructor Name: " + this.instructorName + "\n";
		output += "\nStudent List: ";
				for(int k = 0; k < this.listStudents.length; k++) {
					output += "Student # " + (k + 1) + " Info:\n" + this.listStudents[k].toString() + "\n\n";
		}
		
		return output;
	}
}
