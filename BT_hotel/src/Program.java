import java.util.ArrayList;
import java.util.Scanner;

public class Program {
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Hotel> hotels = new ArrayList<>();
    static Person person = new Person();

    public static void addHotel() {
        Hotel hotel = new Hotel();
        try {
            hotel.setPerson(person.addPerson());

            System.out.println("Nhập ngày trọ");
            int dateHotel = Integer.parseInt(scanner.nextLine());
            hotel.setDateHotel(dateHotel);

            System.out.println("Nhập loại phòng");
            String categoryHotel = scanner.nextLine();
            hotel.setCategoryHotel(categoryHotel);

            System.out.println("Nhập giá phòng");
            double priceHotel = Double.parseDouble(scanner.nextLine());
            hotel.setPriceHotel(priceHotel);

            hotels.add(hotel);
        } catch (Exception e
        ) {
            System.out.println("!!!!Bạn nhập sai mời nhập lại!!!!");
        }
    }

    public static void showHotel() {
        System.out.printf("\n%-20s%-20s%-20s%-20s%-20s%-20s"
                , "Tên khách thuê"
                , "Ngày sinh"
                , "Số chứng minh thư"
                , "Ngày trọ"
                , "Loại phòng"
                , "Giá phòng");
        for (Hotel hotel : hotels) {
            System.out.printf("\n%-20s%-20s%-20s%-20s%-20s%-20s"
                    , hotel.getPerson().getName()
                    , hotel.getPerson().getDate()
                    , hotel.getPerson().getId()
                    , hotel.getDateHotel()
                    , hotel.getCategoryHotel()
                    , hotel.getPriceHotel()+ "vnđ");
        }
    }

    public void deleteHotel() {
        System.out.println("Nhập id khách thuê");
        try {
            String id = scanner.nextLine();
            for (int i = 0; i < hotels.size(); i++) {
                if (id.equals(hotels.get(i).getPerson().getId())) {
                    System.out.println(hotels.remove(i));
                    i--;
                }
            }
        } catch (Exception e) {
            System.out.println("!!!!Bạn nhập sai mời nhập lại!!!!");
        }
    }

    public static void searchHotel() {
        System.out.println("Nhập id khách thuê");
        try {
            String id = scanner.nextLine();
            for (Hotel hotel : hotels) {
                if (id.equals(hotel.getPerson().getId())) {
                    System.out.println("-----------Thông tin khách thuê-----------");
                    System.out.printf("\n%-20s%-20s%-20s%-20s%-20s%-20s"
                            , "Tên khách thuê"
                            , "Ngày sinh"
                            , "Số chứng minh thư"
                            , "Ngày trọ"
                            , "Loại phòng"
                            , "Giá phòng");
                    System.out.printf("\n%-20s%-20s%-20s%-20s%-20s%-20s"
                            , hotel.getPerson().getName()
                            , hotel.getPerson().getDate()
                            , hotel.getPerson().getId()
                            , hotel.getDateHotel()
                            , hotel.getCategoryHotel()
                            , hotel.getPriceHotel() + "vnđ");
                }
            }
        } catch (Exception e) {
            System.out.println("!!!!Bạn nhập sai mời nhập lại!!!!");
        }
    }

    public static void billHotel() {
        System.out.println("Nhập id khách thuê: ");
        String id = scanner.nextLine();
        for (Hotel hotel : hotels) {
            if (id.equals(hotel.getPerson().getId())) {
                System.out.println("----------Thông tin khách thuê-----------");
                System.out.printf("\n%-20s%-20s%-20s%-20s%-20s%-20s%-20s"
                        , "Tên khách thuê"
                        , "Ngày sinh"
                        , "Số chứng minh thư"
                        , "Ngày trọ"
                        , "Loại phòng"
                        , "Giá phòng"
                        , "Thanh toán");
                System.out.printf("\n%-20s%-20s%-20s%-20s%-20s%-20s%-20s"
                        , hotel.getPerson().getName()
                        , hotel.getPerson().getDate()
                        , hotel.getPerson().getId()
                        , hotel.getDateHotel()
                        , hotel.getCategoryHotel()
                        , hotel.getPriceHotel() + "vnđ"
                        , hotel.getTotal() + "vnđ");
            }
        }
    }
}


