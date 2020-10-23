
public class Employee{
    private String firstName;
    private String lastName;
    private double hourlySalary;
    private int hoursWorked;

    public String getFirstName(){return firstName;}
    public void setFirstName(){this.firstName=firstName;}

    public String getLastName(){return lastName;}
    public void setLastName(){this.lastName=lastName;}

    public double getHourlySalary(){return hourlySalary;}
    public void setHourlySalary(){this.hourlySalary=hourlySalary;}

    public int getHoursWorked(){return hoursWorked;}
    public void setHoursWorked(){this.hoursWorked=hoursWorked;}

    public void display(){
        System.out.printf("%s %s %s%n","Employee Name:",getFirstName(),getLastName());
        System.out.printf("%s %.2f%n","Hourly salary:",getHourlySalary());
        System.out.printf("%s %d%n%n","Hours worked:",getHoursWorked());
    }

    public Employee(String firstName,String lastName,double hourlySalary,int hoursWorked){
        this.firstName=firstName;
        this.lastName=lastName;
        this.hourlySalary=hourlySalary;
        this.hoursWorked=hoursWorked;
    }

}
