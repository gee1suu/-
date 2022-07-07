import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		// StringTokenizer st = new StringTokenizer(br.readLine());

		int[] arr = new int[42];

		for (int i = 0; i < 10; i++) {
			int n = Integer.parseInt(br.readLine());
			arr[n % 42]++;
		}

		int cnt = 0;
		for (int idx = 0; idx < 42; idx++) {
			if (arr[idx] > 0)
				cnt++;
		}

		bw.write(String.valueOf(cnt));
		bw.flush();

	}

}
