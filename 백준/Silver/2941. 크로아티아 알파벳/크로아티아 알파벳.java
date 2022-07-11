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
		int cnt = 0;
		for (int idx = 0; idx < str.length(); idx++) {
			char ch = str.charAt(idx);
			if (ch == '=' || ch == '-')
				continue;
			if (ch == 'd' && str.length() > idx + 2) {
				if (str.charAt(idx + 1) == 'z' && (str.charAt(idx + 2) == '='))
					idx += 2;
			}
			if ((ch == 'l' || ch == 'n') && str.length() > idx + 1) {
				if (str.charAt(idx + 1) == 'j')
					idx++;
			}
			cnt++;
		}

		bw.write(cnt + " ");
		bw.flush();

	}

}
