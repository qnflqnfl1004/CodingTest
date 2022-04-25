import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		for (int i = 0; i < a; i++) {	//  행 : 인덱스 0부터 입력받은 a 까지 반복
			for (int j = 0; j <= i; j++) {	// 열 : 열은 행 인덱스(i)만큼 반복해서 *을 찍는다.
					System.out.print("*");
			}
			System.out.println();	// 한 행의 출력이 끝나면 줄바꿈을 해준다.
		}
	}
}