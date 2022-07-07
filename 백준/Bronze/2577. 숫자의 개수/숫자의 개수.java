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

		int A = Integer.parseInt(br.readLine());
		int B = Integer.parseInt(br.readLine());
		int C = Integer.parseInt(br.readLine());
		int result = A * B * C;
		int length = Integer.toString(result).length();

		int[] arr = new int[10];
		for (int i = length; i > 0; i--) {
			int n = (int) (result / Math.pow(10, i - 1));
			arr[n]++;
			result %= Math.pow(10, i - 1);
		}

		for (int idx = 0; idx < 10; idx++) {
			bw.write(arr[idx] + "\n");
		}

		bw.flush();

	}

}
