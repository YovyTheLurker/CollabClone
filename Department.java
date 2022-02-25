public class Department {
    //data
	private String deptName;
	private int numMajors;
	private Teacher[] listTeachers; //inherits from Person class
	private Student[] listStudents; //inherits from Person class
	
	/* Construct a department object (at least TWO constructors) */
	//fully loaded constructor
	public Department(String n, int m, Teacher[] t, Student[] s) {
		
		this.deptName = n;
		this.numMajors = m;
		
		this.listTeachers = new Teacher[t.length];
			for(int i = 0; i < t.length; i++) {
				this.listTeachers[i] = new Teacher(t[i]);
				}
			
		this.listStudents = new Student[s.length];
			for(int j = 0; j < s.length; j++) {
				this.listStudents[j] = new Student(s[j]);
			}
		
		
	}

	/* Accessors and mutators (one pair per each feature) */
	//set methods
	public void setDepartmentName(String n) {
		this.deptName = n;
	}
	
	public void setNumberOfMajors(int m) {
		this.numMajors = m;
	}
	
	public void setListStudents(Student[] s) {
		this.listStudents = new Student[s.length];
		for(int j = 0; j < s.length; j++) {
			this.listStudents[j] = new Student(s[j]);
		}
			
	}
	
	public void setListTeachers(Teacher[] t) {
		this.listTeachers = new Teacher[t.length];
		for(int i = 0; i < t.length; i++) {
			this.listTeachers[i] = new Teacher(t[i]);
			}
	}
	
	//get methods
	public String getDepartmentName() {
		return this.deptName;
	}
	
	public int getNumberOfMajors() {
		return this.numMajors;
	}
	
	public Teacher[] getListTeachers() {
		Teacher[] temp = new Teacher[this.listTeachers.length];
			for(int p = 0; p < temp.length; p++) {
				temp[p] = new Teacher(this.listTeachers[p]);
			}
		return temp;
	}
	
	public Student[] getListStudents() {
		Student[] temp = new Student[this.listStudents.length];
			for(int k = 0; k < temp.length; k++) {
				temp[k] = new Student(this.listStudents[k]);
			}
			
		return temp;
	}

	    /* toString method */
	public String toString() {
		String output = "";
		
		output += "Department Info:\n\nDepartment Name: " + this.deptName + "\n";
		output += "\nNumber of Majors: " + this.numMajors + "\n";
		output += "List of Teachers: ";
			for(int q = 0; q < this.listTeachers.length; q++) {
				output += "Teacher # " + (q + 1) + " Info: " + this.listTeachers[q].toString() + "\n\n";
			}
		output += "List of Students: ";
			for(int m = 0; m < this.listStudents.length; m++) {
				output += "Student # " + (m + 1) + " Info: " + this.listStudents[m].toString() + "\n\n"; 
			}
		
		
		
		return output;
	}
}
