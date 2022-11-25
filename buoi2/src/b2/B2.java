package b2;

import java.util.Scanner;

public class B2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int kt = 1;
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0; i<n-1; i++) {
            if (arr[i+1] - arr[i] != 1){
                int k = arr[i+1] - arr[i];
                for(int j= 1; j < k; j++)
                System.out.println(arr[i]+j);
                kt = 0;
            }
        }
        if(kt == 1){
            System.out.println("YES");
        }
//        for(int i=0; i< n ; i++){
//            System.out.println(arr[i]);
//        }
    }
}
