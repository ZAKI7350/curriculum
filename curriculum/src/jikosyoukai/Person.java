package jikosyoukai;

public class Person {
	 private String name;
	    private int age;
	    private double height; // m単位
	    private double weight; // kg

	    
	    private static int count = 0;

	    
	    public Person(String name, int age, double height, double weight) {
	        this.name = name;
	        this.age = age;
	        this.height = height;
	        this.weight = weight;

	        count++;
	    }

	    
	    public double bmi() {
	        return this.weight / (this.height * this.height);
	    }

	    
	    public void print() {
	        System.out.println("名前は" + this.name + "です");
	        System.out.println("年は" + this.age + "です");
	        System.out.println("BMIは" + this.bmi() + "です");
	    }

	    
	    public static void printCount() {
	        System.out.println("合計" + count + "人です");
	    }
	}

