class Solution {
    public int hammingDistance(int x, int y) {
        int b=x^y;
        
        int ans = countbit(b);
        return ans;
        }
    public int countbit(int b){
        int c=0;
        while(b>0){
            c += b&1;
            b =b>> 1;
            
        }
        return c;
    }
}