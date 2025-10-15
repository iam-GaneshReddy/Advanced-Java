package Youtube.abhishekverma.Generics.demo0;

import java.util.Objects;

public class BookRecord {
    private Book[] items;
    public BookRecord(){
        this.items=new Book[10];
    }
    public void addBook(Book item )
    {
        for(int i=0;i<items.length;i++) {
            if (Objects.isNull(items[i]))
            {
                items[i]=item;
                break;
            }
        }
    }
    public Book getBook(int index ){
        if(index<items.length)
            return items[index];
        else
            return null;
    }
}
