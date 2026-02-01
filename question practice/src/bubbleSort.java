import java.util.Arrays;

public class bubbleSort {
    public static void main(String[] args) {
        int [] arr={3,2,7,10,8,4,0,1,6,5};
        bubbleSortNormal(arr);

        System.out.println(Arrays.toString(arr));
        System.out.println();
    }
    public static void bubbleSortNormal(int [] arr){
        boolean isSorted;
        for (int i =0;i<arr.length;i++){
           isSorted= false;
           for (int j=1;j<arr.length-i;j++){
               if (arr[j]<arr[j-1]){
                   int temp=arr[j];
                   arr[j]=arr[j-1];
                   arr[j-1]=temp;
                   isSorted = true;
               }
           }
            if(!isSorted){
                break;
            }
        }

    }
}
