package B2;

import java.util.Scanner;

public class b2 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        int dem = 0;
        for(int i=0; i<str2.length(); i++){
            for(int j = i+1; j<str2.length(); j++){
                if(str1.contains(str2.substring(i, j))){
                    dem =Math.max(dem,j-i);
                }
            }
        }
        System.out.println(dem+1);
    }
}
