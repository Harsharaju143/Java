package Ironman;

public class Second {
	static int a = 10;
	int a1 = 20;
	static {
		System.out.println("Hii...");
	}
	{
		System.out.println("Hello..");
	}
	static void m1() {
		System.out.println("Hmm...!");
	}
	void m2() {
		System.out.println("haaa...!");
	}
	Second(){
		
	}
	public static void main(String[] args) {
		System.out.println(a);
		m1();
		Second a2 = new Second();
		
		System.out.println(a2.a1);
		a2.m2();
		
		
	}
}
