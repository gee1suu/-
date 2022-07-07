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
		StringTokenizer st;
		;

		int C = Integer.parseInt(br.readLine());
		for (int i = 0; i < C; i++) {
			st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			int[] score = new int[N];
			int avg = 0;
			for (int j = 0; j < N; j++) {
				score[j] = Integer.parseInt(st.nextToken());
				avg += score[j];
			}
			avg /= N;
			int cnt = 0;
			for (int j = 0; j < N; j++) {
				if (avg < score[j])
					cnt++;
			}
			double ans = cnt / (double) N * 100;
			bw.write(String.format("%.3f", ans) + "%\n");
		}

		bw.flush();

	}

}
