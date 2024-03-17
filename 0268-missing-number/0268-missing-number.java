class Solution {
    public int missingNumber(int[] nums) {
        int size = nums.length;
        boolean[] numsPresent=new boolean[size+1];
        for(int num:nums){
            //if that number is found on that index
            numsPresent[num]=true;
        }
        int num=-1;
        for(int i=0;i<=size;i++){
            if(!numsPresent[i]){
                num=i;
            }
                
        }
        return num;
    }
}