package B1;

import java.util.Scanner;
import java.lang.String;

public class b1 {
    public static void main(String[] args){
        Scanner sc=new  Scanner(System.in);
        String str= sc.nextLine();
        int[] arr = new int[200];
        for(int i=0; i< str.length(); i++){
            arr[str.charAt(i)]++;
        }
        for(int i=0; i<str.length(); i++){
            if(arr[str.charAt(i)] != 0 && str.charAt(i) !=' '){
                System.out.println(str.charAt(i)+ ": " + arr[str.charAt(i)]);
                arr[str.charAt(i)] = 0;
            }
        }
    }
}
