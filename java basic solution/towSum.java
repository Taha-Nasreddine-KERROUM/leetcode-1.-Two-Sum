class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i = 0;
        while(i < nums.length){
            for(int ii = 0; ii < nums.length; ii++){
                if(nums[i] + nums[ii] == target && i != ii){
                    return new int[]{i, ii};
                }
            }
            i++;
        }
        return null;
    }
}
