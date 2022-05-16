import java.util.Scanner;

public class Main { 							// 접근제어자 public으로 Main 클래스를 선언한다.
	public static void main(String[] args){	// 접근제어자 public으로 메모리에 상주하게 반환값이 없이 main 함수를 선언한다.
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();		// 테스트 케이스 수를 입력 받는다.
		
		
		for (int i = 0; i < t; i++) {	// 테스트 케이스 수 만큼 반복
			
			int r = sc.nextInt();		// 문자열의 문자 반복 횟수를 입력받는다.
			
			String s = sc.next();		// 문자열을 입력받는다.
			
			for (int j = 0; j < s.length(); j++) {	// 크게 첫번째 인덱스 문자 부터 문자열의 길이만큼 반복 한다. (2)
				for (int k = 0; k < r; k++) {		// 작게 반복 횟수 만큼 먼저 반복 하고 (1)
					
					System.out.print(s.charAt(j));	// 문자열의 문자 출력
				
				}
			}
			System.out.println();
		}
		sc.close();
	}
}