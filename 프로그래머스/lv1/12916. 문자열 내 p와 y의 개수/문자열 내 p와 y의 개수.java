class Solution {
    boolean solution(String s) {
        int cnt = 0;
        String str = s.toLowerCase();
        for(int idx = 0; idx < s.length(); idx++) {
            if(str.charAt(idx) == 'p') cnt++;
            if(str.charAt(idx) == 'y') cnt--;
        }
        if(cnt == 0) {
            return true;
        } else {
            return false;
        }
    }
}