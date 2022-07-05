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

		int score = Integer.parseInt(br.readLine());

		if (score >= 90 && score <= 100) {
			bw.write("A");
		} else if (score >= 80 && score <= 89) {
			bw.write("B");
		} else if (score >= 70 && score <= 79) {
			bw.write("C");
		} else if (score >= 60 && score <= 69) {
			bw.write("D");
		} else {
			bw.write("F");
		}

		bw.flush();

	}

}
