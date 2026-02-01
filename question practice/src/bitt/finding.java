package bitt;

public class finding {
    public static void main(String[] args) {
        int [] nums1 = {2,6,4};
        int [] nums2 = {9,7,5};
        System.out.println(addedInteger(nums1,nums2));
    }
    public static int addedInteger(int[] nums1, int[] nums2) {
        int sum1 =0;
        int sum2=0;

        for(int num : nums1){
            sum1 = sum1 +num;
        }
        for(int num : nums2){
            sum2 = sum2+num;
        }
        int sum = sum2-sum1;
        sum= sum/nums1.length;
        return sum;
    }
}
