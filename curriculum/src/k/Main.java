package k;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();
        employees.add(new FullTimeEmployee("山田", 8));
        employees.add(new ContractEmployee("佐藤", 8));

        SalaryCalculator calculator = new SalaryCalculator();
        SalaryReporter reporter = new SalaryReporter();

        for (Employee e : employees) {
            int salary = calculator.calculate(e);
            reporter.report(e, salary);
        }
    }
}