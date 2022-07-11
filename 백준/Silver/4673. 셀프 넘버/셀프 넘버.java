import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		// BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		// StringTokenizer st = new StringTokenizer(br.readLine());

		final int NUMCNT = 10001;

		// 1 ~ 10,000까지의 수
		// true: 생성자가 있는 수
		// false: 셀프 넘버
		boolean[] check = new boolean[NUMCNT];

		for (int i = 1; i < NUMCNT; i++) {
			int n = d(i);
			if (n < NUMCNT)
				check[n] = true;
		}

		for (int i = 1; i < NUMCNT; i++) {
			if (!check[i])
				bw.write(i + "\n");
		}

		bw.flush();

	}

	static int d(int num) {
		int ans = num;
		while (num != 0) {
			// 일의 자리 더하기
			ans += (num % 10);
			// 10으로 나눠서 자리수 줄이기
			num /= 10;
		}
		return ans;
	}

}
