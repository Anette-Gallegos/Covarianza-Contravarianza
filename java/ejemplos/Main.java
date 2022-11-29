package ejemplos;

public class Main {
	
	public static void main(String[] args) {
		
		A a = new A();
		a.foo(new A());
		a.foo(new B());
		a.foo(new C());
		
		B b = new B();
		
		b.foo(new A());
		b.foo(new B());
		b.foo(new C());
		
		C c = new C();
		c.foo(new A());
		c.foo(new B());
		c.foo(new C());
		
		System.out.println("Made in Windows :D");
		System.out.println("Steve Jobs >= Alan Kay :D");
		System.out.println("Linux ha dejado de funcionar");
	}
}
