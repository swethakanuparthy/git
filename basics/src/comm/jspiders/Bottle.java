package comm.jspiders;

public class Bottle {
	public static void main(String[] args) {
		Bottle1 b = new Bottle1();
		Water1 w = new Water1();
		Juice1 j = new Juice1();
		Oil1 o = new Oil1();
		b.store(w);
		b.store(j);
		b.store(o);
	}
}

class Bottle1 {
	void store(Juice1 j) {
		System.out.println("Bottle store juice");
	}

	void store(Oil1 o) {
		System.out.println("Bottle store oil");
	}

	void store(Water1 w) {
		System.out.println("Bottle store water");
	}
}
class Juice1{
	
}
class Oil1{
	
}
class Water1{
	
}
