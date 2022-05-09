import java.util.Scanner;

public class Main { 							// 접근제어자 public으로 Main 클래스를 선언한다.
	public static void main(String[] args) {	// 접근제어자 public으로 메모리에 상주하게 반환값이 없이 main 함수를 선언한다.
		
		boolean[] boo= new boolean[10001];		// boolean 형 배열 boo를 선언한다. 배열의 길이는 1~10000이다.
		 
		// 10000보다 큰 숫자 제거하기
		for (int i = 0; i < 10001; i++) {		// 10000까지 반복문
			
			int n = Sn(i);						// Sn(i)함수를 변수 n에 대입
			
			if (n <= 10000) {					// n이 10000이하 일때 괄호안 코드 실행
				boo[n] = true;					// boo에 저장된 값을 true로 반환
			}
			
		}
		
		for (int i = 1; i < boo.length; i++) { 	// 1 ~ 10000까지인 반복문 선언
			if(!boo[i]) {						// boo[i]값이 false 혹은 0일때 괄호안 코드 실행
				System.out.println(i);  		// 변수 i값이 출력
			}
		}
		
	}
	
	// 셀프 넘버 아닌 수 구하기
	private static int Sn(int i) {				// 함수 Sn를 선언한다. int형 변수 i의 값을 입력받게 된다.
		int c = i;								// 변수 i를 c에 저장
		
		while(i > 0) {							// i가 0보다 클 때 무한반복문
			c += i % 10;						// 변수 i를 10으로 나눈 나머지 값을 변수 c에 저장된 값에 더하고 그값을 변수 c에 저장한다.
			
			i /= 10;							// 변수 i를 10으로 나눈다.
			
		}
		
		return c;								// 변수 c 반환
		
	}
}