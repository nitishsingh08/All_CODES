public class sum {
    public static void main(String[] args) {
        System.out.println();
    }
    public static int [] sumone(int [] digits){
     int num = digits(digits);
     int i =0;
     int [] arr={};
     while(num!=0){
        int rem = num%10;
        arr[i]=rem;
        num/=10;
     i++;
     }
     return arr;
    }
    public static int digits(int [] digits){
        int ans = 0;
        for (int i = 0; i < digits.length; i++) {
            ans = ans*10+digits[i];

        }
        return ans+1 ;
    }
}
