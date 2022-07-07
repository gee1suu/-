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

		int N = Integer.parseInt(br.readLine());

		int[] arr = new int[N];
		st = new StringTokenizer(br.readLine());
		for (int idx = 0; idx < N; idx++) {
			arr[idx] = Integer.parseInt(st.nextToken());
		}

		int max = -1000000;
		int min = 1000000;
		for (int idx = 0; idx < N; idx++) {
			if (arr[idx] > max)
				max = arr[idx];
			if (arr[idx] < min)
				min = arr[idx];
		}

		bw.write(min + " " + max);

		bw.flush();

	}

}
