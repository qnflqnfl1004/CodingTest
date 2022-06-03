import java.util.Scanner;

public class Main {
// 접근제어자 public으로 Main 클래스를 선언한다
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		int m = sc.nextInt();
		int n = sc.nextInt();
		int min = n;
		int sum = 0;
		
		
		for (int i = m; i <= n; i++) {
			
			boolean check = true; // 소수인지 확인할 변수
			
			if(i == 1) check = false;	// 1은 소수가 아니므로 check에 false 저장.
			
			for (int j = 2; j < i; j++) { // 2부터 	
				
				if(i % j == 0) {
					
					check = false;	// i를 j로 나눠서 나눠떨어지면 check에 false를 저장하고 반복 종료.
					
					break;
					
				}
				
			}
			if(check) {		// check가 true라면 실수이니 합하고, 최솟값 저장
					if(min > i) min = i;
					
					sum += i;
				
			}
		}
		
		if(sum == 0) {
			System.out.println(-1);
		} else {
			System.out.println(sum + "\n" + min);
		}
		
	}
}