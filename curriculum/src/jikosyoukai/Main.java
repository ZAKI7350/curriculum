package jikosyoukai;


public class Main {
	
		public static void main(String[] args) {

			
			Person p1 = new Person("鈴木太郎", 20, 1.7, 60);

			
			p1.print();

			
			Person.printCount();
		}
	}