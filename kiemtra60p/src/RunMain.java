import java.util.Scanner;

public class RunMain {
    public static void main(String[] args) {
        // TODO cau 1
        int x =0;
        int cnt = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chuỗi : ");
        String s= sc.nextLine();
        // (()))()
        // ((()))()()
        for(int i=0; i< s.length(); i++){
            if (s.charAt(i) == '(') {
                x++;
            }
            if (s.charAt(i) == ')') {
                x--;
            }
            if(x< 0){
                cnt++;
                x++;
            }
        }
        cnt += x;
        System.out.println(cnt);
        // TODO cau 2
        //taoMenu
        int c ;
        System.out.println("Chọn chức năng mong muốn(1-7): ");
        System.out.println("Add Honey : 1");
        System.out.println("Show all Honeys : 2");
        System.out.println("Delete Honey by id : 3");
        System.out.println("Edit Honey by id: 4");
        System.out.println("Add Favorite by honey id: 5");
        System.out.println("Sort Honey by name: 6");
        System.out.println("Exit : 7");
        c = sc.nextInt();
        switch (c){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:

        }

    }
}
