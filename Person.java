public class Person{
    public String name;
    public boolean alive;
    public int age;
    public String ssn;

    public Person(){
        this.name = "";
        this.alive = true;
        this.age = 0;
        this.ssn = "";
    }

    public Person(String nameIn, boolean aliveIn, int ageIn, String ssnIn){
        this.name = nameIn;
        this.alive = aliveIn;
        this.age = ageIn;
        this.ssn = ssnIn;
    }

    public Person(Person person){
        this.name = getName();
        this.alive = getAlive();
        this.age = getAge();
        this.ssn = getSsn();
    }

    // getters
    public String getName(){
        return this.name;
    };

    public boolean getAlive(){
        return this.alive;
    };

    public int getAge(){
        return this.age;
    };

    public String getSsn(){
        return this.ssn;
    };

    // setters
    public void setName(String arg){
        this.name = arg;
    };

    public void setAlive(boolean arg){
        this.alive = arg;
    };

    public void setAge(int arg){
        this.age = arg;
    };

    public void setSsn(String arg){
        this.ssn = arg;
    };

}