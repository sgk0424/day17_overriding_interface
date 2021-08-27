package Interface;

import java.util.Scanner;

interface A공방{
	public void attack();//공격을 만드세요
	public void defense();//방어를만드세요
}
class AA지상군 implements A공방{

	@Override
	public void attack() {
		
	}

	@Override
	public void defense() {
		
	}
	
}
public class Ex07 {
	public static void main(String[] args) {
		/*
		AA지상군 a=new AA지상군();
		BB공군 b=new BB공군();
		*/
		AA지상군 지상군=new AA지상군();
		BB공군 공군=new BB공군();
		Scanner input=new Scanner(System.in);
		int num=0,choice=0;
	}

}
