class Solution {
    public long solution(long n) {
        double d = Math.sqrt(n);
        long l = (long) Math.sqrt(n);
        if(d - l == 0) {
            return (l + 1) * (l + 1);
        } else {
            return -1;
        }
    }
}