class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++){

            int aranan = target - nums[i];

            if(map.containsKey(aranan)){
                return new int[] { map.get(aranan), i };
            }
            map.put(nums[i], i);
        }
        return new int[] {};
    }
}
