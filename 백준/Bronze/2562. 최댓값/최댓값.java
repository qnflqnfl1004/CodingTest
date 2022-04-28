import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int [] array = new int[9];			// 배열길이
		int max = array[0];					// 배열중에서 최대값
		int count = 0;						// 최대값이 몇번 째 수?
		
		
		
		for (int i = 0; i < array.length; i++) { 	// 배열 길이만큼 반복
			int num = sc.nextInt();					// 배열 길이만큼 받은 정수를 num에 대입
			
			array[i] = num;							// num은 배열의 인덱스 값
			
			if(max < array[i]) {					// 순회 중 배열인덱스값이 max보다 클 경우
				
				max = array[i];						// 배열 인덱스를 max에 대입
				count = i + 1;						// max(최대값)이 배열의 몇번 쨰(인덱스 + 1)정수 인지 세어보기  							
			}
			
		}
		System.out.println(max);
		System.out.println(count);
		
	}
}