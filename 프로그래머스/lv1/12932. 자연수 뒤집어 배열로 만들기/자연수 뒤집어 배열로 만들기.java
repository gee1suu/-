import java.util.Collections;

class Solution {
    public int[] solution(long n) {
        String[] list = String.valueOf(n).split("");

        int l = list.length;
		int[] answer = new int[l];
		for (int i = 0; i < l; i++) {
			answer[i] = Integer.valueOf(list[l - i - 1]);
		}

		return answer;
    }
}