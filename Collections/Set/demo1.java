package Youtube.abhishekverma.Collections.Set;
import java.util.*;
public class demo1 {

        public static void main(String[] args) {
            Set<String> hashSet = new HashSet<>();  //random order
            hashSet.add("Java");
            hashSet.add("is");
            hashSet.add("good");
            hashSet.add("You");
            hashSet.add("should");
            hashSet.add("learn");
            hashSet.add("this");
            System.out.println("Contents of HashSet are: " + hashSet);

            Set<String> linkedHashSet = new LinkedHashSet<>(); //insertion order
            linkedHashSet.add("Java");
            linkedHashSet.add("is");
            linkedHashSet.add("good");
            linkedHashSet.add("You");
            linkedHashSet.add("should");
            linkedHashSet.add("learn");
            linkedHashSet.add("this");
            System.out.println("Contents of LinkedHashSet are: " + linkedHashSet);

            Set<String> treeSet = new TreeSet<>();//sort based on ascii values
            treeSet.add("Java");
            treeSet.add("is");
            treeSet.add("good");
            treeSet.add("You");
            treeSet.add("should");
            treeSet.add("learn");
            treeSet.add("this");
            System.out.println("Contents of TreeSet are: " + treeSet);
        }
    }

