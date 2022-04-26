import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {					// while ( true ) 로 무한 반복 한다.
			
				int a = sc.nextInt();	
				int b = sc.nextInt();	
				
				if(a == 0 && b == 0) {	// 만약 a와 b 가 둘 다 0 일경우 break;를 통해 반복문을 종료해준다.
					break;
				}
				
			System.out.println(a + b);	// 아닐경우 입력받은 a 와 b 를 더해준다.
			
			}
	}
}


