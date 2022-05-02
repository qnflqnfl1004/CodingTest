import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[10];
		boolean bl; 	// n번째와 n + 1번 째랑 비교하기 위한 변수
		int cnt = 0; 	// 서로 다른 나머지들의 개수를 측정하기 위한 변수
		
		
		for (int i = 0; i < arr.length; i++) {
			
			arr[i] = sc.nextInt() % 42;
			
		}
		
		for (int i = 0; i < arr.length; i++) {
			
			bl = false;		// 기본값을 false로 설정
			
			for (int j = i + 1; j < arr.length; j++) {
				
				if( arr[i] == arr[j] ) {	// 배열의 n번째와 n + 1번째가 같을 경우
					
					bl = true;	// 같다면 값을 true로 변경
					
					break;		// 한번만 비교하면 되니 조건이 성립하면 벗어난다.
					
				}
			}
				if( bl == false ) {
					
					cnt++; 		// bl의 값이 false일 때 카운트를 1증가
				} 				// 만약 값이 true이면 나머지가 서로 같다는 뜻이니 카운트 x
			}
		
		System.out.println(cnt);
	}
}
