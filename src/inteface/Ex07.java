package inteface;
import java.util.Scanner;

interface A����{
	public void attack();//������ ���弼��
	public void defense(); //�� ���弼��
}
class AA���� implements A����{
	public void attack() {
		System.out.println("���� ����");
	}
	public void defense() {
		System.out.println("���� ���");
	}
}
class BB���� implements A����{
	public void attack() { 
		�����غ�();
		System.out.println("���� ����");
	}
	public void defense() {	System.out.println("���� ���");}
	public void �����غ�() {
		System.out.println("�����غ�");
	}
	public void �����غ�10����() {}
	public void ����غ�() {}
}
public class Ex07 {
	public static void main(String[] args) {
		/*
		AA���� a = new AA����();
		BB���� b = new BB����();
		
		a.attack(); a.defense();
		b.attack(); b.defense();
		
		A���� aa = new BB����();
		aa.attack();
		*/
		AA���� ���� = new AA����();
		BB���� ���� = new BB����();
		A���� ����=null;
		Scanner input = new Scanner(System.in);
		int num=0, choice=0;
		System.out.println("���� ó��� �Խ��ϴ�");
		System.out.println("1.���� 2.����");
		num = input.nextInt();
		if(num == 1) {
			���� = new AA����();
			System.out.println("���󱺼��� �Ͽ����ϴ�");
		}else {
			���� = new BB����();
			System.out.println("�������� �Ͽ����ϴ�");
		}
		System.out.println("1.���� 2.���");
		choice = input.nextInt();
		if(choice == 1) {
			����.attack();
		}else {
			����.defense();
		}
		/*
		if(choice == 1 && num== 1) {
			//System.out.println("������ ������ �մϴ�");
			����.attack();
		}else if(choice == 2 && num == 1) {
			//System.out.println("������ �� �մϴ�");
			����.defense();
		}
		if(choice == 1 && num== 2) {
			//System.out.println("������ ������ �մϴ�");
			����.attack();
		}else if(choice == 2 && num == 2) {
			//System.out.println("������ �� �մϴ�");
			����.defense();
		}
		*/
	}

}
