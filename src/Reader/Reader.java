package Reader;

public class Reader {
    private String name;
    private int age;
    private String sex;

    public Reader(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSex() {
        return sex;
    }

    public void read(Book book) {
        System.out.println(name + " is reading " + book.getTitle());
        book.setCurrentPage(book.getCurrentPage() + 1);
        System.out.println(name + " is on page " + book.getCurrentPage());
    }
}
