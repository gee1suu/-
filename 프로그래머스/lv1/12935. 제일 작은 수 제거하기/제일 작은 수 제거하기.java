import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr) {
        int min = arr[0];
        for(int i = 1; i < arr.length; i++) {
            if(min > arr[i]) {
                min = arr[i];
            }
        }
        
        ArrayList<Integer> list = new ArrayList<>();
        for(int num : arr) {
            if(num != min) {
                list.add(num);
            }
        }

        if(list.isEmpty()) {
            list.add(-1);
        }
        
        int[] answer = new int[list.size()];
        for(int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
        
    }
}