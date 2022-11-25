package B2;

import java.util.Scanner;

public class b22 {
    public static void main(){
        Scanner sc = new Scanner(System.in);
        String str1, str2;
        str1 =sc.nextLine();
        str2 =sc.nextLine();
        int dem =0;
        for(int i=0; i< str1.length(); i++){
            for(int j= i+1; j< str2.length(); j++){
                if(str1.contains(str2.substring(i, j))){
                    dem = Math.max(i,j);
                }
            }
        }
    }
}
