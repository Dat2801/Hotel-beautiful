import java.util.Scanner;

public class Main {
    static Program program = new Program();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        do {
            System.out.println("\n" + "-----Chức năng-----");
            System.out.println("1. Thêm khách thuê");
            System.out.println("2. Hiển thị khách thuê");
            System.out.println("3. Tìm kiếm khách thuê");
            System.out.println("4. Xóa khách thuê");
            System.out.println("5. Thanh toán phòng");
            System.out.println("6. Thoát");
            choice = Integer.parseInt(scanner.nextLine());

            switch (choice){
                case 1:
                    program.addHotel();
                    break;
                case 2:
                    program.showHotel();
                    break;
                case 3:
                    program.searchHotel();
                    break;
                case 4:
                    program.deleteHotel();
                    break;
                case 5:
                    program.billHotel();
                    break;
                case 6:
                    System.exit(0);
                    break;
            }
        }while (true);
    }
}
