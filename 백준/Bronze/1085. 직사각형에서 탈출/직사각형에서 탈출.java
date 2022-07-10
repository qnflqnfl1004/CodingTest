import java.io.IOException;
import java.util.Scanner;

public class Main {
	// 백준 0185 직사각형에서 탈출 기본수학 2
    public static void main(String[] args) throws IOException {
    	Scanner sc = new Scanner(System.in);
    	
    	int x = sc.nextInt();
    	int y = sc.nextInt();
    	int w = sc.nextInt();
    	int h = sc.nextInt();
    	
    	int widMin = (w - x) < x ? (w - x) : x;
    	int heiMin = (h - y) < y ? (h - y) : y;
    	
    	if(widMin < heiMin) {
    		
    		System.out.println(widMin);
    		
    	} else {
    		
    		System.out.println(heiMin);
    		
    	}
    }
}