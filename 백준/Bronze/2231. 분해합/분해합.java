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

		// 각 자릿수의 최댓값은 9
		// 예시: (9999 + 9 + 9 + 9 + 9)의 생성자: 9999
		// N - 9 * k <= (생성자) < N

		// N의 자릿수 구하기
		int k = String.valueOf(N).length();

		// N - 9 * k <= (생성자) < N
		int ssj = 0;
		for (int i = N - 9 * k; i < N; i++) {
			// tmp: 분해합 구하기 위한 변수
			// sum: 분해합 저장할 변수
			int tmp = i;
			int sum = i;

			// 분해합 구하기
			while (tmp != 0) {
				sum += tmp % 10;
				tmp /= 10;
			}

			// 분해합과 N 비교
			if (sum == N) {
				ssj = i;
				break;
			}
		}

		bw.write(String.valueOf(ssj));
		bw.flush();

	}

}
