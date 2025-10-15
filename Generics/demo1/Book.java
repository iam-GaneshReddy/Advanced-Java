package Youtube.abhishekverma.Generics.demo1;

public class Book {
    private int id;
    private String name;
    public Book(int id, String name) {
        super();
        this.id = id;
        this.name = name;
    }
    @Override
    public String toString() {
        return "Book [id=" + id + ", name=" + name + "]";
    }
}
