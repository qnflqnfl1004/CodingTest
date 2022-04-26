import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()) {				// while ( sc.hasNext() ) 로 무한 반복 한다. sc.hasNext()는 다음에 입력받는 값이 있으면 a,b를 출력받고
											// 합을 출력하는 과정을 반복한다. 입력받는 값이 있는지 확인하는 방법은 sc.hasNext(), sc.hasNextInt()가 있다.
				int a = sc.nextInt();	
				int b = sc.nextInt();	
				
				System.out.println(a + b);	// 입력받은 a 와 b 를 더해준다.
			
			}
		
	}
}

