
public class first {
	public static void main(String args[])
	{
		Basket b = new Basket();
		b.leather();
		b.max();
		b.umbrella();
		b.cigarette();
		b.honey();
	}
}
class Basket
{
	public int cost;
	public int gst;
	public int q;
	
	int leather()
	{
		this.cost =1100;
		this.gst = 18;
		this.q = 1;
		return cost,gst,q;
	}
	
	int umbrella()
	{
		this.cost =900;
		this.gst = 12;
		this.q = 4;
	}
	int cigarette()
	{
		this.cost =200;
		this.gst = 28;
		this.q = 3;
	}
	int honey()
	{
		this.cost =100;
		this.gst = 0;
		this.q = 2;
	}
	public int max()
	{
		System.out.println(cigarette.cost);
	}
}
