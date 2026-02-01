import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class disapeared {
    public static void main(String[] args) {
        int [] arr={3,2,7,10,8,4,1,6,5};
        List<Integer> ans= findDisappearedNumbers(arr);
        System.out.println(ans);
    }
    public static List<Integer> findDisappearedNumbers(int[] arr) {

        List<Integer> list= new ArrayList<>();
        int i = 0;
        while(i < arr.length) {
            int crt = arr[i] - 1;
            if (arr[i] >= 0 && arr[i] <= arr.length && arr[i] != arr[crt]) {
                swap(arr, i, crt);
            } else {
                i++;
            }
        }
            for(int index =0; index<arr.length;index++){
                if(arr[index]!=index+1){

                    list.add(index+1);
                }
            }

        return list;
    }
    public static void swap(int [] arr, int i , int crt){
        int temp = arr[i];
        arr[i]= arr[crt];
        arr[crt]=temp;
    }
}
