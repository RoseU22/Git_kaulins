import java.util.Random;

public class Cirks {

	static void mestKaulinu(){
		int skaitlis;
		Random rand = new Random();
		skaitlis = rand.nextInt(6)+1;
		System.out.println("UZkrita skaitlis: "+skaitlis);
	}
	
	public static void main(String[] args) {
		mestKaulinu();
	}
}