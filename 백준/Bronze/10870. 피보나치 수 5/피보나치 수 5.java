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

		int N = Integer.parseInt(br.readLine());
		int ans = fibonacci(N + 1);

		bw.write(String.valueOf(ans));
		bw.flush();

	}

	static int fibonacci(int n) {
		if (n == 2)
			return 1;
		else if (n == 1)
			return 0;
		else
			return fibonacci(n - 1) + fibonacci(n - 2);
	}

}
