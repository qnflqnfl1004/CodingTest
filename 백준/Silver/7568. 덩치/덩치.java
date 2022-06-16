import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); // 사람 수 입력
		
		int arr[][] = new int[n][3]; // 사람 수만큼 몸무게, 키, 등수 배열 생성
		
		for (int i = 0; i < n; i++) { // 몸무게와 키 입력
			
			arr[i][0] = sc.nextInt();
			arr[i][1] = sc.nextInt();
		}
		
		int cnt; // 카운트 변수
		for (int i = 0; i < arr.length; i++) { // 모든 사람을 기준으로 잡는 반복문
			cnt = 0;
			for (int j = 0; j < arr.length; j++) { // 기준으로 잡은 사람과 다시 모든 사람을 비교 반복
				if(arr[i][0]<arr[j][0] && arr[i][1]<arr[j][1]) { // 기준으로 삼은 사람보다 키와 몸무게가 큰 사람을 만나면
					cnt++; //카운트 증가
				}
				
			}
			
			arr[i][2]=cnt+1; // 비교가 끝나면 카운ㅌ크에 +1 후 등수 배열에 저장
		}
		
		for (int i = 0; i < arr.length; i++) { // output
			System.out.print(arr[i][2]+" ");
			
		}
	}
}