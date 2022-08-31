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
		
		// 킹 1개, 퀸 1개, 룩 2개, 비숍 2개, 나이트 2개, 폰 8개
		int[] pieces = {1, 1, 2, 2, 2, 8};
		
		for(int piece : pieces) {
			int input = Integer.parseInt(st.nextToken());
			int num = piece - input;
			if(num != 0) {
				bw.write(num + " ");
			} else {
				bw.write("0 ");
			}
		}
		
		bw.flush();
		
	}

}
