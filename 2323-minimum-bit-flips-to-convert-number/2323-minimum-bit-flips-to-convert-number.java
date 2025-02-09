class Solution {
    public int minBitFlips(int start, int goal) {
        int b=start^goal;
        int ans = countBit(b);
        return ans;
    }
    public int countBit(int x){
        int s= 0;
        while(x > 0){
            s += x & 1;
            x >>= 1;
        }
        return s;
    }
}