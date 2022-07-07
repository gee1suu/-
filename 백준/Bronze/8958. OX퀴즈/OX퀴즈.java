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

		int N = Integer.parseInt(br.readLine());
		for (int i = 0; i < N; i++) {
			String str = br.readLine();
			char[] arr = str.toCharArray();
			int score = 0;
			int sum = 0;
			for (int j = 0; j < arr.length; j++) {
				if (arr[j] == 'O')
					score++;
				else
					score = 0;
				sum += score;
			}

			bw.write(sum + "\n");
		}

		bw.flush();

	}

}
