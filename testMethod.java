import java.util.Iterator;

public class testMethod {
    public static void main (String[] args){
        Bag<Integer> mybag = new Bag<Integer>();
        mybag.add(10);
        mybag.add(20);
        mybag.add(30);

        Iterator it = mybag.iterator();
        while(it.hasNext())
            System.out.println(it.next());
    }
}
