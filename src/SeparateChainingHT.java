import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.In;

public class SeparateChainingHT
{
    private int M;
    private LinkedST[] lst;
    
    public SeparateChainingHT()
    { this(997); }
    
    public SeparateChainingHT(int sz)
    {
        if (sz < 1) return;
        M = sz;
        lst = new LinkedST[sz];
        for (int i = 0; i < sz; i++)
            lst[i] = new LinkedST();
    }
    
    private int hash(String x)
    { return (x.hashCode() & 0x7fffffff) % M; }
    
    public String get(String key)
    { return lst[hash(key)].get(key); }
    
    public void put(String key, String val)
    { lst[hash(key)].put(key, val); }
    
    // print
    
    public static void main(String[] args)
    {
        In ifs = new In("/Users/Hennessy/Hash Tables/Separate Chaining/in1");
        SeparateChainingHT test = new SeparateChainingHT();
        // Update to work with String value instead of int
        /*
        while (!ifs.isEmpty())
        {
            test.put(ifs.readString().toLowerCase(), ifs.readInt());
        }
        while (true)
        {
            System.out.println("Search: ");
            String s = StdIn.readString();
            System.out.println(s + " value is " + test.get(s));
        }
        */
    }
}