package inteface;
class A{
	public void print() {
		System.out.println("AŬ����");
	}
}
class B extends A{
	public void print() {
		System.out.println("BŬ����");
	}
}
class C extends A{
	public void print() {
		System.out.println("CŬ����");
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
