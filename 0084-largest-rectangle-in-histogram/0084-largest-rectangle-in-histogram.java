class Solution {
    public int largestRectangleArea(int[] heights) {
        int n=heights.length;
        int prevsm[]=new int [n];
        int nextsm[]=new int [n];
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<n;i++){
        while( !st.isEmpty() && heights[st.peek()]>=heights[i]){
            st.pop();
        }
        if(st.isEmpty()){
            prevsm[i]=-1;
        }
        else{
            prevsm[i]=st.peek();
        }
        st.push(i);

        }
        st.clear();
          for(int i=n-1;i>=0;i--){
        while( !st.isEmpty() && heights[st.peek()]>=heights[i]){
            st.pop();
        }
        if(st.isEmpty()){
            nextsm[i]=n;
        }
        else{
            nextsm[i]=st.peek();
        }
        st.push(i);

        }
        int maxhisto=0;
        for(int i=0;i<heights.length;i++){
            int width=nextsm[i]-prevsm[i]-1;
            int maxarea=width*heights[i];
            maxhisto=Math.max(maxhisto,maxarea);
        }
        return maxhisto;
        

    }
}