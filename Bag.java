import java.util.Iterator;

public class Bag <T> implements Iterable<T> {
    public Node<T> first;
    public int n; // size of the bag

    // helper class Node
    private static class Node<T>{
        public T item;
        public Node<T> next;
    }

    public Bag(){
        first=null;
        n = 0;
    }

    public boolean isEmpty(){
        return first == null;
    }

    public int size(){
        return this.n;
    }

    public void add (T item){
        Node<T> oldFirst = first;
        first = new Node<T>();
        first.item = item;
        first.next = oldFirst;
        n++;
    }

    // Returns an iterattor that interaates over the nodes of a bag
    public Iterator<T> iterator(){
        return new BagIterator(first);
    }

    private class BagIterator implements Iterator <T>{
        private Node <T> current;

        public BagIterator(Node<T> first){
            current = first;
        }

        public boolean hasNext() {
            if (current != null) return true;
            else return false;

        }

        public T next (){
            if (!hasNext()) return null;
            T item = current.item;
            current = current.next;
            return item;
        }
    }
}
