import java.util.Scanner;

public class Main { 							// 접근제어자 public으로 Main 클래스를 선언한다.
	public static void main(String[] args){	// 접근제어자 public으로 메모리에 상주하게 반환값이 없이 main 함수를 선언한다.
		
		Scanner sc = new Scanner(System.in);
		
		int ch = sc.next().charAt(0); // next() -> String 값을 한자릿수로 입력받아 int형 변수 ch에 저장 
		
		System.out.println(ch);	// int형 타입이므로 아스키코드로 출력됨.
	}
	
}