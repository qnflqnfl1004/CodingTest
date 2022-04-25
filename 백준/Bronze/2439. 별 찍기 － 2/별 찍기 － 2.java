import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		for (int i = 1; i <= a; i++) {	//  행 : 1부터 입력받은 a 까지 반복
			for (int j = 1; j <= a - i; j++) {	// 열 : 1부터 a - i 까지 반복(첫 번째줄 공백 4개니까 a(5) - 1, 두번째줄 공백 3개 a(5) - 2 즉 a - i를 해준다.)  
				System.out.print(" ");			// 공백 찍기
			}
			
			for (int s = 0; s < i; s++) {	// 인덱스 0부터 a 개수 만큼 출력하면 되니 0부터 i번째 까지 반복 
				System.out.print("*"); 		// 별 찍기
			}
			System.out.println();	// 한 행의 출력이 끝나면 줄바꿈을 해준다.
		}
	}
}