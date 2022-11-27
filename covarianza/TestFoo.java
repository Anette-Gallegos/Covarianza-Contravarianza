package covarianza;

import org.junit.jupiter.api.Test;

class TestFoo {

	@Test
	void Test1()throws Error{
		B b = new B();
		
		b.foo(new A());
		b.foo(new B());
		b.foo(new C());
	}

	@Test
	void Test2()throws Error{
		B b = new B();
		
		C c = new C();
		c.foo(b);
	}
	
	@Test
	void Test3()throws Error{
		Y y = new Y();
		y.foo(new X());
	}
	
	@Test
	void Test4()throws Error{
		X x = new X();
		x.foo(new Y());
	}
}
