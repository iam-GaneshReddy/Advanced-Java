package Youtube.abhishekverma.Generics.demo1;

public class Demo {
    public static void main(String[] args) {
        Book book1=new Book(1,"master");
        Book book2=new Book(2,"blaster");

        Laptop laptop1=new Laptop(1,"dell");
        Laptop laptop2=new Laptop(2,"hp");

        ObjectRecord<Book> bookRecord=new ObjectRecord<>();

        bookRecord.addItems(book1);
        bookRecord.addItems(book2);
        Book b=bookRecord.getItem(0);//no -cast needed by using generics

        System.out.println(bookRecord.getItem(0));

        ObjectRecord<Laptop> laptopRecord=new ObjectRecord<>();
        laptopRecord.addItems(laptop1);
        laptopRecord.addItems(laptop2);

        ObjectRecord<Object>  record=new ObjectRecord<>();
        record.addItems("java");
       record.addItems("java");
       System.out.println(record.getItem(0));
    }
}
