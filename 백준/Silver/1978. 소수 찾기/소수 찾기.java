import java.math.BigInteger;
import java.util.Scanner;

public class Main {
// 접근제어자 public으로 Main 클래스를 선언한다
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // 케이스 수
		int cnt = 0;	// 소수 카운트
		
		for (int i = 0; i < n; i++) {
			int k = sc.nextInt(); // n 만큼 입력받음
			boolean isPrime = true;
			
			if(k == 1)
				continue;	// 1은 소수가 아니므로 넘어간다.
			
			for (int j = 2; j <= Math.sqrt(k); j++) {	// Math.sqrt() 함수는 제곱근을 구하는 함수이다.
				if(k % j == 0) {
					isPrime = false;	// k를 j로 나눠서 나눠떨어지면 소수가 아니다.
				}
				
			}
			if(isPrime) {
				cnt++;
			}
		}
		
		System.out.println(cnt);
		
	}
}