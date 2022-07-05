import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int A = Integer.parseInt(br.readLine());
		int B = Integer.parseInt(br.readLine());

		bw.write(String.valueOf(B % 10 * A) + "\n");
		bw.write(String.valueOf(B % 100 / 10 * A) + "\n");
		bw.write(String.valueOf(B / 100 * A) + "\n");
		bw.write(String.valueOf(A * B) + "\n");

		bw.flush();

	}

}
