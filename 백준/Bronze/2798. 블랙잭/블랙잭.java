import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()); // 카드 개수
		int M = Integer.parseInt(st.nextToken()); // 제시된 숫자
		
		int[] nums = new int[N];
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++)
			nums[i] = Integer.parseInt(st.nextToken());
		
		int sum = 0;
		int check = 300000;
		int answer = 0;
		loopOut:
		for(int i = 0; i < N-2; i++) {
			for(int j = i+1; j < N-1; j++) {
				for(int k = j+1; k < N; k++) {
					sum = nums[i] + nums[j] + nums[k];
					if(sum == M) { // 합이 M과 같을 경우
						answer = sum;
						break loopOut;
					}
					if(sum > M) {} // 합이 M보다 클 경우
					else if(M-sum < check) {
						check = M-sum;
						answer = sum;
					}
				}
			}
		}
		System.out.println(answer);
	}
}