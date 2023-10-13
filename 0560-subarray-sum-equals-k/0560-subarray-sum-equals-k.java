class Solution {
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        int sum = 0;
        Map<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            sum+=nums[i];

            if(map.containsKey(sum-k)){
                count+=map.get(sum-k);
            }

            if(sum==k)  count++;

            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        
        return count;

    }
}