package latihanMateri;

public class While {
	int cond;
	public While (int cond) {
		this.cond= cond;
	}
	
	
	public void Printloop() {
		int i = 0;
		while (i < cond){
			System.out.println(i);
			i++;
		}
		
	}
	
	
}
