public class diagonalSum {
    public static void main(String[] args) {
        int [][] arr ={{1,2,3},
                       {4,5,6},
                       {7,8,9}};
        int ans = sum(arr);
        System.out.println(ans);
    }
    public static int sum(int [][] arr){
        int sum=0;
        for (int i =0; i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if (i==j || i+j==arr.length-1){
                    sum =sum+ arr[i][j];
                }
            }
        }
        return sum;
    }
}
