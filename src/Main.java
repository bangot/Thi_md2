import java.io.Serializable;
import java.util.Scanner;

public class Main implements Serializable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Manager business = new Manager();
        int cases = 0;
        do {

            System.out.println("quan ly danh ba ");
            System.out.println("chon chuc nang");
            System.out.println("1 : them moi danh ba");
            System.out.println("2 : xem danh bạ");
            System.out.println("3 : xoa");
            System.out.println("4 : tim kiem ");
            System.out.println("5 : sua thong tin");
            System.out.println("6 : thoat ");
            try {
                cases = Integer.parseInt(sc.nextLine());
                switch (cases) {
                    case 1:
                        business.addInfos();
                        break;
                    case 2:
                        business.show();
                        break;
                    case 3:
                        business.delete();
                        break;
                    case 4:
                        business.search();
                        break;
                    case 5:
                        business.edit();
                        break;
                }
            } catch (Exception e) {
                System.out.println("nhập lại  ");
            }
        } while (cases != 6);
    }

}
