import java.util.Scanner;

public class Main {
// 접근제어자 public으로 Main 클래스를 선언한다
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		for (int i = 1; i <= t; i++) {
			
			int k = sc.nextInt();	// k층
			int n = sc.nextInt();	// n호
			
			int [][] apart = new int[15][15];
			
			// 0층 호수에 맞게 사람 넣기
			for (int j = 1; j <= 14; j++) {
				
				apart[0][j] = j;
			}
			
			// k층 1호는 모두 1
			for (int j = 1; j <= 14; j++) {
				
				apart[j][1] = 1;
				
			}
			
			// 1층부터 14층까지
			for (int j = 1; j <= 14 ; j++) {
				
				// 2호부터 14호까지
				for (int j2 = 2; j2 <= 14; j2++) {
					// j-1층의 아래값과 j2-1호의 값을 합쳐서 넣는다.
					apart[j][j2] = apart[j][j2 - 1] + apart[j -1][j2];
					
				}
				
			}
			
			System.out.println(apart[k][n]);
		}
		
	}
}