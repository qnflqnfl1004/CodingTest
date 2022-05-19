import java.util.Scanner;

 public class Main { 							// 접근제어자 public으로 Main 클래스를 선언한다.
	public static void main(String args[]) {	// 접근제어자 public으로 메모리에 상주하게 반환값이 없이 main 함수를 선언한다.
		
		Scanner sc = new Scanner(System.in);
		
		String a = sc.next();
		String b = sc.next();
		
		StringBuffer A = new StringBuffer(a);
		StringBuffer B = new StringBuffer(b);
		String stra = A.reverse().toString();
		String strb = B.reverse().toString();
		
		int strA = Integer.parseInt(stra);
		int strB = Integer.parseInt(strb);
		
		if(strA > strB) {
			System.out.println(strA);
		} else {
			System.out.println(strB);
		}
		
	}
}
 