import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();		// 피보나치 공식 Fn = Fn-1 + Fn-1( 0번째 피보나치 수는 0이고, 1번째 피보나치 수는 1이다.)
		
		System.out.println(fn(n));
		
	}
	
	static int fn(int n) {
		
		if(n == 0)
			return 0;
		else if(n == 1)
			return 1;
		
		return fn(n - 1) + fn(n - 2);
		
	}

}
