package b3;

import java.util.Scanner;

public class B3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            }

        // 1 3 4 2 5 6 8 0 2
        // 0 1 2 2 3 4 5 6 8
        int  l = 1, max =0 ;
        for(int i=1; i< n; i++){
            if(arr[i] <arr[i-1] ){
                l = 0;
            }
            l++;
            if(l > max){
                max = l;
            }
        }
        System.out.println(max);
    }
}
