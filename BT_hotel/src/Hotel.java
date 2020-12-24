public class Hotel {
    private int dateHotel;
    private String categoryHotel;
    private double priceHotel;
    private Person person;

    public Hotel(){}

    public Hotel(int dateHotel, String categoryHotel, double priceHotel, Person person) {
        this.dateHotel = dateHotel;
        this.categoryHotel = categoryHotel;
        this.priceHotel = priceHotel;
        this.person = person;
    }

    public int getDateHotel() {
        return dateHotel;
    }

    public void setDateHotel(int dateHotel) {
        this.dateHotel = dateHotel;
    }

    public String getCategoryHotel() {
        return categoryHotel;
    }

    public void setCategoryHotel(String categoryHotel) {
        this.categoryHotel = categoryHotel;
    }

    public double getPriceHotel() {
        return priceHotel;
    }

    public void setPriceHotel(double priceHotel) {
        this.priceHotel = priceHotel;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public double getTotal(){
        return (getDateHotel() * getPriceHotel());
    }

    @Override
    public String  toString() {
        return "--------Thông tin khách thuê--------"+ "\n" +
                person +
                "Số ngày thuê: " + dateHotel + "\n"+
                "Loại phòng: " + categoryHotel + "\n" +
                "Giá phòng: " + priceHotel
                ;

    }
}
