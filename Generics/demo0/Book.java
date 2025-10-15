package Youtube.abhishekverma.Generics.demo0;

public class Book {
    private int id;
    private String name;

    public Book(int id,String name){
        this.id=id;
        this.name=name;

    }
    public String toString(){
        return "book {id-"+ id +"name-"+name+"}";
    }
}
