import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());

		A = 100 * (A % 10) + 10 * (A % 100 / 10) + A / 100;
		B = 100 * (B % 10) + 10 * (B % 100 / 10) + B / 100;

		if (A > B)
			bw.write(String.valueOf(A));
		else
			bw.write(String.valueOf(B));

		bw.flush();

	}

}
