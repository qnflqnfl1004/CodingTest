import java.util.Scanner;

public class Main {
    public static void main(String[] args){
    	
    	Scanner sc = new Scanner(System.in);
    	
    	while(true) {
    		
    		int x = sc.nextInt();
    		int y = sc.nextInt();
    		int z = sc.nextInt();
    		
    		// 0 0 0 을 입력받으면 종료
    		if(x == 0 && y == 0 && z == 0) break;
    		
    		if((x * x + y * y) == z * z) {
    			
    			System.out.println("right");
    		}
    		else if(x * x == (y * y + z * z)) {
    			System.out.println("right");
    		}
    		else if(y * y == (z * z + x * x)) {
    			System.out.println("right");
    		}
    		else {
    			System.out.println("wrong");
    		}
    		
    		/*
    		 * x, y, z 중 어느 변이 대각선 변인지는 모르기 때문에 3개의 조건을 다 검사한 뒤,
    		 * 해당 조건에 하나라도 맞다면 right 를 출력하고 아닐경우 wrong 을 출력하면 된다.
    		 * 참고로 Math.sqrt() 로 제곱근을 안구하는 이유는 double 형으로 제곱근을 반환하는 과정중에
    		 * 일정 소수점 이하로 가면 소수값이 달라질 수 있어서 그렇다.
    		 * 즉, 3, 4, 5 가 주어졌을 때, Math.sqrt(3*3 + 4*4) = Math.sqrt(5) 가 수학적으로는 맞지만,
    		 * 프로그래밍에서는 오차가 날 수 있어 해당 식이 틀릴 수도 있기 때문에 안전하게 제곱을하여 구하는 것이다.
    		 */
    	}
    	
    }
}