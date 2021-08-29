package inteface;
interface test{
	public int num=4000;
	public static int num2=5555;
	public static final int num3=5555;
}
class AAAA{
	public static final int aaa = 5000;
	public static final String KOREA = "¥Î«—πŒ±π";
}
public class Ex08 {
	public static void main(String[] args) {
		//test.num = 7878;
				System.out.println( test.num );
				//AAAA.aaa = 7878;
				System.out.println( AAAA.aaa );
	}

}
