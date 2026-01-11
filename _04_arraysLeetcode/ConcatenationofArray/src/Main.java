// https://leetcode.com/problems/concatenation-of-array/
public class Main {
    public static void main(String[] args) {
        int[] nums={1,2,3};
        int[] res = getConcatenation(nums);
        for (int val:res){
            System.out.print(val +" ");
        }
    }
    public static int[] getConcatenation(int[] nums) {
        int[] ans = new int[2 * nums.length];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[i];
            ans[i + nums.length] = nums[i];
        }
        return ans;
    }
}