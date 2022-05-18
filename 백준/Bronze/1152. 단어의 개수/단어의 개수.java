import java.util.Scanner;

 public class Main { 							// 접근제어자 public으로 Main 클래스를 선언한다.
	public static void main(String args[]) {	// 접근제어자 public으로 메모리에 상주하게 반환값이 없이 main 함수를 선언한다.
		
		Scanner sc = new Scanner(System.in);	// 영어 대소문자와 공백으로 이루어진 문자열을 입력받는다.
		
		String S = sc.nextLine().trim();		// 입력받은 문자열을 S에 저장하고 문자열 앞 뒤에 공백이 없는(제거) 문자열을 반환한다
		
		if(S.isEmpty()) {						// 문자열이 비어있으면
			
			System.out.println('0');			// 0 을 출력
			
		} else {								// 아니면
			
			System.out.println(S.split(" ").length); 	// 문자열을 공백으로 자르고 length를 사용하여 개수를 출력.
			
		}
		
	}
}
 