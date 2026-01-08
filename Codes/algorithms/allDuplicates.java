import java.util.ArrayList;
import java.util.List;

public class allDuplicates {
    public static void main(String[] args) {
        int [] arr={4,3,2,7,8,2,3,1};
        //   int [] arr={3,2,7,10,8,9,4,1,6,6,5,5};
        List<Integer> ans= dup(arr);
        System.out.println(ans);
    }
    public static List<Integer> dup(int [] arr){
        List<Integer> list= new ArrayList<>();
        int i=0;
        while(i<arr.length){
            int crt= arr[i]-1;
            if (arr[i]>=0&&arr[i]<=arr.length  &&arr[i] != arr[crt]) {
                swap(arr,i,crt);
            } else {
                i++;
            }
        }
        for(int index=0;index<arr.length;index++){
            if( arr[index]!=index+1&&!list.contains(arr[index])){
                list.add(arr[index]);
            }
        }
        return list;
    }
    public static void swap(int[] arr,int i, int crt){
        int temp=arr[i];
        arr[i]=arr[crt];
        arr[crt]=temp;
    }
}
