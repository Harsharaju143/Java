package Ironman;

public class Third {
	int a;
	String s;
	String s1;
	Third(int a, String s, String s1){
		this.a = a;
		this.s = s;
		this.s1 = s1;
	}
	public static void main(String[] args) {
		Third a1 = new Third(19,"Hello..","Hmm...!");
		System.out.println(a1.a);
		System.out.println(a1.s);
		System.out.println(a1.s1);
	}
}
