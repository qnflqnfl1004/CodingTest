import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();				// 정수 입력받기
		int l = n / 10;						// 정수의 십의 자리수를 10으로 나눈 값
		int r = n % 10;						// 정수의 일의 자리수 10으로 나눴을 때 나머지 값
		int count = 1;						// 사이클 카운트 해주는 변수
		int temp = l + r; 					// 각 자리수의 합
		int result = (r * 10) + temp;		// 일의 자리수를 십의 자리수로 옮기기위해 10을 곱하고 각 자리수의 합을 더해준다. 
		
		
		while(n != result) {				// 결과값이 처음 입력해 준 정수와 같을 때까지 무한 반복
			
			l = r;							// 결과값의 십의 자리가 계산 전 일의 자리수이다.
			r = result % 10;				// 다시 결과갑스이 일의 자리를 구하기 위해 10으로 나눈 나머지를 구한다.
			
			temp = l + r;
			result = (r * 10) + (temp % 10); // 각각 오른쪽에 있는 수를 결합해 result 값을 구한다.
			
			count++;						// 한 사이클동안 몇번 반복이 되는지 세어본다.
			
		}
		
		System.out.println(count);
		
	}
}
