import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		String b = sc.next();
		
		sc.nextLine();
		
		System.out.println(a * (b.charAt(2) - '0')); // - '0'을 하는 이유는 문자열에서 문자로 지정된 숫자가 아닌 정수로 출력하기 위한 것
		System.out.println(a * (b.charAt(1) - '0'));
		System.out.println(a * (b.charAt(0) - '0'));
		System.out.println(a *  Integer.parseInt(b)); // 문자열에서 정수형으로 바꾸는 것
	}

}