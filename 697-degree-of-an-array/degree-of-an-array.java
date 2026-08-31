class Solution {
    public int findShortestSubArray(int[] nums) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int degree = 0;
        for (int freq : map.values()) {
            degree = Math.max(degree, freq);
        }

        int result = nums.length;

        for (int key : map.keySet()) {
            if (map.get(key) == degree) {

                int left = 0;
                int right = nums.length - 1;

                for (int i = 0; i < nums.length; i++) {
                    if (nums[i] == key) {
                        left = i;
                        break;
                    }
                }

                for (int i = nums.length - 1; i >= 0; i--) {
                    if (nums[i] == key) {
                        right = i;
                        break;
                    }
                }

                result = Math.min(result, right - left + 1);
            }
        }

        return result;
    }
}
