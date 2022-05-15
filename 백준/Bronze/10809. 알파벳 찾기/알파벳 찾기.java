import java.util.Scanner;

public class Main { 							// 접근제어자 public으로 Main 클래스를 선언한다.
	public static void main(String[] args){	// 접근제어자 public으로 메모리에 상주하게 반환값이 없이 main 함수를 선언한다.
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		
		
		for (char i = 'a'; i <= 'z'; i++) {		// 알파벳 a부터 z까지 반복
			
				System.out.print(str.indexOf(i) + " ");		// indexLf() 는 특정 문자의 위치를 반환하며, 존재하지 않을 경우 -1을 반환하는 메서드
			
		}
	}
	
}