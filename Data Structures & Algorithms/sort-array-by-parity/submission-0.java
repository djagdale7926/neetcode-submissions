class Solution {
    public int[] sortArrayByParity(int[] nums) {
        List<Integer> even = new ArrayList<>();
        List<Integer> odd = new ArrayList<>();
        int[] arr=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                even.add(nums[i]);
            }else{
                odd.add(nums[i]);
            }
        }
        int i=0;
        for(int e:even){
            arr[i]=e;
            i++;
        }
        for(int o:odd){
            arr[i]=o;
            i++;
        }
        return arr;
    }
}