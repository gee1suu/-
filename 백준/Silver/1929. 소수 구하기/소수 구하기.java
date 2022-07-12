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

		int m = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());

		boolean[] prime = new boolean[n + 1];
		prime[0] = prime[1] = true;

		// 예시(n = 9)
		// 9 = 1 * 9
		// 9 = 2 * 4.xx
		// 9 = 3 * 3
		// 9 = 4 * 2.xx
		// 9 = 5 * 1.xx
		// 9 = 6 * 1.xx
		// 9 = 7 * 1.xx
		// 9 = 8 * 1.xx
		// 9 = 9 * 1
		
		// 3(9의 제곱근) 이후로 나눠진 몫은 1 이하 3 미만의 수이므로 계산해 볼 필요 X
		// 따라서 i의 범위는 i <= Math.sqrt(prime.length)
		for (int i = 2; i <= Math.sqrt(prime.length); i++) {
			// i가 소수가 아니면 지나감
			if (prime[i])
				continue;
			// i가 소수이면 i를 제외한 i의 배수가 소수가 아님을 표시
			for (int j = i * i; j < prime.length; j += i) {
				prime[j] = true;
			}
		}

		for (int i = m; i <= n; i++) {
			if (!prime[i])
				bw.write(i + "\n");
		}

		bw.flush();
	}
}
