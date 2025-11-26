import java.util.Vector;

public class Vectors {
    public static void main(String[] args) {

        Vector v = new Vector();
        v.add("Nikesh");
        v.add(38753);
        v.addElement("Tanya");
        v.addElement("0");
        System.out.println(v);
        v.addFirst("Ishika");
        System.out.println(v);
        System.out.println(v.removeLast());
        System.out.println(v.firstElement());

    }
}
