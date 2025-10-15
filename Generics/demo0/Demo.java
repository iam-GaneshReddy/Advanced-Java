package Youtube.abhishekverma.Generics.demo0;

public class Demo {
    public static void main(String[] args) {
        Book book1=new Book(1,"ganesh");
        Book book2=new Book(2,"Hanish");

        BookRecord bookRecord=new BookRecord();
        bookRecord.addBook(book1);
        bookRecord.addBook(book2);

        Book book=bookRecord.getBook(1);
        System.out.println(bookRecord.getBook(3));

        Laptop laptop1=new Laptop(2,"dell");
        Laptop laptop2=new Laptop(2,"HP");

        LaptopRecord laptop=new LaptopRecord();

        laptop.addItem(laptop1);
        laptop.addItem(laptop2);
        System.out.println(laptop.getItem(1));
    }
}
