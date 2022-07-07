import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken()); // 68
		int num = N;
		int cnt = 0;

		do {
			int A = N / 10; // 6
			int B = N % 10; // 8
			int C = (A + B) % 10; // 4
			N = B * 10 + C; // 84
			cnt++;
		} while (N != num);

		bw.write(String.valueOf(cnt));

		bw.flush();

	}

}
