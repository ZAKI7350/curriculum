package i;

import java.util.ArrayList;
import java.util.List;


public class Main {

    public static void main(String[] args) {

                List<Employee> employees = new ArrayList<>();

        
        employees.add(new FullTimeEmployee("F001", "山田太郎"));
        employees.add(new ContractEmployee("C001", "佐藤花子"));
        employees.add(new FullTimeEmployee("F002", "鈴木一郎"));
        employees.add(new ContractEmployee("C002", "高橋次郎"));

        int hours = 9;

       
        for (Employee emp : employees) {
            int wage = emp.calculateDailyWage(hours);
            System.out.println(emp.getName() + " の給与: " + wage + "円");
        }
    }
}