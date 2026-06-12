class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int mid = 0;

        int[] result = new int[nums.length];

        while(mid < nums.length){
        int count = 0;
            for(int i = 0 ; i < mid ; i++){
                if(nums[i] < nums[mid]){
                    count++;
                }
            }

            for(int j = mid + 1 ; j < nums.length ; j++){
                if(nums[j] < nums[mid]){
                    count++;
                }
            }

            result[mid] = count;
            mid++;

        }
        return result;
    }
}