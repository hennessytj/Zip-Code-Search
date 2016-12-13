import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;

public class LinkedST
{
    private Node first;
    
    private class Node
    {
        String key;
        String val;
        Node next;
        public Node(String key, String val, Node next)
        {
            this.key = key;
            this.val = val;
            this.next = next;
        }
    }
    
    public String get(String key)
    {
        for (Node curr = first; curr != null; curr = curr.next)
            if (key.equalsIgnoreCase(curr.key)) return curr.val;
        return null;
    }
    
    public void put(String key, String val)
    {
        // empty list
        if (first == null)
        {
            first = new Node(key, val, null);
            return;
        }
        // list not empty, key in list?
        for (Node curr = first; curr != null; curr = curr.next)
            if (key.equalsIgnoreCase(curr.key)) 
            {
                curr.val = val;
                return;
            }
        // key not in list, add to list
        first = new Node(key, val, first);
    }
    
    public void printST()
    {
        for (Node curr = first; curr != null; curr = curr.next)
            System.out.println(curr.key + " " + curr.val);
    }
    
    public static void main(String[] args) 
    {
        In ifs = new In("/Users/Hennessy/STTestInput");
        LinkedST lst = new LinkedST();
        // Update to work with String value instead
        // of int
        /*
        while (!ifs.isEmpty())
        {
            String nextKey = ifs.readString();
            System.out.println(nextKey);
            int nextValue = ifs.readInt();
            System.out.println(nextValue);
            lst.put(nextKey, nextValue);
        }
        lst.printST();
        while (true)
        {
            System.out.print("\nEnter key to search for: ");
            String searchString = StdIn.readString();
            System.out.println("\nvalue = " + lst.get(searchString));
        }
        */
    }
}