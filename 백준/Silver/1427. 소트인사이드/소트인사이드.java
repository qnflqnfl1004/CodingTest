import java.util.*;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
        // 문자열로 받기
		String N = sc.nextLine();
		
		char[] arr = N.toCharArray();
		//정렬
		Arrays.sort(arr);
		
		// 내림차순
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i]);
		}
		
	}
	
}
    