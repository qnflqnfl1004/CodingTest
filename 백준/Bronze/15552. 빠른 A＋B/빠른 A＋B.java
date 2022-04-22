import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {	//  throws IOException을 통해 예외를 처리
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int a = Integer.parseInt(bf.readLine());
			
			for (int i = 0; i < a ; i++) {	// 입력받은 정수 a가 인덱스 0부터 인덱스 a만큼 1씩 커지는 반복
				String s = bf.readLine();	// 해당 줄 전체를 String으로 입력받아, 스페이스" "로 구분하여 형변환하여 덧셈을 수행한다.
				int b = Integer.parseInt(s.split(" ")[0]);
				int c = Integer.parseInt(s.split(" ")[1]);
				bw.write(b + c + "\n");	 // bw.write()는 버퍼에 쓰는것이지, 화면에 출력되는 것이 아니다.
				
			}
			bw.flush();					//화면에 출력하는 역할은 bw.flush()가 수행한다.
	}
}
