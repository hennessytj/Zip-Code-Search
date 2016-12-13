import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;

public class ZipCodeSearch
{
    public static void main(String[] args)
    {
        In ifs = new In("/Users/Hennessy/Hash Tables/Separate Chaining/zip_code_database.csv");
        SeparateChainingHT table = new SeparateChainingHT(10007);
        // First line of file contains column display information
        // it is unnecessary -> throw away
        String str = ifs.readLine();
        // store each line in hash table
        while ((str = ifs.readLine()) != null)
        {
            String[] line = str.split(",");
            String value = "";
            for (int i = 1; i < line.length; i++)
                value += " " + line[i];
            table.put(line[0], value);
        }
        
        while (true)
        {
            System.out.println("Enter zip: ");
            String zc = StdIn.readString();
            System.out.println(zc + " info: " + table.get(zc));
        }
    }
}