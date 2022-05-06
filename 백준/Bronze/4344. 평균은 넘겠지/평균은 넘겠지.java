import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();			// 테스트 케이스 수 입력받기
		
		for (int i = 0; i < c; i++) {
			
			int[] s = new int[sc.nextInt()]; // 학생들의 점수를 담을 학생 수 입력받기
			int sum = 0; 					 // 학생들의 총 점수
			int avg = 0;					 // 학생들의 평균 점수
			int cnt = 0;					 // 평균 이상의 학생 수 
			float avg2 = 0;					 // 평균 점수보다 높은 학생수 비율(%)
			
			for (int j = 0; j < s.length; j++) { // 입력받은 학생 수 만큼 반복하여 s 배열의 인덱스에 각각의 점수 저장
				
				s[j] = sc.nextInt();	// 입력받은 값을 s배열에 저장
				sum += s[j];			// 학생들의 총 점수를 sum에 저장
			}
			
			avg = sum / s.length;		// 총 점수/학생 수를 계산하여 평균 점수를 avg에 저장
			
			for (int k = 0; k < s.length; k++) {
				if(s[k] > avg) {		// 평균 점수보다 높은 점수일때
					cnt++;				// 학생 수를 카운트 한다.
				}
			}
			
			/*
			 *  소수점 셋째 자리까지 출력해야 하므로 학생 수(cnt)를 float으로 형변환 해준 뒤 
			 *  (평균 점수 보다 높은 학생 수/총 학생 수)를 계산하고 100을 곱해주면 평균을 넘는
			 *  학생들의 비율을 알아낼 수 있다.
			 *  
			 *  이후 마지막으로 Strimg.format을 사용하여 소수점 3자리까지 표시한다.
			 */
			
			avg2 = (float)cnt / s.length * 100;
			System.out.println(String.format("%.3f", avg2) + "%");
			
		}
	}
}