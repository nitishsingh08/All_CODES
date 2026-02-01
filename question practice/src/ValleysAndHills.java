import java.util.Arrays;


public class ValleysAndHills {
    public static void main(String[] args) {
      int[] nums = {2,4,1,1,6,5};
     // hillsAndValleys(nums);
        System.out.println(countHillValley(nums));
    }
    public static int countHillValley(int[] nums) {
        int count = 0;
        int left = nums[0];
        for (int i = 1; i + 1 < nums.length; ++i) {
            if ((left < nums[i] && nums[i] > nums[i + 1])   // Hill
                    || (left > nums[i] && nums[i] < nums[i + 1])) // Valley
            {
                count++;
              left = nums[i]; // Update left to the current non-equal value
            }
            if (nums[i] != nums[i + 1]) {
                left = nums[i];//if duplicate then it will not update this value
            }
        }
        return count;
    }
}
