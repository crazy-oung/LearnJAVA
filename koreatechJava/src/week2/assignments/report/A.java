package week2.assignments.report;

//public class A {

//
////	public void func(int x) {
////		System.out.println("void func(int);");
////	}
//
////	public int func(int x) {
////		System.out.println("int func(int);");
////		return x + 5;
////	}
//
//	public void func(int a, int b) {
//		System.out.println("void func(int, int);");
//
//	}
//
//	public void func(float f) {
//		System.out.println("void func(float);");
//	}
//
//	public void func(double f) {
//		System.out.println("void func(double);");
//
//	}
//
//	public static void test(A a) {
//		a.func(10);
//		a.func(1.5);
//	}
//
//	public static void main(String[] args) {
//		A a = new A();
////		a.func((float)2.5);
//		test(a);
//	}
//
//}

public class A {
	private int x;
	private int y;

	public A(int xx, int yy) {
		setX(xx);
		setY(yy);
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public void setX(int xx) {
		x = xx;
	}

	public void setY(int yy) {
		y = yy;
	}
}
