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
		StringTokenizer st;

		boolean[] bool = new boolean[10001];

		bool[1] = true;
		for (int i = 2; i < 5001; i++) {
			for (int j = 2; j < 5001; j++) {
				if (i * j < 10001)
					bool[i * j] = true;
			}
		}

		int M = Integer.parseInt(br.readLine());
		int N = Integer.parseInt(br.readLine());

		int sum = 0;
		int min = 10000;
		for (int i = M; i <= N; i++) {
			if (!bool[i]) {
				sum += i;
				if (min > i)
					min = i;
			}
		}

		if (sum == 0) {
			bw.write("-1");
		} else {
			bw.write(sum + "\n" + min);
		}

		bw.flush();

	}

}
