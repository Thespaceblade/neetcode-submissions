class Solution {
    Map<Integer, Integer>newMap = new HashMap<>();
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++){
           int difference = target - nums[i];
           if (newMap.containsKey(difference)){
              return new int[]{newMap.get(difference), i};
           } 
           newMap.put(nums[i], i);
        }
        return new int[] {};
    }
}
