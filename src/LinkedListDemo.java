import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {

        ArrayList l = new ArrayList();
        l.add(1);
        l.add(2);
        l.add(3);


        LinkedList list = new LinkedList(l);
        list.add("Nikesh");
        list.add("Sara");
        list.add("Ishika");
        list.add(56.89);
        list.add(345);
        list.add("Khushi");
        list.add("Tanmay Batt");
        list.add('a');
        list.add(null);
        list.add(null);
        System.out.println(list);
        list.addFirst("Rimy");
        list.add("Nikesh Patel");
        System.out.println(list);
        list.removeFirst();
        list.removeLast();
        System.out.println(list.getFirst());
        System.out.println(list);
    }
}
