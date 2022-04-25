import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		for (int i = 0; i < a; i++) {	//  행 : 인덱스 0부터 입력받은 a 까지 반복
			for (int j = 0; j < a; j++) {	// 열 : 인덱스 0부터 입력받은 a 까지 반복
				if(j <= i) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}