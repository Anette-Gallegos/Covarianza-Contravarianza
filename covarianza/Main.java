package covarianza;

public class Main {

	public static void main(String[] args) {
		B b = new B();
		
		b.foo(new A());
		b.foo(new B());
		b.foo(new C());
		
		X x = new X();
		x.foo(new Y());
		
		Y y = new Y();
		y.foo(new X());
	}
}
