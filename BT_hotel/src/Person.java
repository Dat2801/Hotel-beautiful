import java.util.Scanner;

public class Person {

    private String name;
    private String date;
    private String id;

    public Person(){}

    public Person(String name, String date,String id) {
        this.name = name;
        this.date = date;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getId() {
        return id;
    }

    public void setId(String  id) {
        this.id = id;
    }

    public Person addPerson() {
        Scanner scanner = new Scanner(System.in);
        Person person = new Person();

        System.out.println("Nhập tên người thuê");
        String name = scanner.nextLine();
        person.setName(name);

        System.out.println("Nhập ngày sinh người thuê");
        String date = scanner.nextLine();
        person.setDate(date);

        System.out.println("Nhập chứng minh thư");
        String id = scanner.nextLine();
        person.setId(id);
        return person;
    }

    @Override
    public String toString() {
        return
                "Tên khách thuê: " + name + '\n' +
                "Ngày sinh: " + date + "\n"+
                "Chứng minh thư: " + id + "\n"
                ;
    }
}
