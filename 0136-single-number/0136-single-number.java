class Solution {
    public int singleNumber(int[] nums) {
        
        int isSingle = 0; //initializing it 
        for(int num : nums){
            isSingle=isSingle^num;
        }
         return isSingle;
        
    }
}
//this problem can be solved by using 2 nested for loops but since our requirement is linear time xor operator can be used
//intially we have isSingle as 0
            //we xor it with the first number it becomes that number
            //if n the array it encounters the number again it becomes 0 again (because in xor same input yeilds false)
            //the only time isSingle will NOT be zero if it has not found a mathing number and hence will have the value of that number stored 