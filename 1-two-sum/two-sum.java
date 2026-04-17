class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer , Integer > freq = new HashMap<>();
        int res [] = new int[2];

        for(int i = 0 ; i < nums.length ; i++){
            if(freq.containsKey(target - nums[i])){
                res[0] = freq.get(target - nums[i]);
                res[1] = i ;
            }
            else{
                freq.put(nums[i] , i);
            }
        }
        
        return res;
    }
}