import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt(); 
		int sum = 0;
			
			for (int i = 1; i <= a ; i++) {	// 입력받은 정수 a가 인덱스 1부터 인덱스 a만큼 1씩 커지는 반복
				sum += i;					// sum = sum + i; 인덱스0번부터 a번까지 모두 더한다.
			}
			
			System.out.println(sum);
	}
}
