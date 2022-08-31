import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		String[] words = new String[N];
		int i, j;

		for (i = 0; i < N; i++) {
			words[i] = br.readLine();
		}

		int result = 0;
		int add, order1, order2;
		int[] alphabet = new int[26];
		for (i = 0; i < N; i++) {
			add = 1;
			alphabet = new int[26];
			for (j = 0; j < words[i].length() - 1; j++) {
				if (words[i].charAt(j) != words[i].charAt(j + 1)) {
					order1 = (int) words[i].charAt(j) - 97;
					order2 = (int) words[i].charAt(j + 1) - 97;
					if (alphabet[order1] == 1 || alphabet[order2] == 1) {
						add = 0;
						break;
					} else {
						alphabet[order1] = 1;
					}
				}
			}
			result += add;
		}
		bw.write(String.valueOf(result));

		bw.flush();

	}

}
