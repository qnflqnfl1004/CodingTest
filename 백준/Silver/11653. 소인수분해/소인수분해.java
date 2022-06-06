import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
		 
		 int n = sc.nextInt();
		 
		 int i = 2;	// 어떤 수든 2부터 나눠지는지 판별할 것이므로 나누는 수는 2로 초기화
		 
		 while(true) {
			 
			 if(n == 1)	// 정수 n을 계속 나누고 더이상 나눌 수 없을 때(몫이 1이 될 때) while문을 나간다.
				 break;
			 
			 if(n % i == 0) {	// n이 i(최초 2)로 나눠떨어지면 
				 n /= i;		// n을 i로 나눈 몫으로 바꾸고
				 System.out.println(i);	// i출력
			 } else {	// 나눠지지 않으면 i값을 1 높여서 검사한다.
				 i++;
			 }
			 
		 }
	}

}