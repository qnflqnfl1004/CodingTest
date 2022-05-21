import java.util.Scanner;

 public class Main { 							// 접근제어자 public으로 Main 클래스를 선언한다.
	public static void main(String args[]) {	// 접근제어자 public으로 메모리에 상주하게 반환값이 없이 main 함수를 선언한다.
		
		Scanner sc = new Scanner(System.in);
		
		String st[] = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
		
		String str = sc.nextLine();		// 문자열을 입력 받는다.
		
		for (int i = 0; i < st.length; i++) {	// 배열길이 만큼 반복
			if(str.contains(st[i])) {			// 배열에 있는 단어가 입력받은 문자열에 있는지 확인. 있으면 true가 리턴되어 if문 실행
				
				str = str.replace(st[i], "0");	// 해당되는 단어 str[i]은 하나의 개수로 카운트 해야하므로 "0"으로 변환.
												// (숫자로 변환하는 이유 : 알파벳으로 변환하면 다음 검사때 중복카운트될 수 있기 때문)
			}
		}
		System.out.println(str.length());		// 입력받은 문자열의 변환된 후의 길이를 출력 ex) ljes=njak --> 0e00ak 길이는 6
	}

}