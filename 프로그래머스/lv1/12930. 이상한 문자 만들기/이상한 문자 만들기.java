class Solution {
    public String solution(String s) {
        String[] sen = String.valueOf(s).split("");
        
        int idx = 0;
        for(int i = 0; i < sen.length; i++) {
            if(sen[i].equals(" ")) {
                idx = 0;
                continue;
            }
            
            if(idx % 2 == 0) {
                sen[i] = sen[i].toUpperCase();
            } else {
                sen[i] = sen[i].toLowerCase();
            }
            
            idx++;
        }
        
        return String.join("", sen);
    }
}