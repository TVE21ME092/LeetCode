class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int old=x;
        int r;
        int rev=0;
        while(x>0){
            r=x%10;
            rev=rev*10+r;
            x/=10;
        }
        return old==rev;
    }
}