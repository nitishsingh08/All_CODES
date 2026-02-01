public class maxAreaDiangonal {
    public static void main(String[] args) {
   int [][] arr = {
           {2,3},{4,5}
   };
        System.out.println(areaOfMaxDiagonal(arr));
    }
    public static int areaOfMaxDiagonal(int[][] dimensions) {
int sum=0, ans =0;
       for(var d :dimensions){
           int l = d[0], w= d[1];
           int sqr = l*l+w*w;
           if(sum<sqr){
               sum = sqr;
               ans = l*w;
           } else if(sqr == sum){
               ans = Math.max(ans , l*w);

           }

       }
       return ans;
    }
}
