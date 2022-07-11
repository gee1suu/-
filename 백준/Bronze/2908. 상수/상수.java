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

		StringBuffer sbA = new StringBuffer(st.nextToken());
		StringBuffer sbB = new StringBuffer(st.nextToken());

		int A = Integer.parseInt(sbA.reverse().toString());
		int B = Integer.parseInt(sbB.reverse().toString());

		if (A > B)
			bw.write(String.valueOf(A));
		else
			bw.write(String.valueOf(B));

		bw.flush();

	}

}
