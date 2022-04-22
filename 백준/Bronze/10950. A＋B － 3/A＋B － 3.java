import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt(); 
		
			
			for (int i = 0; i < a ; i++) {	// 입력받은 정수 a가 인덱스 1부터 인덱스 a만큼 1씩 커지는 반복
			
				int b = sc.nextInt();
				int c = sc.nextInt();
				
				System.out.println(b + c);
			}
	}
}