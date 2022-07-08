import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());

		int[] num = new int[N];
		String str = br.readLine();

		for (int i = 0; i < str.length(); i++)
			num[i] = str.charAt(i) - 48;

		int sum = 0;
		for (int i = 0; i < num.length; i++)
			sum += num[i];

		bw.write(String.valueOf(sum));
		bw.flush();

	}

}
