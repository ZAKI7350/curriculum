package h;


public class FullTimeEmployee extends Employee {

    
    private static final int HOURLY_RATE = 1200;

   
    public FullTimeEmployee(String id, String name) {
        super(id, name);
    }

    
    @Override
    public int calculateDailyWage(int hours) {
        if (hours <= 8) {
            return hours * HOURLY_RATE;
        } else {
            int overtime = hours - 8;
            return (8 * HOURLY_RATE)
                    + (int)(overtime * 1500);
        }
    }
}