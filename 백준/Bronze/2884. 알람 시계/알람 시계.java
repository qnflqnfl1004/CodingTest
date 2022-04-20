import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int h = sc.nextInt();
		int m = sc.nextInt();
		
		if(m < 45) { 		// 분이 45분보다 작을 때 
			h--;			// 시간에서 1시간 씩 빼주고
			m = (m + 60) - 45; // 분에서 60을 더한 다음 45분을 빼준 값을 m에 대입
			
			if(h < 0) {		// h--;에서 음수가 될 때
				h = 23;			// 시간은 23시이다.
			}
			System.out.println(h + " " + m); 
			
		} else { 			// 나머지 분이 45분보다 클 때
			System.out.println(h + " " + (m - 45)); 	// 시간 (분에서 45분을 빼준 값)
		}
		sc.close();
	}

}