package jikosyoukai;

public class Person {
	 private String name;
	    private int age;
	    private double height; // m単位
	    private double weight; // kg

	    // 人数カウント用（問題10）
	    private static int count = 0;

	    // コンストラクタ
	    public Person(String name, int age, double height, double weight) {
	        this.name = name;
	        this.age = age;
	        this.height = height;
	        this.weight = weight;

	        count++; // インスタンス生成時に人数加算
	    }

	    // 問題6・7：BMI計算メソッド
	    public double bmi() {
	        return this.weight / (this.height * this.height);
	    }

	    // 問題8・9：printメソッド
	    public void print() {
	        System.out.println("名前は" + this.name + "です");
	        System.out.println("年は" + this.age + "です");
	        System.out.println("BMIは" + this.bmi() + "です");
	    }

	    // 問題10：合計人数表示
	    public static void printCount() {
	        System.out.println("合計" + count + "人です");
	    }
	}

