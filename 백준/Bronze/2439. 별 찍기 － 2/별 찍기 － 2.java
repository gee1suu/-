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
		;

		int N = Integer.parseInt(br.readLine());

		for (int line = 1; line <= N; line++) {
			for (int star = line; star < N; star++) {
				bw.write(" ");
			}
			for (int star = 1; star <= line; star++) {
				bw.write("*");
			}
			bw.write("\n");
		}

		bw.flush();

	}

}
