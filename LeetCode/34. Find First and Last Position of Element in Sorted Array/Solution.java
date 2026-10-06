public class Solution {
    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 7;

        int[] ans = searchRange(nums, target);
        System.out.println("[" + ans[0] + ", " + ans[1] + "]");
    }

    public static int[] searchRange(int[] nums, int target) {
        int[] ans = {-1, -1};

        ans[0] = search(nums, target, true);
        
        if (ans[0] != -1) {
            ans[1] = search(nums, target, false);
        }
        return ans;
    }

    public static int search(int[] nums, int target, boolean findStartIndex) {
        int start = 0;
        int end = nums.length - 1;
        int ans = -1;
        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {

                ans = mid;

                if (findStartIndex) {
                    // Search on left side
                    end = mid - 1;
                }
                else {
                    // Search on right side
                    start = mid + 1;
                }
            }

            else if (nums[mid] < target) {
                start = mid + 1;
            }

            else {
                end = mid - 1;
            }
        }

        return ans;
    }
}