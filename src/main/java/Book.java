public class Book {

    private int id;
    private String name;
    private int yearOfPublishing;

    public Book(int id, String name, int yearOfPublishing) {
        this.id = id;
        this.name = name;
        this.yearOfPublishing = yearOfPublishing;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getYearOfPublishing() {
        return yearOfPublishing;
    }



}
