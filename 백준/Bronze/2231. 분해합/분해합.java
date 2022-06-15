import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int index = N; // 생성자가 되는지 살펴볼 변수 (N-1부터 1까지 검사)
		int res = 0; //결과값
		
		while(index > 0) {
			index--; // N-1부터 생성자인지 확인한다. (N보다 낮은 수 이므로)
			int com = index; // 생성자 자신 + 각 자릿수이므로 우선 자신 저장
			int unit = index; // 각 자릿수를 구할 변수
			
			while(unit != 0) { // 10으로 나눴을 때 몫이 0이면 모든 자릿수 검사 완료
				com += unit % 10; // 10으로 나누고 나머지를 더함 (1의 자리)
				unit /= 10; // 10으로 나누고 몫을 저장 (한자릿수 씩 낮춰짐)
			} // while 다돌면 자신 수 + 각 자릿수 다 더한것
			
			if(com == N) { // N과 같으면 생성자
				res = index;
			}
		} // 생성자가 여러개라도 1씩 낮추면서 더 낮은 생성자가 있으면 결과값이 새로 정의 된다.
		System.out.println(res);
	}
}