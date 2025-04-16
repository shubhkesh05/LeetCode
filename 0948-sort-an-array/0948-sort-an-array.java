class Solution {
    // public int quicksort(int[] arr,int st,int end){
    //     int idx=st-1;
    //     int pivot=arr[end];
    //     for(int j=st;j<end;j++){
    //         if(arr[j]<=pivot){
    //             idx++;
    //             int temp=arr[j];
    //             arr[j]=arr[idx];
    //             arr[idx]=temp;
    //         }
    //     }
    //     idx++;
    //     int temp=arr[end];
    //     arr[end]=arr[idx];
    //     arr[idx]=temp;
    //     return idx;
    // }

    // public int[] sortArray(int[] nums,int st,int end){
    //     if(st<end){
    //     int pivotidx=quicksort(nums,st,end);
    //     sortArray( nums, st, pivotidx-1);
    //     sortArray(nums,pivotidx+1, end);
    //     }
    //     return nums;
    // }
    public int[] mergesort(int[] nums,int st,int mid ,int end){
        int temp[]=new int[end-st+1];
        int i=st;
        int j=mid+1;
        int k=0;
        while(i<=mid && j<=end){
            if(nums[i]<=nums[j]){
                temp[k++]=nums[i++];
            }
            else{
                temp[k++]=nums[j++];
            }
        }
        while(i<=mid){
            temp[k++]=nums[i++];
        }
        while(j<=end){
             temp[k++]=nums[j++];
        }
        for(int idx=0;idx<temp.length;idx++){
            nums[idx+st]=temp[idx];
        }
        return nums;

    }
     public int[] sortArray(int[] nums,int st,int end){
        if(st<end){
        int mid=st+(end-st)/2;
        sortArray(nums, st,mid);
        sortArray(nums,mid+1,end);
        mergesort(nums,st,mid,end);


        }
        return nums;
     } 
    public int[] sortArray(int[] nums) {
        sortArray(nums,0,nums.length-1);
        return nums;
    }
}