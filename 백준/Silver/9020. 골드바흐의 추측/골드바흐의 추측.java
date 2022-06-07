import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		for (int i = 0; i < t; i++) {
			
			int n = sc.nextInt();
			
			int div, rem; 	// 두 수의 차이가 가장 작은 것을 출력해야 하므로 n의 절반값부터 검사
			div = n / 2;
			rem = n - div;
			
			while(true) {
				if(isPrime(div) && isPrime(rem)) { // 두 수가 소수인지 판별
					break;	// 소수면 break로 while 문 빠져 나감
				} else {
					div--;	// 처음 나눈 반이 소수가 아니면 하나는 낮추고 하나는 높여서 다시 검사
					rem++;
				}
			}
			System.out.println(div + " " + rem);
			
		}
	}
	static boolean isPrime(int n) {
		
		boolean check = true;
		
		for (int i = 2; i <= Math.sqrt(n); i++) {
			
			if(n % i == 0)	// n이 2 이상에서 나눠 떨어지면 소수가 아니다.
				check = false;
			
		}
		return check;	// 소수면 true 리턴
		
	}

}