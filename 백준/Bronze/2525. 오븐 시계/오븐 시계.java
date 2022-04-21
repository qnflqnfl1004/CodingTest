import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int h = sc.nextInt(); // 시
		int m = sc.nextInt(); // 분
		int t = sc.nextInt(); // 필요 시간
		
		h += t / 60; 	// 시 = 시 + (필요시간 / 60); 시간에(h) 필요시간(t)을 분에서 시간으로 바꾼 값을 더해준다.
		m += t % 60;	// 분 = 분 + (필요시간 % 60); 필요시간(t)에서 60분을 나눴을 때 나머지 값을 분(m)과 더해준다. (60분보다 작을경우 나누지 못하니까 나머지는 필요시간 그대로)
		
		if(m >= 60) {	// 여기서 만약 분(m)이 60분 이상일 경우
			h += 1;		// 시 = 시 + 1; 위의 시간(h)값에 1시간을 더해주고,
			m -= 60; 	// 분 = 분 - 60; 위의 분(m)값에 60분을 빼준다.
		}
		if(h >= 24) {	// 시간이 24시 이상일 경우
			h -= 24;	// 시 = 시 - 24;  시간에서 24시를 빼준다.(24 == 0)
		}
		
			System.out.println( h + " " + m);
		
		sc.close();
	}
}

