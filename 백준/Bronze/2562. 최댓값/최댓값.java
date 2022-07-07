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

		int[] arr = new int[10];

		for (int idx = 1; idx < 10; idx++) {
			arr[idx] = Integer.parseInt(br.readLine());
		}

		int max = 0;
		int arrIdx = 0;
		for (int idx = 1; idx < 10; idx++) {
			if (arr[idx] > max) {
				max = arr[idx];
				arrIdx = idx;
			}
		}

		bw.write(max + "\n" + arrIdx);
		bw.flush();

	}

}
