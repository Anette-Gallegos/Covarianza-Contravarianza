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
		A a = new A();
		
		a.foo(new A());
		a.foo(new B());
		a.foo(new C());
	}

	@Test
	void Test3()throws Error{
		C c = new C();
		
		c.foo(new A());
		c.foo(new B());
		c.foo(new C());
	}

	@Test
	void Test4()throws Error{
		Y y = new Y();
		y.foo(new X());
	}
	
	@Test
	void Test5()throws Error{
		X x = new X();
		x.foo(new Y());
	}
}
