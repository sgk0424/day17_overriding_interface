package inteface;
class A{
	public void print() {
		System.out.println("A클래스");
	}
}
class B extends A{
	public void print() {
		System.out.println("B클래스");
	}
}
class C extends A{
	public void print() {
		System.out.println("C클래스");
	}
}
public class Ex01_Upcast {

	public static void main(String[] args) {
		/*B b = new B();
		b.print();
		C c = new C();
		c.print();
		*/
		A a = new B();
		a.print();
		a = new C();
		a.print();
	}

}
