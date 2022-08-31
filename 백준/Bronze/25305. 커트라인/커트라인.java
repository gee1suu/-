import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;

		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());

		st = new StringTokenizer(br.readLine());
		int[] x = new int[N];
		for (int i = 0; i < N; i++) {
			x[i] = Integer.parseInt(st.nextToken());
		}

		Arrays.sort(x);

		bw.write(String.valueOf(x[N - k]));
		bw.flush();

	}

}
