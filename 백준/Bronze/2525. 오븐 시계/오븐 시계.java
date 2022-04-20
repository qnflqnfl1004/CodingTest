import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int h = sc.nextInt(); // 시
		int m = sc.nextInt(); // 분
		int p = sc.nextInt(); // 필요 시간
		int sum = m + p;	// 현재 분 + 필요시간
		
		
		h += sum / 60; 	// 시 = 시 + (분 + 필 / 60) // {분 + 필)은 60분으로 나눠 시간으로 계산한 값에 현재 시간을 더한다.}
		m += p - (60 * (sum / 60)); // 분 = 분 + 필 - (60 * ((분 + 필) / 60)) // {분 + 필)은 60분으로 나눠 시간으로 계산한 값(정수)에 60분을 곱하고 sum값에서 뺀다.  
		
		if ( h >= 24) 	//	h += sum / 60; 여기서 계산한 값이 24시간 이상일 때
			h -= 24;		// 시 = 시 - 24;	 
			
			System.out.println( h + " " + m);

		
		
		sc.close();
	}
}