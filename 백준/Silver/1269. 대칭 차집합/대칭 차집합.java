import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        HashSet<Integer> aSet = new HashSet<>();

        st = new StringTokenizer(br.readLine());
        for (int i =0; i < a; i++) {
            aSet.add(Integer.parseInt(st.nextToken()));
        }

        st = new StringTokenizer(br.readLine());
        for (int i =0; i < b; i++) {
            int num = Integer.parseInt(st.nextToken());
            if (aSet.contains(num)) {
                aSet.remove(num);
            } else {
                aSet.add(num);
            }
        }

        System.out.println(aSet.size());
    }
}