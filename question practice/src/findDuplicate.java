public class findDuplicate {
    public static void main(String[] args) {
        int [] arr={3,2,7,10,8,9,4,1,6,5,5};
        System.out.println(duplicates(arr));
    }
    public static int duplicates(int[] arr){

        int i=0;

        while(i<arr.length){
            int correctIndex=arr[i]-1;
           if (arr[i]!=i+1){
             //  int correctIndex=arr[i]-1;
               if(arr[i]!=arr[correctIndex]){
                   swap(arr,i,correctIndex);
               } else {
                   return arr[i];
               }
           } else {
               i++;
           }
        }
        return -1;
    }

    public static void swap(int []arr,int i, int correctIndex){
        int temp= arr[i];
        arr[i]=arr[correctIndex];
        arr[correctIndex]=temp;
    }
}
