import java.io.BufferedReader;
/* BufferedReader 사용을 위해서 java.io.BufferedReader 클래스를 import 한다
Enter를 경계로 인식하고 받은 데이터는 String으로 고정된다.*/
import java.io.InputStreamReader;
/* byte 단위 데이터를 문자 단위 데이터로 처리할 수 있도록 변환해주기 위해서 
InputStreamReader를 사용한다.
InputStreamReader 사용을 위해서 java.io.InputStreamRead 클래스를 import 한다. */
import java.io.IOException;
/* 예외처리를 위해서 IOException를 사용한다
IOException 사용을 위해서 java.io.IOException 클래스를 import 한다*/
import java.util.StringTokenizer;
/* 공백 단위로 호출하기 위해서 StringTokenizer를 사용한다
StringTokenizer를 사용하기 위해서
StringTokenizer java.util.StringTokenizer 클래스를 import 한다. */

public class Main {
// 접근제어자 public으로 Main 클래스를 선언한다
	public static void main(String[] args) throws NumberFormatException, IOException{
	// 접근제어자 public으로 메모리에 상주하게 리턴값이 없이 main 함수를 선언한다	
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// BufferReader 객체 br를 선언한다
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		// StringTokenizer 객체 st를 선언한다 이제 공백으로 값을 입력받을 수 있다.
		
		int N = Integer.parseInt(st.nextToken());
		// int 형 변수 N를 선언하고 값을 공백 단위로 구분해서 입력받는다.
		int bag = 0;
		// int 형 변수 bag를 선언하고 0으로 초기화한다
		
		while(true) {
		// while 반복문을 선언한다.
			if(N%5==0) {
			// N%5가 0일때 코드가 실행된다.
				bag += N/5;
				// N/5 값을 bag에 저장한다.
				System.out.println(bag);
				// bag 값을 출력한다
				break;
				// while 문을 빠져나온다
			}
			else {
				N-=3;
				// N-3한 값을 변수 N에 저장한다.
				bag++;
				// bag+1한 값을 변수 bag에 저장한다.
			}
			if(N<0) {
			// N<0 일때 괄호안의 코드가 실행된다.
				System.out.println("-1");
				// -1이 출력된다
				break;
				// while 문을 빠져온다.
			}
		}
		
	}
}