import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();					// 과목 개수를 입력 받는다.
		float[] arr = new float[n];				// 과목 개수만큼의 배열 생성
		float max = 0;						// 입력받은 배열에서 첫번째 값을 변수에 대입
		float avg = 0;
		
		
		for (int i = 0; i < arr.length; i++) {	// 과목 개수(배열 길이)만큼 반복해서 점수를 입력 받는다.
			arr[i] = sc.nextInt() ;
			if(max < arr[i]) {					// 배열 인덱스가 max보다 클 경우 
				max = arr[i];					// 각 배열의 값을 차례대로 max의 값과 비교하여 더 큰 값을 max에 대입
			}
		}
		
		for (int j = 0; j < arr.length; j++) {  // 과목 개수(배열 길이)만큼 반복해서 점수를 입력 받는다.
			avg += (arr[j] / max * 100) / n;	// 평균 = (평균 + 배열인덱스 / 최대값 * 100) / 과목개수
		}
		
		System.out.println(avg);
		
	}
}
