class Solution {
    public int singleNonDuplicate(int[] nums) {
        for(int i=0;i<nums.length;i++){
            if((i>0 && nums[i]==nums[i-1])||(i<nums.length-1 && nums[i]==nums[i+1])){
                continue;
            }else{
                return nums[i];
            }
        }
        return -1;
    }
}