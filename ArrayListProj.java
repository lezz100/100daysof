import java.util.ArrayList;

public class ArrayListProj {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Hello");
        list.add("World");
        list.add("Java");
        list.add("Programming");

        // Print the elements in the ArrayList
        for (String str : list) {
            System.out.println(str);
        }

        // Remove an element from the ArrayList
        list.remove("World");

        // Print the elements after removal
        System.out.println("After removal:");
        for (String str : list) {
            System.out.println(str);
        }
    }
}
