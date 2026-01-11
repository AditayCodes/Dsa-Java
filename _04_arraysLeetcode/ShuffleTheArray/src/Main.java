// https://leetcode.com/problems/shuffle-the-array/description/
public class Main {
    public static void main(String[] args) {
        int[] nums={2,5,1,3,4,7};
        int n = nums.length / 2;
        int[] res = shuffle(nums,n);
        for (int val:res){
            System.out.print(val +" ");
        }
    }
    public static int[] shuffle(int[] nums, int n) {
        int[] res = new int[2*n];
        for(int i=0;i<n;i++){
            res[2*i]=nums[i];
            res[2*i+1]=nums[i+n];
        }
        return res;
    }
}