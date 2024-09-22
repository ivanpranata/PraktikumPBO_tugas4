package Tugasprak4;

public class BalokKubus 
{
	double p,l,t;
	
	public BalokKubus(double p, double l, double t) 
		{
		this.p = p;
		this.l = l;
		this.t = t;
		}
	
	public BalokKubus(double p) 
		{
		this.p = p;
		this.l = p;
		this.t = p;
		}
	
		public double Volume()
		{
		return p*l*t;
		}

		public double LuasPermukaanBalok()
		{
		return 2*(p*t +  p*l + p*t);
		}
		public double LuasPermukaanKubus()
		{
		return 6*p*t;
		}
}
