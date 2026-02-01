import java.util.Arrays;

public class missingNumber {
    public static void main(String[] args) {
        int [] arr={3,2,7,10,8,4,0,1,6,5};
      //  cyclicSort(arr);
        System.out.println(cyclicSort(arr));
    }
    public static void swap(int [] arr,int correctIndex,int i){
        int temp = arr[correctIndex];
        arr[correctIndex]=arr[i];
        arr[i]=temp;
    }
    public static int cyclicSort(int []arr){
        int i =0;
        while(i< arr.length){
        int correctIndex = arr[i];
        if (arr[i]< arr.length&&arr[correctIndex]!=arr[i]){
            swap(arr,correctIndex,i);
        } else {
            i++;
        }

        }
        for (int index =0;index<arr.length;index++){
            if (arr[index]!=index){
                return index;
            }
        }
        return arr.length;
    }
}
