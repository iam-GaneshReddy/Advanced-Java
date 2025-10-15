package Youtube.abhishekverma.Collections.List;

import java.util.Arrays;
import java.util.List;
//This list is backed by array
public class demo2 {
    public static void main(String[] args) {
        String [] array={"java","python","C"};
        List<String> list= Arrays.asList(array);
        list.set(1,"sql");
        for(String s:array) {
            System.out.print(s+" ");
        }

        //adding element,removal of element,clear the list is not allowed
    }
}
