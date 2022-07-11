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

		String sentence = br.readLine();
		sentence = sentence.trim();

		int cnt = 0;
		for (int idx = 0; idx < sentence.length(); idx++) {
			if (sentence.charAt(idx) == ' ')
				cnt++;
		}
		
		// 공백만 들어올 때
		if (sentence.length() != 0)
			cnt++;

		bw.write(String.valueOf(cnt));
		bw.flush();

	}

}
