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

		String str = br.readLine();

		int sum = str.length();
		for (int idx = 0; idx < str.length(); idx++) {
			int num = str.charAt(idx) - 65 + 6;
			if (num < 21)
				num /= 3;
			else {
				if (num < 25)
					num = 7;
				else if (num < 28)
					num = 8;
				else
					num = 9;
			}
			sum += num;
		}

		bw.write(sum + " ");
		bw.flush();

	}

}
