import java.util.Arrays;

public class searchLastAndStart {
    public static void main(String[] args) {
        int arr[]={2,4,4,4,4,4,4,4,6};
          int ans[]=finalAns(arr,4);

        System.out.println(Arrays.toString(ans));
    }
     public static int binarySearch(int [] arr,int target,boolean startIndex){
        int s=0;//start
        int e=arr.length-1;//end
        int ans=-1;
        while(s<=e){
            int m=s+(e-s)/2;//mid
            if (arr[m]<target){
                s=m+1;
            }
          else if (arr[m]>target){
                e=m-1;

            }else{
                ans=m;
                if (startIndex){
                    e=m-1;
                } else{
                    s=m+1;
                }
            }
        }

          return ans;
     }
     public static int[] finalAns(int arr[],int target){
        int [] ans={-1,-1};
        ans[0]=binarySearch(arr,target,true);
        ans[1]=binarySearch(arr,target,false);
        return ans;
     }

}
