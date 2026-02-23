package j;
public abstract class Employee implements Billable {

    protected String id;
    protected String name;

    // コンストラクタ
    public Employee(String id, String name) {
        this.id = id;
        this.name = name;
    }

    // costForDay は実装しない（抽象のまま）
    @Override
    public abstract int costForDay(int hoursWorked);
}