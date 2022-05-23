import java.util.Scanner;

 public class Main { 							// 접근제어자 public으로 Main 클래스를 선언한다.
	public static void main(String args[]) {	// 접근제어자 public으로 메모리에 상주하게 반환값이 없이 main 함수를 선언한다.
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();	// 불변 비용
		int b = sc.nextInt();	// 가변 비용
		int c = sc.nextInt();	// 상품 가격(불변 + 가격)
		
		if(c <= b) {
			
			System.out.println("-1");	// 가변비용이 상품 가격보다 크면 팔수록 적자이기 때문에 손이기이 날 이유가 없음
			
		} else {
			
			System.out.println(a / (c - b) + 1);	// 손익 분기점 계산
			
		}
	}

}
 
 