class Solution {
    public boolean containsDuplicate(int[] nums) {
      
        Set<Integer> hash = new HashSet<Integer>();
        for(int i = 0;i<nums.length;i++){
            if(!hash.add(nums[i])){
                return true;
            }
        }
        return false;
    }
}