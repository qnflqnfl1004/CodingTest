import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int sum = 0;
		
		for (int i = a; i >= 1; i--) { // 정수 a부터 1까지 1씩 감소 반복
			sum -= i;				   // sum = sum - i
			
			System.out.println(i);
		}
	}
}

