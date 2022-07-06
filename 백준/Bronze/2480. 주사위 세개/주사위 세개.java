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
		int C = Integer.parseInt(st.nextToken());
		int money = 0;

		if (A == B && A == C)
			money = 10000 + A * 1000;
		else if (A == B || A == C)
			money = 1000 + A * 100;
		else if (B == C)
			money = 1000 + B * 100;
		else {
			if (A > B && A > C)
				money = A * 100;
			else if (B > A && B > C)
				money = B * 100;
			else
				money = C * 100;
		}
		;
		bw.write(String.valueOf(money));

		bw.flush();

	}

}
