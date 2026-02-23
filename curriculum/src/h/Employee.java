package h;
public abstract class Employee {

    protected String employeeId;
    protected String name;

   
    public Employee(String id, String name) {
        this.employeeId = id;
        this.name = name;
    }

    
    public abstract int calculateDailyWage(int hours);
}