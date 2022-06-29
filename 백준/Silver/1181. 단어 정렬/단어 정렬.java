import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] arr = new String[n];
		String temp = "";
		for(int i = 0; i<arr.length; i++) {
			arr[i] = sc.next();
		}
		Arrays.sort(arr);
		Arrays.sort(arr, Comparator.comparing(String::length));
		for(int i = 0; i<arr.length; i++) {
			if(temp.equals(arr[i])) {
				continue;
			}
			else {
				System.out.println(arr[i]);
				temp = arr[i];
			}
			
			
			// Arrays.sort(arr, Comparator.comparing(String::length)); 이 메소드는 각 인덱스의 길이를 기준으로 정렬해주는 메소드입니다.
			// 처음 Arrays.sort로 사전순서대로 정렬 후 인덱스의 길이 별로 다시 정렬해주면 원하는 방향으로 정렬이 됩니다.
		}
	}
}