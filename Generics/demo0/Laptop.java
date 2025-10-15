package Youtube.abhishekverma.Generics.demo0;

public class Laptop {
    private int id;
    private String name;

    public Laptop(int id,String name){
        this.id=id;
        this.name=name;
    }
    public String toString(){
        return "Laptop {id-"+id +"name-"+name+"}";
    }
}
