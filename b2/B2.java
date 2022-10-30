package b2;
import java.util.Scanner;
import java.util.Arrays;
public class B2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long a,b,c,d;
        System.out.println("nhap 4 số nguyen a,b,c,d: ");
        a =sc.nextLong();
        b =sc.nextLong();
        c =sc.nextLong();
        d =sc.nextLong();
        if(a== b && b == c && c== d ){
            System.out.println("Khong ton tai so lon thu hai");
        }
        long[] m={(int) a,b,c,d};
        Arrays.sort(m);
        System.out.println(m[2]);

    }
}