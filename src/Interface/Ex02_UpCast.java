package Interface;
class Parents{
	public void familyName() {
		System.out.println("��");
	}
	public void name() {
		familyName();
		System.out.println("����");
	}
}
class Daughter extends Parents{
	public void name() {
		familyName();
		System.out.println("����");
	}
}
class Son extends Parents{
	public void name() {
		familyName();
		System.out.println("�Ɽ");
	}
}
public class Ex02_UpCast {
	public static void main(String[] args) {
	Parents par=new Parents();
	par.name();
	Daughter d=new Daughter(); d.name();
	Son s=new Son(); s.name();
	
	System.out.println("---------------");
	par = new Daughter();
	par.name();
	par = new Son(); 
	par.name();
	}

}
