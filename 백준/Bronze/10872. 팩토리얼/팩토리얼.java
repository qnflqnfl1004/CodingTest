import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int pact = 1;			// 팩토리얼은 !로 표시하는데 3!이면 1*2*3 = 으로 6이다.
		
		for (int i = 1; i <= n; i++) {
			
			pact *= i;
		}
		
		System.out.println(pact);
	}

}
