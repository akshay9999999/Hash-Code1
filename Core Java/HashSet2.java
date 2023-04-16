import java.util.HashSet;
import java.util.Iterator;
class Bike
{
	String brand;	int cc;
	Bike(String brand,int cc)
	{
		this.brand = brand;
		this.cc = cc;
	}
	@Override
	public String toString()
	{
		return "Bike Brand:"+brand+", cc:"+cc;
	}
	@Override
	public boolean equals (Object o)
	{
		Bike temp = (Bike) o;
		if(this.brand.equals(temp.brand) && this.cc == temp.cc)
		{
			return true;
		}
		return false;
	}
	@Override
	public int hashCode()
	{
		return brand.hashCode()+((Integer)cc).hashCode();
	}
}
class HashSet2
{
	public static void main(String []args)
	{
		HashSet hs = new HashSet();
		hs.add(new Bike("Yamaha RX100",100));
		hs.add(new Bike("Yamaha RX100",100));
		hs.add(new Bike("Kawasaki Ninja",1200));
		System.out.println(hs);
	}
}