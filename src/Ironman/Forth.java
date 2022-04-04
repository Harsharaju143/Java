package Ironman;

class A{
	int a = 10;
	static int b = 20;
}
class B extends A{
	int c = 30;
}
public class Forth {
	public static void main(String[] args) {
		A a1 = new A();
		B a2 = new B();
		System.out.println(a1.a);
		System.out.println(a1.b);
		System.out.println(a2.c);
	}
}
