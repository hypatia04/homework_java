package cau2;

import java.io.PrintStream;
import java.util.Scanner;

public class main {
    public static void main( String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhap vao so luong xe: ");
        int n;
        n =sc.nextInt();
        car[] xe= new car[n];
        for(int i=0; i<n; i++){
            xe[i] =new car();
            xe[i].input();
        }
        PrintStream printf = System.out.printf("%-20s %-20s %-20s %-20s %-20s %-20s\n","chủ xe", "tên xe", " hãng xe", "giá mua", "năm mua", "giá trị hiện tại");
        for(int i=0; i<n; i++){
            xe[i].output();
        }
        System.out.println("\nkiem tra gia tri xe");
        for(int i=0; i<n; i++){
            System.out.println("\nxe "+ i+ ": ");
            xe[i].output2();
        }
    }
}
