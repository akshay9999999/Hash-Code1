import java.util.HashSet;
import java.util.Iterator;
class HashSet1
{
	public static void main(String[]args)
	{
		HashSet hs = new HashSet();
		hs.add(1);
		hs.add(1);
		hs.add("Hello");
		hs.add(561);
		hs.add('c');
		hs.add('c');
		System.out.println("\n Elements");
		System.out.println(hs);
		System.out.println("\n Iterator to access Elements");
		Iterator i =hs.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		System.out.println("\n for each to access elements");
		for(Object e1:hs)
		{
			System.out.println(e1);
		}
	}
}		