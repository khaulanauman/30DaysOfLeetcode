class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] answer=new int[nums.length];
        //starting from 1 because we don't want to include the current index
        //first loop multiplies all the previous numbers in the current index of nums array
        for(int i=1;i<nums.length;i++){
            //so that output isnt zero
            answer[0]=1;
            answer[i]=answer[i-1]*nums[i-1];
        }
        int suffix=1;
         for(int i=nums.length-1;i>=0;i--){
             //second loop multiplies all the numbers after the current index of nums array
            answer[i]*=suffix;
                suffix*=nums[i];
        }
        return answer;
    }
}