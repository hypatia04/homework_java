package cau1;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println(" Nhap n nhan vien: ");
        int n = sc.nextInt();
        sc.nextLine();

        employee[] nhanvien = new employee[n];

        for (int i = 0; i < n; i++) {
            nhanvien[i] = new employee();
            nhanvien[i].input();
        }

        System.out.printf("%-20s %-20s %-20s %-20s %-20s %-20s %-20s %-20s\n"
                        , "Ma id", "Ho ten", " kieu nhan vien ", " So ngay lam ", " nam vao lam ", " luong"
                , "Phu cap", "Tong tien");
        for(int i=0; i < n; i++){
            nhanvien[i].output();
        }
    }

}