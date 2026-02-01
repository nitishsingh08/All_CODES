import java.util.Arrays;
public class cyclicSort {
    public static void main(String[] args) {
        int [] arr={3,2,7,10,8,9,4,1,6,5};
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void cyclicSort(int [] arr){
        int i=0;
        while(i<arr.length){
            int correctIndex=arr[i]-1;
            if(arr[correctIndex]!=arr[i]){
                swap(arr,i,correctIndex);
            } else {
                i++;
            }
        }
    }

    public static void swap(int []arr,int i, int correctIndex){
        int temp= arr[i];
        arr[i]=arr[correctIndex];
        arr[correctIndex]=temp;
    }
}
