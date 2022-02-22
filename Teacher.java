public class Teacher extends Person{
    private String ID;
    //I cannot use # in variable name
    private int monthly_salary,yr_prof;
    
    public Teacher(String ID, int sal, int num,String name, boolean alive, int age, String ssn){
        super(name, alive, age, ssn);
        this.ID = ID;
        this.monthly_salary = sal;
        this.yr_prof = num;
    }
    //copy con
    public Teacher(Teacher a){
        super(a.getName(), a.getAlive(), a.getAge(), a.getSsn());
        this.ID = a.ID;
        this.monthly_salary = a.monthly_salary;
        this.yr_prof = a.yr_prof;
    }
    //setget
    public String getID(){
        return this.ID;
    }
    public int getSal(){
        return this.monthly_salary;
    }
    public int getYrWorked(){
        return this.yr_prof;
    }
    public void setID(String ID){
        this.ID = ID;
    }
    public void setSal(int sal){
        this.monthly_salary = sal;
    }
    public void setYrs(int yrs){
        this.yr_prof = yrs;
    }
    //toString
    public String toString(){
        String output = "";
        output += "Teacher Info:\n\n" + "Teacher ID: " + getID() +
        "\nMonthly Salary: " + getSal() + 
        "\nYears worked: " + getYrWorked();
        return output;
    }
}
