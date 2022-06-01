import java.math.BigInteger;
import java.util.Scanner;

public class Main {
// 접근제어자 public으로 Main 클래스를 선언한다
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		BigInteger a = new BigInteger(sc.next());
		BigInteger b = new BigInteger(sc.next());
		
		System.out.println(a.add(b));
	}
}