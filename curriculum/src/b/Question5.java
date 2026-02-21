package b;

public class Question5 {
	

    public static void main(String[] args) {
        // Q1
        helloWorld();
        System.out.println();

        
        
        
        // Q2
        int base = 10;
        int doubled = doubleValue(base);
        System.out.println(base + " を 2 倍すると " + doubled + " です。");
        System.out.println();

        // Q3
        int num1 = 7;
        int num2 = 10;

        System.out.println(num2 + (isEven(num2) ? " は偶数です。" : " は奇数です。"));
        System.out.println(num1 + (isEven(num1) ? " は偶数です。" : " は奇数です。"));
    }

    // Q1
    public static void helloWorld() {
        System.out.println("Hello, World!");
    }
    
    
    

    // Q2
    public static int doubleValue(int num) {
        return num * 2;
    }

    
    
    
    
    // Q3
    public static boolean isEven(int num) {
        return num % 2 == 0;
    }
}