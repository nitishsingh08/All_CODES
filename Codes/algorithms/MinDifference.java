package algorithms;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
public class MinDifference {
    public static void main(String[] args) {
        int [] arr = {2,3,4,1};
        List<List<Integer>> ans = minimumAbsDifference(arr);
        System.out.println(ans);
    }
    public static List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> result = new ArrayList<>();
        int min = diff(arr);
        for(int i = 0; i < arr.length; i++){
            List<Integer> list = new ArrayList();
            if(i > 0 && (Math.abs(arr[i] - arr[i - 1]) == min)){
                list.add(arr[i - 1]);
                list.add(arr[i]);
                result.add(list);
            }

        }
        return result;

    }
    private static int diff(int [] arr){
        int minFinal = Integer.MAX_VALUE;
        Arrays.sort(arr);
        for(int i = 0; i < arr.length; i++){
            int min = Integer.MAX_VALUE;
            if( i > 0){
                min = (arr[i] - arr[i-1]);
            }
            if(minFinal > min){
                minFinal = min;
            }
        }
        return minFinal;
    }
}
