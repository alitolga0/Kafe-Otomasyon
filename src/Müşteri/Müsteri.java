package M��teri;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class M�steri {

	int masano;
	String siparis;
	double hesap;
	
	
	
	public static void siparisal() throws FileNotFoundException {
		Masalar m = new Masalar ();
		Scanner scan = new Scanner(System.in);
		System.out.println("masa no ka�");
		int c =scan.nextInt();
		if(c==1) {
			Men�.Menn.masa();
			
		}else if (c==2) {
			M��teri.Masalar.masa2();
			
		}else if (c==3) {
			M��teri.Masalar.masa3();
		}else if (c==4) {
			M��teri.Masalar.masa4();
		}
		else {
			M��teri.Masalar.masa5();
	}
	}
}

	
	

