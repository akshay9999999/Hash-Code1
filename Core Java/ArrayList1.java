// Converting ArrayList to Hashset (Duplicate to unique)
import java.util.*;
class ArrayList1
{
	public static void main(String[]args)
	{
		ArrayList l1 = new ArrayList();
		l1.add(1);
		l1.add(1);
		l1.add(2);
		l1.add("Hello");
		l1.add("Hello");
		l1.add(100);
		System.out.println("Origional ArrayList"+l1);
		HashSet hs = new HashSet(l1);
		l1 = new ArrayList(hs);
		System.out.println("Unique ArrayList"+l1);
	}
}