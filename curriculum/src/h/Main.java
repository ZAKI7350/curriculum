package h;


public class Main {

    public static void main(String[] args) {

       
        Employee full = new FullTimeEmployee("E003", "山本一郎");
        Employee part = new PartTimeEmployee("E004", "鈴木次郎");

        int hours = 9;

        
        System.out.println("正社員の給与: " + full.calculateDailyWage(hours) + "円");
        System.out.println("アルバイトの給与: " + part.calculateDailyWage(hours) + "円");
    }
}