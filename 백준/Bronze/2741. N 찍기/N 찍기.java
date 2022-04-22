import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int sum = 0;
		
		for (int i = 1; i <= a; i++) { // 1부터 정수a  만큼 1씩 증가 반복
			sum += i;				   // sum = sum + i
			
			System.out.println(i);
		}
	}
}
