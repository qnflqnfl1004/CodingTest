import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		for (int i = 1; i <= a; i++) {
			int b = sc.nextInt();
			int c = sc.nextInt();
			
			System.out.printf("Case #%d: %d + %d = %d\n", i, b, c, (b + c));
		}
	}
}