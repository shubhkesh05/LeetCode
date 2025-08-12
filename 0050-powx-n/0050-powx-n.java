class Solution {
    public double myPow(double x, int n) {
        long power = n;
        if (power < 0) {
            x = 1 / x;
            power = -power;
        }
        double ans = 1.0;
        while (power > 0) {
            if ((power & 1) == 1) { // if odd
                ans *= x;
            }
            x *= x;  // square the base
            power >>= 1; // divide power by 2
        }
        return ans;
    }
}
