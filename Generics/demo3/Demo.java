package Youtube.abhishekverma.Generics.demo3;
//wild cards


import java.util.Arrays;
import java.util.List;
public class Demo {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4);
        List<Double> list2 = Arrays.asList(1.2, 1.4, 1.6);
        List<Number> list3 = Arrays.asList(1, 2, 3, 4, 5);
        List<String> list4 = Arrays.asList("ganesh", "reddy");
        print1(list1);
        print2(list1);
        print2(list3);
        print3(list1);
        print3(list2);
        print3(list3);

    }
        private static void print1(List<Integer> list)
        {
            System.out.println(list);
        }
        private static void print2(List<? super Integer> list)//wild cards
        {
            System.out.println(list);
        }
        private static void print3(List<? extends Number> list)//wild cards
        {
            System.out.println(list);
        }
        private static void print4(List<?> list)//wild cards
        {
            System.out.println(list);
        }



}
