class Solution {
    public boolean isPalindrome(int x) {
        int num=x;
        int reverse=0;
        while(num>0){
            int rem = num%10;
            num = num/10;
            reverse=reverse*10+rem;
        }
        if(x==reverse){
            return true;
        }
        else{
            return false;
        }  
    }
}