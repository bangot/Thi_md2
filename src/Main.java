import java.io.Serializable;
import java.util.Scanner;

public class Main implements Serializable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Manager manager = new Manager();
        int cases = 0;
        do {

            System.out.println("quan ly danh ba ");
            System.out.println("chon chuc nang");
            System.out.println("1 : them moi danh ba");
            System.out.println("2 : xem danh ba");
            System.out.println("3 : xoa");
            System.out.println("4 : tim kiem ");
            System.out.println("5 : sua thong tin");
            System.out.println("6 : thoat ");
            try {
                cases = Integer.parseInt(sc.nextLine());
                switch (cases) {
                    case 1:
                        manager.addInfos();
                        break;
                    case 2:
                        manager.show();
                        break;
                    case 3:
                        manager.delete();
                        break;
                    case 4:
                        manager.search();
                        break;
                    case 5:
                        manager.edit();
                        break;
                }
            } catch (Exception e) {
                System.out.println("nhap lai  ");
            }
        } while (cases != 6);
    }

}
