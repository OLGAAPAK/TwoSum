public class Main {
    public static void main(String[] args) {

        //Task: The Two Sum problem asks us to find two numbers in an array
        // that sum up to a given target value.
        // We need to return the indices of these two numbers.

    int[] nums = new int[]{2, 7, 11, 15};
    int[] nums2 = new int[]{3, 2, 4};
    int[] result = twoSum(nums, 9);
    int[] result2 = twoSum(nums2, 6);
        System.out.println("[" + result[0] + " , " + result[1] + "]");
        System.out.println("[" + result2[0] + " , " + result2[1] + "]");
    }
    public static int[] twoSum(int[] nums, int target) {
        int[] index = new int[2];
        int sum = 0;
        for(int i = 0; i < nums.length - 1; i++) {
            for (int j = 1; j < nums.length; j++) {
                sum = nums[i] + nums[j];
                if (sum == target) {
                    index[0] = i;
                    index[1] = j;
                }
            }
        }
        return index;
    }
}