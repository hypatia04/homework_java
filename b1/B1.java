package b1;

import java.util.Arrays;
import java.util.Scanner;

public class B1 {
    public static void main(String[] args ){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr= new int[n];
        for(int i=0; i< n ; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int x, dem ;
        for(int i=0; i<n; i++){
            dem =0;
            x=arr[i];
            for(int j=i; j<n; j++){
                if(arr[j] == x) dem++;
                else{
                    i = j-1;
                    break;
                }
            }
            System.out.println(x + " : " + dem);
        }
//        for(int i=0; i< n ; i++){
//            System.out.println(arr[i]);
//        }
    }
}
