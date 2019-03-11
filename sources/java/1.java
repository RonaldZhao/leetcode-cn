public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] arr = { -1, -1 };
        if (nums != null && nums.length >= 2) {
            HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
            for (int i = 0; i < nums.length; i++) {
                if (map.containsKey(target - nums[i])) {
                    arr[0] = map.get(target - nums[i]);
                    arr[1] = i;
                    break;
                }
                map.put(nums[i], i);
            }
        }
        return arr;
    }
}
