class Solution {
    public void moveZeroes(int[] nums) {
        List<Integer> ans=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                ans.add(nums[i]);
            }
        }
        for(int i=0;i<nums.length;i++){
            if(i<ans.size()){
                nums[i]=ans.get(i);
            }else{
                nums[i]=0;
            }
        }
    }
}