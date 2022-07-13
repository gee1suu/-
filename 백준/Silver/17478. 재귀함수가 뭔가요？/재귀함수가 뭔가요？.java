import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static String underBar = "";

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(br.readLine());
		bw.write("어느 한 컴퓨터공학과 학생이 유명한 교수님을 찾아가 물었다.\n");
		chatBot(N);
		bw.flush();

	}

	static void chatBot(int n) throws IOException {
		// line 변수에 underBar 저장해놔야 charBot(n - 1) 실행 후에도 개수 유지됨
		String line = underBar;

		if (n == 0) {
			bw.write(line + "\"재귀함수가 뭔가요?\"\n");
			bw.write(line + "\"재귀함수는 자기 자신을 호출하는 함수라네\"\n");
			bw.write(line + "라고 답변하였지.\n");
		} else {
			bw.write(line + "\"재귀함수가 뭔가요?\"\n");
			bw.write(line + "\"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어.\n");
			bw.write(line + "마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지.\n");
			bw.write(line + "그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어.\"\n");
			underBar = underBar.concat("____");
			chatBot(n - 1);
			bw.write(line + "라고 답변하였지.\n");
		}
	}

}
