package h;
public abstract class Employee {

   private  String employeeId;
   private  String name; 

   
    public Employee(String id, String name) {
        this.employeeId = id;
        this.name = name;
    }

    
    public abstract int calculateDailyWage(int hours);
}