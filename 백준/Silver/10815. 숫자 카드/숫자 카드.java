import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	static int N, M;
	static int arr[];

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;

		N = Integer.parseInt(br.readLine());

		arr = new int[N];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		// 숫자 카드 오름차순 정렬
		Arrays.sort(arr);

		M = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < M; i++) {
			int num = Integer.parseInt(st.nextToken());
			// 이분 탐색을 해서 해당 숫자가 있는 경우
			if (binarySearch(num))
				bw.write("1 ");
			// 이분 탐색을 해서 해당 숫자가 없는 경우
			else
				bw.write("0 ");
		}

		bw.flush();

	} // main

	// 이분 탐색
	static boolean binarySearch(int num) {
		// 최소 인덱스: left
		int leftIndex = 0;
		// 최대 인덱스: right
		int rightIndex = N - 1;

		while (leftIndex <= rightIndex) {
			// 중간값: (left + right) / 2
			int midIndex = (leftIndex + rightIndex) / 2;
			int mid = arr[midIndex];

			// 중간값과 탐색하려는 숫자 비교

			// (탐색숫자) < (중간값): right = right - 1
			if (num < mid)
				rightIndex = midIndex - 1;
			// (탐색숫자) > (중간값): left = left + 1
			else if (num > mid)
				leftIndex = midIndex + 1;
			// (탐색숫자) == (중간값): 탐색 성공
			else
				return true;
		}
		// num을 찾지 못하고 반복문이 종료
		return false;
	}

}
