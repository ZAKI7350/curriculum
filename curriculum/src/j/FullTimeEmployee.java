package j;
public class FullTimeEmployee extends Employee {

    private static final int HOURLY_RATE = 1200;

    public FullTimeEmployee(String id, String name) {
        super(id, name);
    }

    @Override
    public int costForDay(int hoursWorked) {
        int overtime = Math.max(0, hoursWorked - 8);
        int regular = hoursWorked - overtime;

        return (regular * HOURLY_RATE)
                + (int)(overtime * 1500);
    }
}