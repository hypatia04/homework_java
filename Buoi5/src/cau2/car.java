package cau2;

import java.io.PrintStream;
import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;

public class car {
    private String person;
    private String name;
    private String brand;
    private long cost;
    private int year;

    public String getPerson() {
        return person;
    }

    public void setPerson(String person) {
        this.person = person;
    }

    public  String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public long getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }


    public void input(){
        Scanner sc= new Scanner(System.in);
        System.out.println(" Nhập tên chủ xe: ");
        person = sc.nextLine();

        System.out.println("Nhập tên xe: ");
        name = sc.nextLine();

        System.out.println("Nhập hãng xe: ");
        brand =sc.nextLine();

        System.out.println("Nhập giá xe: ");
        cost = sc.nextLong();

        System.out.println(" Nhập năm mua xe: ");
        year = sc.nextInt();
    }
    public float percent() {
        if (cost < 1000000000) {
            return (float) 0.07;
        }
        if (cost > 1000000000 && cost < 2000000000) {
            return (float) 0.05;
        }

        if (cost > 2000000000) {
            return (float) 0.03;
        }
        return 0;

    }
    public void output(){
        final PrintStream printf = System.out.printf("%-20s %-20s %-20s %-20f %-20d %-20f\n", getPerson(), getName(), getBrand(),(float) getCost(), getYear(), cost - percent()*cost*(2022 -getYear()));

    }
    public void output2(){
        if(cost - percent()*cost*(2022 -getYear()) < 0){
            System.out.println("Xe nay da het gia tri!");
        }else{
            System.out.println("con gi tri!");
        }
    }




}


