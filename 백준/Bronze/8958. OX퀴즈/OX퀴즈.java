import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        	// 반복할 숫자 입력
		int n = scan.nextInt();
		
		for(int i = 0; i < n; i++) {
			// 데이터 입력 받고 char 배열로 변환 
			char[] arr = scan.next().toCharArray();
			// 점수를 계산할 변수와 총 합을 담을 변수를 선언 
			int num = 0, sum = 0;
			// 배열에 담긴 값 비교
			for(char c : arr) {
				if(c == 'O') {
					num++;
					sum += num;
				} else {
					num = 0;
				}
			}
			System.out.println(sum);
		}
		
	}
}