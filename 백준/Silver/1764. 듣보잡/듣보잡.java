import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int NumOfNotHear = 0; // 듣지도 못한 문자열의 수
		int NumOfNotSee = 0; // 보지도 못한 문자열의 수
		int cnt = 0; // 듣도보도못한 수

		HashSet<String> SetOfNotHear = new HashSet<>(); // 듣지도 못한 문자열을 담을 HashSet
		ArrayList<String> List = new ArrayList<>(); // 듣지도, 보지도 못할 문자열을 담을 ArrayList

		NumOfNotHear = sc.nextInt();
		NumOfNotSee = sc.nextInt();
		sc.nextLine(); // nextInt()다음에 붙는 공백을 제거하기 위함

		for (int i = 0; i < NumOfNotHear; i++) {
			String notHearStr = sc.nextLine();
			SetOfNotHear.add(notHearStr); // 듣지도 못한 문자열을 HashSet에 저장시키는 과정
		}

		for (int i = 0; i < NumOfNotSee; i++) { // 보지도 못할 문자열이 듣지도 못했던 HashSet에 들어있는지 확인
			String notSeeStr = sc.nextLine();
			if (SetOfNotHear.contains(notSeeStr)) {
				cnt++;
				List.add(notSeeStr);
			}
		}

		Collections.sort(List); // 사전 순 정렬

		System.out.println(cnt);
		for (int i = 0; i < List.size(); i++) {
			System.out.println(List.get(i));
		}
	}
}