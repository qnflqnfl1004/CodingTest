import java.util.Scanner;

public class Main { 							// 접근제어자 public으로 Main 클래스를 선언한다.
	public static void main(String[] args){	// 접근제어자 public으로 메모리에 상주하게 반환값이 없이 main 함수를 선언한다.
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();	// 정수의 갯수를 입력받는다 
		
		String num = sc.next();	// 정수의 갯수만큼 정수를 입력받아 num에 저장.
		
		int sum = 0;	// 정수들을 더한값을 저장할 변수
		
		for (int i = 0; i < n; i++) {	// 정수 갯수만큼 반복
			
			sum += num.charAt(i) - '0';	// 입력받은 문자열 num을 한개의 인덱스로 합하여  sum에 저장하고 - '0'을 해주어 문자 값을 숫자로 변환한다.
		}
		
		System.out.println(sum);
	}
	
}