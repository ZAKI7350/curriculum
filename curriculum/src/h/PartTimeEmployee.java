package h;


public class PartTimeEmployee extends Employee {

	   
    private static final int HOURLY_RATE = 1000;

    
    public PartTimeEmployee(String id, String name) {
        super(id, name);
    }

  
    @Override
    public int calculateDailyWage(int hours) {
        return hours * HOURLY_RATE;
    }
}