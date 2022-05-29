import java.util.Scanner;

public class Main {
// 접근제어자 public으로 Main 클래스를 선언한다
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int cross_cnt = 1;
		int prev_cnt_sum = 0;
		
		while (true) {
			
			
			// 직전 대각선 누적합 + 해당 대각선 개수 이용한 범위 판별
			if(n <= prev_cnt_sum + cross_cnt) {
				
				if(cross_cnt % 2 == 1) { // 대각선의 개수가 홀수라면
					// 분모가 큰 수 부터 시작
					// 분모는 대각선 개수 - ( n 번째 - 직전 대각선까지의 누적합 - 1)
					// 분자는 n 번째 - 직전 대각선까지의 누적합
					System.out.print((cross_cnt - (n - prev_cnt_sum - 1)) + "/" + (n - prev_cnt_sum));
					break;
				}
				
				else { // 대각선의 개수가 짝수라면
					// 홀수일 때의 출력을 반대로 
					System.out.print((n - prev_cnt_sum) + "/" + (cross_cnt - (n - prev_cnt_sum - 1)));
					break;
				}
				
			} else {
				prev_cnt_sum += cross_cnt;
				cross_cnt++;
				
			}
			
		}
	}
}