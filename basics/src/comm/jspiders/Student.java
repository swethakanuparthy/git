package comm.jspiders;

class Coffee {

}

class Juice {

}

public class Student {
	public static void main(String[] args) {
		Student1 s = new Student1();
		Juice j = new Juice();
		Coffee c = new Coffee();
		s.drink(c);
		s.drink(j);
	}
}

class Student1 {
	void drink(Coffee c) {
		System.out.println("student drink coffee");
	}

	void drink(Juice j) {
		System.out.println("student drink juice");
	}
}