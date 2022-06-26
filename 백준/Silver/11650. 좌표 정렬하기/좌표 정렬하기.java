import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		
		int n= sc.nextInt();
		
		int arr[][]=new int[n][2]; //x좌표 y좌표
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		Arrays.sort(arr,new Comparator<int[]>() { //Comparator 인터페이스 재정의

			@Override
			public int compare(int[] o1, int[] o2) {
				
					
				 if(o1[0]==o2[0])// x좌표의 값이 같다면 y좌표를 기준으로 정렬		
					return Integer.compare(o1[1], o2[1]);
					
					return Integer.compare(o1[0], o2[0]); // 나머지는 x좌표를 기준으로 정렬
			
			}		
			
		});
		
		for(int i=0;i<arr.length;i++) {
	
				System.out.println(arr[i][0]+" "+arr[i][1]);
		
		}
		
	}
	
}