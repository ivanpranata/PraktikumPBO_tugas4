package Tugasprak4;

public class DemoBalokKubus {

	public static void main(String[] args) {
		BalokKubus BK = new BalokKubus (2,3,5);
		BalokKubus BK1 = new BalokKubus (2);
		
		System.out.println ("Pengisian 1 parameter menghasilkan volume dan luas permukaan kubus");
		System.out.println ("Volume Kubus : "+BK1.Volume());
		System.out.println ("Luas Permukaan Kubus : "+BK1.LuasPermukaanKubus());
		
		System.out.println ("engisian 3 parameter menghasilkan volume dan luas permukaan Balok");
		System.out.println ("Volume Balok : "+BK.Volume());
		System.out.println ("Luas Permukaan Balok : "+BK.LuasPermukaanBalok());
		

	}

}
