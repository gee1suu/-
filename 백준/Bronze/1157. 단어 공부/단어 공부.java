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

		String word = br.readLine();
		int[] alphabet = new int[26];
		word = word.toLowerCase();

		for (int idx = 0; idx < word.length(); idx++) {
			int num = word.charAt(idx) - 97;
			alphabet[num]++;
		}

		int max = 0;
		char maxAlphabet = '?';
		for (int idx = 0; idx < alphabet.length; idx++) {
			if (alphabet[idx] > max) {
				max = alphabet[idx];
				maxAlphabet = (char) (idx + 65);
			} else if (alphabet[idx] == max)
				maxAlphabet = '?';
		}

		bw.write(maxAlphabet);

		bw.flush();

	}

}
