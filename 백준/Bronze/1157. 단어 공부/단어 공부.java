import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main { 							// 접근제어자 public으로 Main 클래스를 선언한다.
	public static void main(String[] args) throws IOException{	// 접근제어자 public으로 메모리에 상주하게 반환값이 없이 main 함수를 선언한다.
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s = br.readLine().toUpperCase();	// 입력값을 대문자로 바꿔서 s에 저장
		
		int max = 0;		// 알파벳 중복 개수의 최대값을 저장할 변수
		
		String result = "";	// 중복 개수가 최대값인 알파벳을 저장할 변수
		
		while(true) {		// 무한루프(알파벳 개수는 26개이기 때문에 26번 반복하는 반복문을 만들어도 된다.
			
			String index = String.valueOf(s.charAt(0));	// 현재 문자열의 0인덱스 값을 문자값으로 index에 저장
			
			int size = s.length();	// 현재 문자열의 길이를 size에 저장
			
			s = s.replace(String.valueOf(s.charAt(0)), "");	// 0인덱스 값을 문자열에서 제외(0인덱스를 ""으로 바꿔줌)
			
			int newsize = s.length();	// 제외한 후의 문자열길이를 newsize에 저장.
			
			// 두 길이의 차가 중복개수
			if(max == (size - newsize)) {	// 중복개수가 최대값과 같으면
				result += index;			// result에 알파벳을 더한다.
			}
			
			if(max < (size - newsize)) {	// 증복개수가 최대값보다 크면
				max = (size - newsize);		// 최대값에 중복개수를 저장하고,
				result = index;				// result에 알파벳을 저장.
			}
			
			if(s.equals("")) break;		// 문자열을 다 비우게 되면 무한루프 종료.
		}
		
		if(result.length() == 1) {		// result 에 알파벳이 1개이면
			System.out.println(result); // result 출력
			
		} else {						// 아니면
			System.out.println("?");	// ? 출력.
		}

	}
}