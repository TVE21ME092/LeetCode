class Solution {
    public int mySqrt(int x) {
        int start=0;
        int end=x;
        int ans=0;
        while(start<=end){
            int mid=start-(start-end)/2;
            if((long)mid*mid<=x){
                ans=mid;
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return ans;
    }
}