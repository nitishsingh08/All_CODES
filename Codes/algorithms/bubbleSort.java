import java.util.Arrays;

import java.util.Arrays;

public class bubbleSort {
    public static void main(String[] args) {
        int [] arr={3,2,7,10,8,4,0,1,6,5};
        bubbleSort(arr,0,arr.length-1);

        System.out.println(Arrays.toString(arr));
    }
    public static void bubbleSort(int [] arr,int c, int r){
        if(r==0){
            return;
        }
        if (c<r){
            if(arr[c]>arr[c+1]){
                swap(arr,c,c+1);
            }
            bubbleSort(arr,c+1,r);

        } else {
            bubbleSort(arr,0,r-1);
        }
    }
    public static void swap(int arr[],int r, int c){
        int temp=arr[c];
        arr[c]=arr[r];
        arr[r]=temp;
    }
}
