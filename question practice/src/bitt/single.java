package bitt;

public class single {
    public static void main(String[] args) {
        int arr [] = {2,2,3,4,5,4,5,6,6};
        System.out.println(ret(arr));
    }
    public static int ret(int [] arr){
        int un = 0;
        for(int num : arr){
            un= un^num;
        }
        return un;
    }
}
