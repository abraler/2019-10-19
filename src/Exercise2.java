import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exercise2 {

    class Solution {
        public List<List<Integer>> threeSum(int[] nums) {
            List<List<Integer>> result = new ArrayList<List<Integer>>();
            if (nums == null || nums.length < 3) {
                return result;
            }
            Arrays.sort(nums);
            for (int i = 0; i < nums.length - 2; i++) {
                if (nums[i] > 0) {
                    break;
                }
                if (i > 0 && nums[i] == nums[i - 1]) {
                    continue;
                }
                int start = i + 1;
                int end = nums.length - 1;
                while (start < end) {
                    if (nums[start] + nums[end] + nums[i] < 0 || (start > i + 1 && nums[start] == nums[start - 1])) {
                        start++;
                    } else {
                        if (nums[start] + nums[end] + nums[i] > 0 || (end < nums.length - 1 && nums[end] == nums[end + 1])) {
                            end--;
                        } else {
                            List<Integer> list = new ArrayList<Integer>();
                            list.add(nums[i]);
                            list.add(nums[start++]);
                            list.add(nums[end--]);
                            result.add(list);
                        }
                    }
                }
            }
            return result;
        }
    }
}
