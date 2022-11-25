package B3;

import java.util.Scanner;

public class b3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chuoi:");
        String str = sc.nextLine();
        int dem = 0;
        double sum = 0.0;
        for (int i = 0; i < str.length(); i++){
            int x = str.charAt(i);
            if ((int)'0' <= x && x <= (int)'9'){
                sum += x - (int)'0';
                dem++;
            }
        }

        if (dem == 0)
            System.out.println("false");
        else{
            System.out.println("true\n" + sum/dem);
        }
    }
}