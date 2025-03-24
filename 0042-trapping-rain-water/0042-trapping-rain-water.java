class Solution {
    public int trap(int[] arr) {
        Stack<Integer> stack= new Stack<>();
        int n=arr.length;
        int ans=0;
        for(int i=0;i<n;i++){
            while(!stack.isEmpty() && arr[i]>arr[stack.peek()]){
                int top=stack.pop();
                if(stack.isEmpty()){
                    break;
                }
                int dist=i-stack.peek()-1;
                int boun_h=Math.min(arr[i],arr[stack.peek()])-arr[top];
                ans+=dist*boun_h;
            }
            stack.push(i);
        }
        return ans;
        
    }
}