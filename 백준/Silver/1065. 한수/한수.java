import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		;

		int N = Integer.parseInt(br.readLine());
		int cnt = 0;
		for (int i = 1; i <= N; i++) {
			if (Hansu(i))
				cnt++;
		}

		bw.write(String.valueOf(cnt));
		bw.flush();

	}

	static boolean Hansu(int i) {
		String str = Integer.toString(i);
		switch (str.length()) {
		case 1:
		case 2:
			return true;
		case 3:
			int A = i / 100;
			int B = i % 100 / 10;
			int C = i % 10;
			if (A + C == 2 * B)
				return true;
			else
				return false;
		default:
			return false;
		}

	}

}
