import java.util.*;
class Solution {
    public int[] twoSum(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {

                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your size of array:");
        int size = sc.nextInt();

        int[] nums = new int[size];

        System.out.println("Enter your array elements:");
        for (int i = 0; i < size; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.println("Enter your target:");
        int target = sc.nextInt();

        Solution obj = new Solution();

        int[] result = obj.twoSum(nums, target);

        System.out.println("[" + result[0] + ", " + result[1] + "]");

        sc.close();
    }
}