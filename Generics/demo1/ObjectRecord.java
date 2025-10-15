package Youtube.abhishekverma.Generics.demo1;

import java.util.Objects;

public class ObjectRecord<E> {
    private E[] items;

    public ObjectRecord(){
        this.items=(E[]) new Object[10];
    }
    public void addItems(E item){
        for(int i=0;i<items.length;i++){
            if(Objects.isNull(items[i])) {
                items[i] = item;
                break;
            }
        }
    }
    public E getItem(int index){
        if(index<items.length)
            return items[index];
        else
            return null;
    }

}
