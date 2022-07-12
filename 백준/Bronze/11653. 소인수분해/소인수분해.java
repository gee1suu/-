import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		// StringTokenizer st;

		int N = Integer.parseInt(br.readLine());

		while (N != 1) {
			int i;
			for (i = 2; i < 10000000; i++) {
				if (N % i == 0)
					break;
			}
			bw.write(i + "\n");
			N = N / i;
		}

		bw.flush();

	}

}
