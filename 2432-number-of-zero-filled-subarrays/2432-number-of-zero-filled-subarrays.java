class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long ans=0;
        long subarray=0;
        for(int num: nums){
            if(num==0){
                subarray++;
            }
            else{
                subarray=0;
            }
            ans = ans +subarray;
        }
        return ans;
    }
}