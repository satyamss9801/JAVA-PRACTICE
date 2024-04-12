public class recPowerSet {

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3 };
        printPowerSet(nums, "", 0);
    }

    public static void printPowerSet(int[] nums, String subset, int index) {
        if (index == nums.length) {
            System.out.println("{ " + subset + " }");
        } else {
            printPowerSet(nums, subset, index + 1);
            printPowerSet(nums, subset + " " + nums[index], index + 1);
        }
    }

}
