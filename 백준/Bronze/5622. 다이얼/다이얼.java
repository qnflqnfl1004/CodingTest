import java.util.Scanner;

 public class Main { 							// 접근제어자 public으로 Main 클래스를 선언한다.
	public static void main(String args[]) {	// 접근제어자 public으로 메모리에 상주하게 반환값이 없이 main 함수를 선언한다.
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();		// 문자열을 입력 받는다.
		
		int count = 0;				// 시간을 계산해서 넣을 변수
		
		for (int i = 0; i < str.length(); i++) {	// 문자열 길이 만큼 반복
			
			
			switch(str.charAt(i)) {							// 문자열에서 문자에 해당되는 case 문 
					case 'A' :	case 'B' :	case 'C' :		// 문자열에서 문자를 갖고오기 때문에 ""가 아닌 ''
						
						count += 3;							// 해당되는 문자의 시간을 다 더해주어야 하기 때문에 +=
					
						break;
						
					case 'D' :  case 'E' :  case 'F' :
						
						count += 4;
					
						break;
						
					case 'G' :  case 'H' :  case 'I' :
						
						count += 5;
					
						break;
						
					case 'J' :  case 'K' :  case 'L' :
						
						count += 6;
					
						break;
						
					case 'M' :  case 'N' :  case 'O' :
						
						count += 7;
					
						break;
					
					case 'P' :  case 'Q' :  case 'R' :  case 'S' :
						
						count += 8;
					
						break;
						
					case 'T' :  case 'U' :  case 'V' :
						
						count += 9;
					
						break;
						
					case 'W' :  case 'X' :  case 'Y' :  case 'Z' :
						
						count += 10;
					
						break;
							
			}
		
		}
		
		System.out.println(count);
	}

}