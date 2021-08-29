package inteface;

class A지상군{
	public void 공격(){
		System.out.println("지상군이 공격합니다");
	}
	public void 방어(){
		System.out.println("지상군이 방어합니다");
	}
	public void 총공격() {}
	public void 살짝건들기() {}
	public void 총알장전() {}
}
class B공군{
	public void 비행기공격(){
		System.out.println("공군이 공격합니다");
	}
	public void 비행기방어(){
		System.out.println("공군이 방어합니다");
	}
}
public class Ex06 {

	public static void main(String[] args) {
		A지상군 a = new A지상군();
		B공군 b = new B공군();
	}

}
