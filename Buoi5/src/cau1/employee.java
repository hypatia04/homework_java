package cau1;

import java.io.PrintStream;
import java.util.Scanner;

public class employee {

    private Scanner sc = new Scanner(System.in);
    private int id;
    private String hoTen;
    private String kieuNhanVien;
    private int soNgayLam;
    private int namVaoLam;
    private int phuCap;

    public int getId() {
        return id;
    }

    public String getHoTen() {
        return hoTen;
    }

    public String getKieuNhanVien() {
        return kieuNhanVien;
    }

    public int getSoNgayLam() {
        return soNgayLam;
    }

    public int getNamVaoLam() {
        return namVaoLam;
    }

    public int getPhuCap() {
        return phuCap;
    }

    public void input(){

        System.out.println(" Nhap ma id: ");
        id = sc.nextInt();
        sc.nextLine();

        System.out.println(" Nhap hoTen: ");
        hoTen =sc.nextLine();

        do{
            System.out.println(" Nhap kieu nhan vien(sx or vp): ");
            kieuNhanVien = sc.nextLine();
        }while(!(kieuNhanVien.equals("sx") || kieuNhanVien.equals("vp")));

        System.out.println(" Nhap so ngay lam: ");
        soNgayLam =sc.nextInt();

        System.out.println("Nhap nam vao lam: ");
        namVaoLam =sc.nextInt();
        sc.nextLine();

       phuCap = 100000 + (2022-namVaoLam) * 200000;
    }

    public int tinhLuong(){
        if(kieuNhanVien.equals("sx")) {
            return 350000 * soNgayLam;
        }
        else if(kieuNhanVien.compareTo("vp") == 0) {
            return 400000 * soNgayLam;
        } else return 0;
    }
    public void output(){
        final PrintStream printf = System.out.printf("%-20d %-20s %-20s %-20d %-20d %-20s %-20d %-20d\n"
                , getId(), getHoTen(), getKieuNhanVien(), getSoNgayLam(), getNamVaoLam(),
                tinhLuong(), getPhuCap(), tinhLuong() + getPhuCap());
    }
}
