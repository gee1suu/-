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

		boolean[] bool = new boolean[1001];

		bool[1] = true;
		for (int i = 2; i < 501; i++) {
			for (int j = 2; j < 501; j++) {
				if (i * j < 1001)
					bool[i * j] = true;
			}
		}

		int N = Integer.parseInt(br.readLine());
		int cnt = 0;

		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			int num = Integer.parseInt(st.nextToken());
			if (!bool[num])
				cnt++;
		}

		bw.write(cnt + " ");
		bw.flush();

	}

}
