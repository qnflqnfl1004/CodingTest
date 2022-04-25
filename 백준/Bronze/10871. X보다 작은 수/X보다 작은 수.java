import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();	// 정수 n개
		int x = sc.nextInt();	// 커트라인
		
		for (int i = 0; i < n; i++) {	// 0부터 정수 n까지 반복
			int a = sc.nextInt();	// 수열 a 출력
			
			if(a < x) {				// 수열 a가 커트라인 x 보다 작을 때 출력
				System.out.print(a + " ");
			}
		}
	}
}